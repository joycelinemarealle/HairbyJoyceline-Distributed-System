package com.hairbyjoyceline_marealle.hairbusiness.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException{
    public  CustomerNotFoundException(Long customer_id){super ("Customer with id " +customer_id+ "was not found");}
}
