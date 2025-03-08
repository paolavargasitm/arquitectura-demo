package com.co.itm.contruccion.software.arquitectura.designpatterns.factory;

import org.springframework.stereotype.Component;

// Tarjeta de Crédito
@Component
public class CreditCardPayment implements PaymentOption {

    private final String IDENTIFIER = "02";

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public void processPayment() {
        // Lógica de pago
    }
}