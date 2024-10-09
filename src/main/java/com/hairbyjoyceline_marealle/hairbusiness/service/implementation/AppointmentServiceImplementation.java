package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;
import com.hairbyjoyceline_marealle.hairbusiness.exception.AppointmentNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.AppointmentsMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.AppointmentRepository;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepository;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairStyleRepository;
import com.hairbyjoyceline_marealle.hairbusiness.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentServiceImplementation implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final CustomerRepository customerRepository;
    private final HairStyleRepository hairStyleRepository;
    AppointmentsMapper appointmentsMapper;

    public AppointmentServiceImplementation(AppointmentRepository appointmentRepository, CustomerRepository customerRepository, HairStyleRepository hairStyleRepository) {
        this.appointmentRepository = appointmentRepository;
        this.customerRepository = customerRepository;
        this.hairStyleRepository = hairStyleRepository;
    }

    @Override
    public AppointmentDTO createAppointment(AppointmentRequestDTO createAppointmentDTO) throws CustomerNotFoundException {
        //check if customer exists  + registered
        Appointment appointment = appointmentsMapper.toEntity(createAppointmentDTO);

        //Save new appointnment to Database
        Appointment savedAppointment = (Appointment) appointmentRepository.save(appointment);
        return AppointmentsMapper.toDTO(savedAppointment);
    }

    @Override
    public List<AppointmentDTO> retrieveAllAppointments() {
        List<Appointment> appointments = appointmentRepository.findAll();
        return AppointmentsMapper.toDTO(appointments);

    }

    @Override
    public AppointmentDTO findAccountById(Long appointment_id) throws AppointmentNotFoundException {
        Appointment appointment = appointmentRepository.findById(appointment_id).orElseThrow(() -> new AppointmentNotFoundException(appointment_id));
        return AppointmentsMapper.toDTO(appointment);
    }

    @Override
    public AppointmentDTO deleteAppointment(Long appointment_id) throws AppointmentNotFoundException {

        Appointment appointment = appointmentRepository.findById(appointment_id).orElseThrow(() -> new AppointmentNotFoundException(appointment_id));
       appointmentRepository.delete(appointment);
        return AppointmentsMapper.toDTO(appointment);


    }
}

