package com.hairbyjoyceline_marealle.hairbusiness.service;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.AppointmentNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;

import java.util.List;

public interface AppointmentService {
    AppointmentDTO createAppointment(AppointmentRequestDTO createAppointmentDTO) throws CustomerNotFoundException;
    List<AppointmentDTO> retrieveAllAppointments();
    AppointmentDTO findAccountById(Long appointment_id) throws AppointmentNotFoundException;
    AppointmentDTO deleteAppointment(Long appointment_id) throws AppointmentNotFoundException;


}
