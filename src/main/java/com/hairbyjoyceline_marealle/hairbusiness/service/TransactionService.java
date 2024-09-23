package com.hairbyjoyceline_marealle.hairbusiness.service;


import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionService extends JpaRepository<Transaction, Long> {
}
