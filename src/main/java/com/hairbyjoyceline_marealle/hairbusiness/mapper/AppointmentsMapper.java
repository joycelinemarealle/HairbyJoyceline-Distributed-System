package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepository;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairServiceRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AppointmentsMapper {
    public AppointmentsMapper(HairServiceRepository hairServiceRepository, CustomerRepository customerRepository) {
        this.hairServiceRepository = hairServiceRepository;
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;
    private final HairServiceRepository hairServiceRepository;

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
    //converts appointment request DTO to entity
    public  Appointment toEntity(AppointmentRequestDTO appointmentRequestDTO){
        Long customer_id = appointmentRequestDTO.customerId();
        Long hairService_id = appointmentRequestDTO.serviceId();

        //Fetch the customer and service entities //check if customer exists  + registered
        Customer customer = customerRepository.findById(customer_id).orElseThrow(() -> new CustomerNotFoundException(customer_id));
        HairService hairService = hairServiceRepository.findById(hairService_id).orElseThrow(() -> new HairServiceNotFoundException(hairService_id));
        return new Appointment(
                customer,
                hairService,
                appointmentRequestDTO.date(),
                appointmentRequestDTO.time(),
                appointmentRequestDTO.appointmentStatus());
    }

    //converts an entity to DTO
    public static AppointmentDTO toDTO (Appointment appointment){
        return new AppointmentDTO(
                appointment.getAppt_id(),
                appointment.getCustomer().getCustomer_id(),
                appointment.getHairService().getServ_id());
    }
}
