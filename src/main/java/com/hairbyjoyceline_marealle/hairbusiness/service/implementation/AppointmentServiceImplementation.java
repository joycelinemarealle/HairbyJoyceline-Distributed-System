package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService {
    @Override
    public AppointmentDTO createAppointment(AppointmentRequestDTO createAppointmentDTO) {
        return null;
    }

    @Override
    public List<AppointmentDTO> retrieveAllAppointment() {
        return List.of();
    }

    @Override
    public AppointmentDTO findAccountById(Long appointment_id) {
        return null;
    }
}
