package com.hairbyjoyceline_marealle.hairbusiness.entity;

import com.hairbyjoyceline_marealle.hairbusiness.enums.PaymentMethod;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionStatus;
import com.hairbyjoyceline_marealle.hairbusiness.enums.TransactionType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_id;

    private LocalDate transaction_date;
    private double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn (name =  "service_id")
    private HairService hairService;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn (name =  "customer_id")
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;


    public Transaction(LocalDate transaction_date, double amount, PaymentMethod paymentMethod, HairService hairService, Customer customer, TransactionType transactionType, TransactionStatus transactionStatus) {
        this.transaction_date = transaction_date;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.hairService = hairService;
        this.customer = customer;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
    }

    public Transaction (){
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public LocalDate getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(LocalDate transaction_date) {
        this.transaction_date = transaction_date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public HairService getHairService() {
        return hairService;
    }

    public void setHairService(HairService hairService) {
        this.hairService = hairService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}

