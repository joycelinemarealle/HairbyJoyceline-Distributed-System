package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.CustomerMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.CustomerService;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepo customerRepo;
    public CustomerServiceImplementation(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO) {
       //Map customerRequestDTO to Customer Entity
        Customer customer = new Customer(
                createCustomerDTO.name(),
                createCustomerDTO.email(),
                createCustomerDTO.phone()
        );
        // Save to database
        Customer savedCustomer = customerRepo.save(customer);

        //Map saved customer entity to customerDTO and return it
        return CustomerMapper.customerMapper(savedCustomer);
    }

    @Override
    public List<CustomerDTO> retrieveAllCustomer() {
        return List.of();
    }

    @Override
    public CustomerDTO findCustomerById(Long customer_id) throws CustomerNotFoundException {
        return null;
    }
}
