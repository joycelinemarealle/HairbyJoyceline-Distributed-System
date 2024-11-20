package com.hairbyjoyceline_marealle.hairbusiness.controller;

//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*") //allows requests from Swagger host

public class CustomerController {
    private final CustomerService customerService;

    //constructor injection
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

//    @GetMapping("/{customer_id}")
//    public Customer findCustomerById(@PathVariable Long customer_id){
//        return customerService.findCustomerById(customer_id);
//    }



    @GetMapping("/{customer_id}")
    public Customer getCustomerById(@PathVariable Long customer_id){
        var result = customerService.getCustomerById(customer_id);
        return result;
    }
//    public ResponseEntity<BuildingResponseDTO> getBuildingById(@PathVariable Long id) {
//        BuildingResponseDTO response = buildingService.getBuildingById(id);
//        return ResponseEntity.ok(response);
//    }

    @GetMapping("")
    public String getName(){
        return "Hello Joyceline Marealle";
    }

    //@GetMapping
//    public List<CustomerDTO> getAllAccounts(){
//        return customerService.retrieveAllCustomers();
//    }

//    @GetMapping("/{customer_id}")
//    public CustomerDTO findCustomerById(@PathVariable Long customer_id){
//        return customerService.findCustomerById(customer_id);
//    }

//    @GetMapping("/{customer_id}")
//    public CustomerDTO deleteCustomer(@PathVariable Long customer_id){
//        return customerService.deleteCustomer(customer_id);
//    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public CustomerDTO createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO){
//       return customerService.createCustomer(customerRequestDTO);
//    }
}
