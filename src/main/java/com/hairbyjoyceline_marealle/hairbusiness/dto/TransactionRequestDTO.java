package com.hairbyjoyceline_marealle.hairbusiness.dto;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import com.hairbyjoyceline_marealle.hairbusiness.enums.PaymentMethod;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionStatus;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionType;

import java.time.LocalDate;

public record TransactionRequestDTO(
        Double amount,
        PaymentMethod paymentMethod,
        Long hairService_id,
        Long customer_id,
        TransactionType transactionType)
{ }
