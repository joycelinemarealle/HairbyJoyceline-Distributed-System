package com.hairbyjoyceline_marealle.hairbusiness.service;

//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;

import java.util.Optional;

public interface CustomerService  {
    Optional<Customer> getCustomerById(Long customer_id) throws CustomerNotFoundException;
//    CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO);
//    List<CustomerDTO> retrieveAllCustomers();
  //Customer getCustomerById(Long customer_id) throws CustomerNotFoundException;
   // Customer getCustomerById(Long customer_id) throws CustomerNotFoundException;
    //CustomerDTO findCustomerById(Long customer_id) throws CustomerNotFoundException;
//    CustomerDTO deleteCustomer (Long customer_id) throws CustomerNotFoundException;
    }