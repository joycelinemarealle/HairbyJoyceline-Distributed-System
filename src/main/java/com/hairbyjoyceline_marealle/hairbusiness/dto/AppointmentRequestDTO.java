package com.hairbyjoyceline_marealle.hairbusiness.dto;

import com.hairbyjoyceline_marealle.hairbusiness.enums.AppointmentStatus;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentRequestDTO(
        Long customerId,
        Long serviceId,
        LocalDate date,
        LocalTime time,
        AppointmentStatus appointmentStatus
) {
}
