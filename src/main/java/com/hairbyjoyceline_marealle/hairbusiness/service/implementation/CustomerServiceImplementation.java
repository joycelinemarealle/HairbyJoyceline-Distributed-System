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
    private Customer customer;

    public CustomerServiceImplementation(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
//

    @Override
    public CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO) {
       //create customer the save to database
        Customer customer = new Customer ("Jojo", "jojo@gmail.com", 5855557892L);
        customerRepo.save(customer);
        return CustomerMapper.customerMapper(customer);
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
