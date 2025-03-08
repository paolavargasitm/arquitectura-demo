package com.co.itm.contruccion.software.arquitectura.designpatterns.factory;

import org.springframework.stereotype.Component;

//Paypal
@Component
public class PaypalPayment implements PaymentOption {

    private final String IDENTIFIER = "01";

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public void processPayment() {
        // Lógica de pago
    }
}