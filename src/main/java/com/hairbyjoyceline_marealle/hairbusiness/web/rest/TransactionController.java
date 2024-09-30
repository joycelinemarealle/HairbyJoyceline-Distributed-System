package com.hairbyjoyceline_marealle.hairbusiness.web.rest;

import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionDTO> retrieveAllTransactions (){
        return transactionService.retrieveAllTransactions();

    }

    @GetMapping("{transaction_id}")
    public TransactionDTO findHairTransactionById(@PathVariable Long transaction_id){
        return transactionService.findHairTransactionById(transaction_id);
    }

    @GetMapping("{transaction_id")
    public TransactionDTO deleteTransaction (@PathVariable Long transaction_id){
        return transactionService.deleteTransaction(transaction_id);
    }

    @PostMapping
    public TransactionDTO createTransaction(@RequestBody TransactionRequestDTO transactionRequestDTO){
        return transactionService.createTransaction(transactionRequestDTO);
    }
}
