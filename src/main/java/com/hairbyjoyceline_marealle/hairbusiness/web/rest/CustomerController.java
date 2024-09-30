package com.hairbyjoyceline_marealle.hairbusiness.web.rest;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin

public class CustomerController {
    private final CustomerService customerService;

    //constructor injection
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<CustomerDTO> getAllAccounts(){
        return customerService.retrieveAllCustomers();
    }

    @GetMapping("/{customer_id}")
    public CustomerDTO findCustomerById(@PathVariable Long customer_id){
        return customerService.findCustomerById(customer_id);
    }

    @GetMapping("/{customer_id}")
    public CustomerDTO deleteCustomer(@PathVariable Long customer_id){
        return customerService.deleteCustomer(customer_id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO){
       return customerService.createCustomer(customerRequestDTO);
    }
}
