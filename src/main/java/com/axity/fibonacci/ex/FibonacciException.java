package com.axity.fibonacci.ex;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FibonacciException extends Exception {
    public FibonacciException(String message) {
        super(message);
    }
}
