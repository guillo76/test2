/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entities; 

/**
 *
 * @author guillermo
 */ 
public class PaymentsBR {
    
    private float amount;
    private int terms;
    private float rate;

    public PaymentsBR(float amount, int terms, float rate) {
        this.amount = amount;
        this.terms = terms;
        this.rate = rate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
    
    
    
}
