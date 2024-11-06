package com.hairbyjoyceline_marealle.hairbusiness.dto;

import com.hairbyjoyceline_marealle.hairbusiness.enums.PaymentMethod;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionType;

public record TransactionRequestDTO(
        Double amount,
        PaymentMethod paymentMethod,
        Long hairService_id,
        Long customer_id,
        TransactionType transactionType)
{ }
