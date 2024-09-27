package com.hairbyjoyceline_marealle.hairbusiness.service;


import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.TransactionNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionService  {
    TransactionDTO createTransaction (TransactionRequestDTO transactionRequestDTO);
    List<TransactionDTO> retrieveAllTransactions();
    TransactionDTO findHairTransactionById (Long transaction_id) throws TransactionNotFoundException;
    HairServiceDTO deleteHairService (Long hairService_id) throws TransactionNotFoundException;

}
