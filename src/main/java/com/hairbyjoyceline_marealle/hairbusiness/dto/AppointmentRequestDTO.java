package com.hairbyjoyceline_marealle.hairbusiness.dto;

public record AppointmentRequestDTO(
        Long customerId,
        Long serviceId,
        String date
) {
}
