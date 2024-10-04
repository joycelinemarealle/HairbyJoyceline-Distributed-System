package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import com.hairbyjoyceline_marealle.hairbusiness.exception.TransactionNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.TransactionMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.TransactionRepository;
import com.hairbyjoyceline_marealle.hairbusiness.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImplementation implements TransactionService {
    private TransactionRepository transactionRepository;
    private TransactionMapper transactionMapper;

    public TransactionServiceImplementation(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public TransactionDTO createTransaction(TransactionRequestDTO transactionRequestDTO) {
        //create transaction change request dto to entity
        Transaction transaction = transactionMapper.toEntity(transactionRequestDTO);

        //save entitytransaction to database
       Transaction savedTransaction = transactionRepository.save(transaction);

        // return dto
        return TransactionMapper.toDTO(savedTransaction);
    }

    @Override
    public List<TransactionDTO> retrieveAllTransactions() {
    //mapper to change list of transaction to DTO
        return TransactionMapper.toDTO(transactionRepository.findAll());
    }

    @Override
    public TransactionDTO findHairTransactionById(Long transaction_id) throws TransactionNotFoundException {
       Transaction transaction =  transactionRepository.findById(transaction_id).orElseThrow(() -> new TransactionNotFoundException(transaction_id))
;        return TransactionMapper.toDTO(transaction);
    }

    @Override
    public TransactionDTO  deleteTransaction(Long transaction_id) throws TransactionNotFoundException {
        Transaction transaction =  transactionRepository.findById(transaction_id).orElseThrow(() -> new TransactionNotFoundException(transaction_id));
        transactionRepository.delete(transaction);
        return TransactionMapper.toDTO(transaction);
    }
}
