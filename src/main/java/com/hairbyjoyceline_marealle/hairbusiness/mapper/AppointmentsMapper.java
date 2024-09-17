package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.CustomerRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepo;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

public class AppointmentsMapper {
    //Convert appointment entity list to apt DTO
    public static List<AppointmentDTO> toDTO(List<Appointment> appointments){
      return appointments.stream()
               .map(appointment -> new AppointmentDTO(
                       appointment.getAppt_id(),
                       appointment.getCustomer().getCustomer_id(),
                       appointment.getHairService().getServ_id()
               ))
               .toList();

    }
//    //converts appointment request DTO to entity
//    public static Appointment toEntity(AppointmentRequestDTO appointmentRequestDTO){
//        Long customer_id = appointmentRequestDTO.customerId();
//        CustomerRepo customerRepo
//        Customer customer = customerRepo.findById(customer_id).orElseThrow(() -> new CustomerNotFoundException(customer_id));
//
//        return new Appointment(
//                customer,
//                appointmentRequestDTO.date(),
//                appointmentRequestDTO.time());
//    }

    //converts an entity to DTO
    public static AppointmentDTO toDTO (Appointment appointment){
        return new AppointmentDTO(
                appointment.getAppt_id(),
                appointment.getCustomer().getCustomer_id(),
                appointment.getHairService().getServ_id());
    }
}
