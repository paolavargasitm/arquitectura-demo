package com.co.itm.contruccion.software.arquitectura.designpatterns.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Scope("prototype")
public class PaymentFactory {

    private final Map<String, PaymentOption> paymentMethods;

    @Autowired
    private PaymentFactory(List<PaymentOption> options) {
        paymentMethods = options.stream()
                .collect(Collectors.toMap(PaymentOption::getIdentifier, Function.identity()));
    }

    public PaymentOption getImplementation(String identifier) {
        return Optional.ofNullable(paymentMethods.get(identifier)).orElseThrow(IllegalArgumentException::new);
    }
}