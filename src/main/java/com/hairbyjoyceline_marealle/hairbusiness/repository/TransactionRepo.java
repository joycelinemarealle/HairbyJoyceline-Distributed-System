package com.hairbyjoyceline_marealle.hairbusiness.repository;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
