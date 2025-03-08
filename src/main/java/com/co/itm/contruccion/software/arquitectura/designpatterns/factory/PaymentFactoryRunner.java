package com.co.itm.contruccion.software.arquitectura.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PaymentFactoryRunner implements CommandLineRunner {
    private final PaymentFactory paymentFactory;

    @Autowired
    public PaymentFactoryRunner(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @Override
    public void run(String...args) throws Exception {
        PaymentOption selectedPayment = fetchImplementation();
        log.info("Factory - Is it a Paypal implementation? {}", selectedPayment instanceof PaypalPayment);
    }

    public PaymentOption fetchImplementation() {
        return paymentFactory.getImplementation("02");
    }

    public String additionalMethod() {
        return "ExampleString";
    }
}
