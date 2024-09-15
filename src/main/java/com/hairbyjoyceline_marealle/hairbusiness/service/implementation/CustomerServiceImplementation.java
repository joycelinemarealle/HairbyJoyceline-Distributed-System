package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.CustomerMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerServiceImplementation(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO) {
       //Map customerRequestDTO to Customer Entity
        Customer customer = CustomerMapper.toEntity(createCustomerDTO);

        // Save to database
        Customer savedCustomer = customerRepo.save(customer);

        //Map saved customer entity to customerDTO and return it
        return CustomerMapper.toDTO(savedCustomer);
    }

    @Override
    public List<CustomerDTO> retrieveAllCustomers() {
        return CustomerMapper.toDTO(customerRepo.findAll());
    }

    @Override
    public CustomerDTO findCustomerById(Long customer_id) throws CustomerNotFoundException {
        try{
            Optional<Customer> optionalCustomer= customerRepo.findById(customer_id);
         return CustomerMapper.toDTO(optionalCustomer.get());

        } catch (Exception e){
             throw new CustomerNotFoundException(customer_id)  ;
        }

    }

    @Override
    public CustomerDTO deleteCustomer(Long customer_id) throws CustomerNotFoundException {
        try {
            Optional<Customer> optionalCustomer = customerRepo.findById( customer_id);

            //unwrap -> to entity -> DTO
            return CustomerMapper.toDTO(optionalCustomer.get());

        }catch (Exception e){
            throw new CustomerNotFoundException(customer_id);
        }
    }
}
