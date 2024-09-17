package com.hairbyjoyceline_marealle.hairbusiness.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentRequestDTO(
        Long customerId,
        Long serviceId,
        LocalDate date,
        LocalTime time
) {
}
