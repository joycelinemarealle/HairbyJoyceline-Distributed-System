package com.hairbyjoyceline_marealle.hairbusiness.dto;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import com.hairbyjoyceline_marealle.hairbusiness.enums.PaymentMethod;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionStatus;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionType;

import java.time.LocalDate;

public record TransactionDTO(
    Long transaction_id,
    LocalDate transaction_date,
    Double amount,
    PaymentMethod paymentMethod,
    HairServiceDTO hairServiceDTO, //existing dtos
    CustomerDTO customerDTO, //existing dtos
   TransactionType transactionType,
    TransactionStatus transactionStatus)
{}
