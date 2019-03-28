package com.axity.fibonacci.controller;

import com.axity.fibonacci.dto.FibonacciDTO;
import com.axity.fibonacci.ex.FibonacciException;
import com.axity.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;
    private Integer limiteMaximo = 40;

    @GetMapping("/{limite}")
    ResponseEntity<FibonacciDTO> consultarVehiculo(@Valid @PathVariable("limite") Integer limite) throws FibonacciException {
        if (limite > limiteMaximo) {
            throw new FibonacciException("Excede el limite de " + limiteMaximo);
        }

        FibonacciDTO fibonacci = fibonacciService.calcular(limite);

        return new ResponseEntity<>(fibonacci, HttpStatus.OK);
    }
}

