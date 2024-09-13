package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;

import java.util.List;

public class AppointmentsMapper {
    //Convert appointment entity list to appt DTO

    public static List<AppointmentDTO> appointmentMapper(List<Appointment> appointments){
      return appointments.stream()
               .map(appointment -> new AppointmentDTO(
                       appointment.getAppt_id(),
                       appointment.getCustomer().getCustomer_id(),
                       appointment.getHairService().getServ_id()
               ))
               .toList();


    }
}
