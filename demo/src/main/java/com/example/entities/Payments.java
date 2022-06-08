/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entities;

import java.time.LocalDate;
import java.util.Date; 


/**
 *
 * @author guillermo
 */ 
public class Payments {
    private int payment_number;
    private float amout;
    private LocalDate payment_date;

    public Payments() {
    }

    public int getPayment_number() {
        return payment_number;
    }

    public void setPayment_number(int payment_number) {
        this.payment_number = payment_number;
    }

    public float getAmout() {
        return amout;
    }

    public void setAmout(float amout) {
        this.amout = amout;
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }
    
    
}
