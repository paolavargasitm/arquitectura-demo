package com.co.itm.contruccion.software.arquitectura.designpatterns.abstractfactory;

public class LuxuryCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new EconomyCar();
    }
}