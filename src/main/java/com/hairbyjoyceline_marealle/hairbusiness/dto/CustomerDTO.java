package com.hairbyjoyceline_marealle.hairbusiness.dto;

import java.util.List;

public record CustomerDTO(
    Long customerId,
    String fullName,
    List<AppointmentDTO> appointments){
}
