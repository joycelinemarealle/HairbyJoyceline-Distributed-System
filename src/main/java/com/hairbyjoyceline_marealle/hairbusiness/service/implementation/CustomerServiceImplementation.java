package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
//import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
//import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
//import com.hairbyjoyceline_marealle.hairbusiness.mapper.CustomerMapper;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepository;
import com.hairbyjoyceline_marealle.hairbusiness.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById (Long customer_id) throws CustomerNotFoundException {
        return customerRepository.findById(customer_id)
                .orElseThrow(() -> new CustomerNotFoundException( customer_id));
    }

//    @Override
//    public Optional<Customer> getCustomerById(Long customer_id) throws CustomerNotFoundException {
//        Optional<Customer> customer = customerRepository.findById(customer_id);
//        if (customer.isPresent()) {
//            return customer;
//        }else{
//            throw new CustomerNotFoundException(customer_id);
//        }
//
//    }

//    @Override
//    public Customer getCustomerById(Long customer_id) throws CustomerNotFoundException {
//        return customerRepository.findById(customer_id)
//                .orElseThrow(() -> new CustomerNotFoundException( customer_id));
//    }
}

//    public Customer getCustomerById(Long customer_id) {
//        Optional<Customer> customer = customerRepository.findById(customer_id);
//        return customer.orElseThrow(() -> new RuntimeException("Customer not found"));
////        return customerRepository.findById(customer_id).orElseThrow(() -> new RuntimeException("Customer not found"));
//    }


//    @Override
//    public CustomerDTO createCustomer(CustomerRequestDTO createCustomerDTO) {
//       //Map customerRequestDTO to Customer Entity
//        Customer customer = CustomerMapper.toEntity(createCustomerDTO);
//
//        // Save to database
//        Customer savedCustomer = customerRepository.save(customer);
//
//        //Map saved customer entity to customerDTO and return it
//        return CustomerMapper.toDTO(savedCustomer);
//    }
//
//    @Override
//    public List<CustomerDTO> retrieveAllCustomers() {
//
//        return CustomerMapper.toDTO(customerRepository.findAll());
//    }
//
//    @Override
//    public CustomerDTO findCustomerById(Long customer_id) throws CustomerNotFoundException {
//        Customer customer = customerRepository.findById(customer_id).orElseThrow(() -> new CustomerNotFoundException(customer_id));
//        return CustomerMapper.toDTO(customer);
//
//    }
//
//    @Override
//    public CustomerDTO deleteCustomer(Long customer_id) throws CustomerNotFoundException {
//        Customer customer = customerRepository.findById(customer_id).orElseThrow(() -> new CustomerNotFoundException(customer_id));
//        customerRepository.delete(customer);
//        return CustomerMapper.toDTO(customer);
//    }

