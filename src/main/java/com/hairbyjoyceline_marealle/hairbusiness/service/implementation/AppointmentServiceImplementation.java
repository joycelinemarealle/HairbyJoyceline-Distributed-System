package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.AppointmentRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.exception.AppointmentNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.AppointmentsMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.AppointmentRepo;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepo;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairServiceRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AppointmentServiceImplementation implements AppointmentService {

    private final AppointmentRepo appointmentRepo;
    private final CustomerRepo customerRepo;
    private final HairServiceRepo hairServiceRepo;

    public AppointmentServiceImplementation(AppointmentRepo appointmentRepo, CustomerRepo customerRepo, HairServiceRepo hairServiceRepo) {
        this.appointmentRepo = appointmentRepo;
        this.customerRepo = customerRepo;
        this.hairServiceRepo = hairServiceRepo;
    }

    @Override
    public AppointmentDTO createAppointment(AppointmentRequestDTO createAppointmentDTO) throws CustomerNotFoundException {
        //
//check if customer exists  + registered
        Long customer_id = createAppointmentDTO.customerId();
        Long service_id = createAppointmentDTO.serviceId();
        Customer customer = customerRepo.findById(customer_id).orElseThrow(() -> new CustomerNotFoundException(customer_id));
        //Create appointment
        Appointment appointment = new Appointment(customer, createAppointmentDTO.date(), createAppointmentDTO.time());

        //Save new appointnment to Database
        Appointment savedAppointment = (Appointment) appointmentRepo.save(appointment);
        return AppointmentsMapper.toDTO(savedAppointment);
    }

    @Override
    public List<AppointmentDTO> retrieveAllAppointment() {
        List<Appointment> appointments = appointmentRepo.findAll();
        return AppointmentsMapper.toDTO(appointments);

    }

    @Override
    public AppointmentDTO findAccountById(Long appointment_id) throws AppointmentNotFoundException {
        Appointment appointment = appointmentRepo.findById(appointment_id).orElseThrow(() -> new AppointmentNotFoundException(appointment_id));
        return AppointmentsMapper.toDTO(appointment);
    }

    @Override
    public AppointmentDTO deleteAppointment(Long appointment_id) throws AppointmentNotFoundException {

        Appointment appointment = appointmentRepo.findById(appointment_id).orElseThrow(() -> new AppointmentNotFoundException(appointment_id));
       appointmentRepo.delete(appointment);
        return AppointmentsMapper.toDTO(appointment);


    }
}

