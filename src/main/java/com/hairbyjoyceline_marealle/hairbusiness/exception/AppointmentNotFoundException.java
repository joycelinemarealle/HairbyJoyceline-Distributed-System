package com.hairbyjoyceline_marealle.hairbusiness.exception;

public class AppointmentNotFoundException extends RuntimeException{
    public AppointmentNotFoundException(Long appointment_id){super ("Appointment with ["+ appointment_id+ "]not found");
    }
}
