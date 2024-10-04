package com.hairbyjoyceline_marealle.hairbusiness.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(Long transaction_id){ super("Customer with id " + transaction_id+ "was not found");

    }
}
