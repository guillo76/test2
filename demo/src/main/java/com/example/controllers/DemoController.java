/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.entities.Payments;
import com.example.entities.PaymentsBR;
import com.example.services.PaymentService;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author guillermo
 */
@RestController
public class DemoController {
    private float amount;
    private int term;
    private float rate;
    private PaymentService paymentService;

    public DemoController(float amount, int term, float rate) {
        this.amount = amount;
        this.term = term;
        this.rate = rate;
    }    
     
    @PostMapping("/payments") 
    public ResponseEntity<Payments> postPayments(@Valid @RequestBody PaymentsBR payment) {
        try {
            Payments responsePayment = paymentService.calcPayment(payment);  
            return new ResponseEntity<Payments>(responsePayment,null, HttpStatus.OK);
        }
        catch(Exception ex) {
            return ResponseEntity.badRequest()
                    .header("ERROR", ex.getMessage())
                    .build();
        }
    }
}
