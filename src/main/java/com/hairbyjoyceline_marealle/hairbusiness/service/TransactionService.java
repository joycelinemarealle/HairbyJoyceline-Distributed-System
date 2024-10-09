package com.hairbyjoyceline_marealle.hairbusiness.service;


import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.TransactionNotFoundException;

import java.util.List;

public interface TransactionService  {
    TransactionDTO createTransaction (TransactionRequestDTO transactionRequestDTO);
    List<TransactionDTO> retrieveAllTransactions();
    TransactionDTO findHairTransactionById (Long transaction_id) throws TransactionNotFoundException;
    TransactionDTO deleteTransaction (Long transaction_id) throws TransactionNotFoundException;

}
