package com.hairbyjoyceline_marealle.hairbusiness.service;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;

import java.util.List;

public interface AppointmentService {
    AppointmentDTO createAppointment(AppointmentRequestDTO createAppointmentDTO);
    List<AppointmentDTO> retrieveAllAppointment();
    AppointmentDTO findAccountById(Long appointment_id) ;
    AppointmentDTO deleteAppointment(Long appointment_id);


}
