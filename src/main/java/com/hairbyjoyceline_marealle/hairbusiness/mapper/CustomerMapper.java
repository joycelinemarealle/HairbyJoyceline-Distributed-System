package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;

import java.util.List;

public class CustomerMapper {
  //converts entity to a dto
  public static CustomerDTO toDTO(Customer customer)  {
    return new CustomerDTO(
            customer.getCustomer_id(),
            customer.getfullName(),
          AppointmentsMapper.toDTO(customer.getAppointments())); //need to convert each appointment from list entitiy to list DT

  }

  //converts customer request DTO to entity
  public static Customer toEntity(CustomerRequestDTO customerRequestDTO){
    return new Customer (
            customerRequestDTO.name(),
            customerRequestDTO.email(),
            customerRequestDTO.phone());
  }

  //converts list of customer entities to list of dto
  public static List<CustomerDTO> toDTO(List<Customer> customers){
    return customers.stream()
            .map(customer -> new CustomerDTO(
                    customer.getCustomer_id(),
                    customer.getfullName(),
                   AppointmentsMapper.toDTO(customer.getAppointments())
            )).toList()
            ;

  }

}



