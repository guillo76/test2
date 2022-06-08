/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.entities.Payments;
import com.example.entities.PaymentsBR;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.springframework.stereotype.Service;

/**
 *
 * @author guillermo
 */
@Service
public class PaymentService {

    public PaymentService() {
    }

    public Payments calcPayment(PaymentsBR paymentBR) {
        Payments paymentResp = new Payments();
        float newAmount;

        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today;

        if ((paymentBR.getTerms() < 53) && (paymentBR.getTerms() > 3)) {
            if (paymentBR.getRate() < 100 && paymentBR.getRate() > 1) {
                if (paymentBR.getAmount() < 999999 && paymentBR.getAmount() > 1) {
                    newAmount = paymentBR.getAmount() * paymentBR.getRate();
                    for (int tempTerms = 3; tempTerms < 53; tempTerms++) {
                        paymentResp.setPayment_date(nextWeek);
                        paymentResp.setAmout(newAmount);
                        paymentResp.setPayment_number(tempTerms);
                        newAmount = newAmount * paymentBR.getRate();
                        nextWeek = today.plus(1, ChronoUnit.WEEKS);
                    }
                }
            }
        }
        return paymentResp;
    }
}
