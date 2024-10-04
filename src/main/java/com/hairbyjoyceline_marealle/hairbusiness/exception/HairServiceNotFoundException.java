package com.hairbyjoyceline_marealle.hairbusiness.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class HairServiceNotFoundException extends RuntimeException{
    public HairServiceNotFoundException(Long hairService_id){super("Hair Service with id" + hairService_id + "is not found");}
}
