package com.library.microlibrary.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MembreIntrouvableException extends RuntimeException {

    public MembreIntrouvableException(String s){
        super(s);
    }
}
