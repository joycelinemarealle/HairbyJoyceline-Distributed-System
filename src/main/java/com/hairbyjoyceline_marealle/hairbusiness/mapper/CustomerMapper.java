package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import static com.hairbyjoyceline_marealle.hairbusiness.mapper.AppointmentsMapper.appointmentMapper;

public class CustomerMapper {
  //converts entity to a dto
  public static CustomerDTO customerMapper(Customer customer)  {
    return new CustomerDTO(
            customer.getCustomer_id(),
            customer.getName(),
          AppointmentsMapper.appointmentMapper(customer.getAppointments())); //need to convert each appointment from list entitiy to list DT


  }
}
