package com.hairbyjoyceline_marealle.hairbusiness.entity;

import com.hairbyjoyceline_marealle.hairbusiness.enums.PaymentMethod;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionStatus;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionType;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Transaction implements Serializable {
    private Long transac_id;
    private LocalDate transac_date;
    private double amount;
    private PaymentMethod paymentMethod;
    private hairService service;
    private Customer customer;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;


}
