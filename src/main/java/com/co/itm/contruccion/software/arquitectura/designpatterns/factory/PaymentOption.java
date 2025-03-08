package com.co.itm.contruccion.software.arquitectura.designpatterns.factory;
//PayMethod
public interface PaymentOption {

    String getIdentifier();

    void processPayment();
}