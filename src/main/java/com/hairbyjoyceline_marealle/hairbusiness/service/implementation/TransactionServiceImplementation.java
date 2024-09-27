package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.TransactionNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.CustomerMapper;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.TransactionMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.TransactionRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImplementation implements TransactionService {
    private TransactionRepo transactionRepo;
    private TransactionMapper transactionMapper;

    public TransactionServiceImplementation(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }


    @Override
    public TransactionDTO createTransaction(TransactionRequestDTO transactionRequestDTO) {
        //create transaction change request dto to entity
        Transaction transaction = transactionMapper.toEntity(transactionRequestDTO);

        //save entitytransaction to database
       Transaction savedTransaction = transactionRepo.save(transaction);

        // return dto
        return TransactionMapper.toDTO(savedTransaction);
    }

    @Override
    public List<TransactionDTO> retrieveAllTransactions() {
    //mapper to change list of transaction to DTO
        return TransactionMapper.toDTO(transactionRepo.findAll());
    }

    @Override
    public TransactionDTO findHairTransactionById(Long transaction_id) throws TransactionNotFoundException {
       Transaction transaction =  transactionRepo.findById(transaction_id).orElseThrow(() -> new TransactionNotFoundException(transaction_id))
;        return TransactionMapper.toDTO(transaction);
    }

    @Override
    public TransactionDTO  deleteTransaction(Long transaction_id) throws TransactionNotFoundException {
        Transaction transaction =  transactionRepo.findById(transaction_id).orElseThrow(() -> new TransactionNotFoundException(transaction_id));
        transactionRepo.delete(transaction);
        return TransactionMapper.toDTO(transaction);
    }
}
