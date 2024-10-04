package com.hairbyjoyceline_marealle.hairbusiness.controller;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@CrossOrigin
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<AppointmentDTO> retrieveAllAppointment(){
        return appointmentService.retrieveAllAppointments();
    }

    @GetMapping("/{appointment_id}")
    public AppointmentDTO findAppointmentById(@PathVariable Long appointment_id){
        return appointmentService.findAccountById(appointment_id);
    }

    @GetMapping("/{appointment_id}")
    public AppointmentDTO deleteAppointment(@PathVariable Long appointment_id){
        return appointmentService.deleteAppointment(appointment_id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AppointmentDTO createAppointment(AppointmentRequestDTO appointmentRequestDTO){
        return appointmentService.createAppointment(appointmentRequestDTO);
    }
}
