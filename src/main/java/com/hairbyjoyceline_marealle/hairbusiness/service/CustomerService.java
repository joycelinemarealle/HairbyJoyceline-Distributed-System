package com.hairbyjoyceline_marealle.hairbusiness.service;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerService  {
    CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO);
    List<CustomerDTO> retrieveAllCustomers();
    CustomerDTO findCustomerById(Long customer_id) throws CustomerNotFoundException;
    }