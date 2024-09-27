package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.TransactionNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.TransactionRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImplementation implements TransactionService {
    private TransactionRepo transactionRepo;

    public TransactionServiceImplementation(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }


    @Override
    public TransactionDTO createTransaction(TransactionRequestDTO transactionRequestDTO) {
        return null;
    }

    @Override
    public List<TransactionDTO> retrieveAllTransactions() {
        return List.of();
    }

    @Override
    public TransactionDTO findHairTransactionById(Long transaction_id) throws TransactionNotFoundException {
        return null;
    }

    @Override
    public HairServiceDTO deleteHairService(Long hairService_id) throws TransactionNotFoundException {
        return null;
    }
}
