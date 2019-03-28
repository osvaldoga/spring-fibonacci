package com.axity.fibonacci.service;

import com.axity.fibonacci.dto.FibonacciDTO;
import org.springframework.stereotype.Component;

@Component
public class FibonacciService {

    public FibonacciDTO calcular(Integer limite) {
        FibonacciDTO fib = new FibonacciDTO();

        fib.setLimite(limite);
        fib.setResultado(fibonacci(limite));

        return fib;
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
