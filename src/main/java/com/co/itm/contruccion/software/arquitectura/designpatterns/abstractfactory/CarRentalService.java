package com.co.itm.contruccion.software.arquitectura.designpatterns.abstractfactory;

public class CarRentalService {

    public static Car rentCar(CarFactory factory) {
        return factory.createCar();
    }

    public static Car rentCarByType(String type) {
        if ("EconomyCar".equals(type)) {
            return new EconomyCarFactory().createCar();
        } else {
            return new LuxuryCarFactory().createCar();
        }
    }
}