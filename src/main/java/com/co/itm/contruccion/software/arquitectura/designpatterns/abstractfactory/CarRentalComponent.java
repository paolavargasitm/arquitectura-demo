package com.co.itm.contruccion.software.arquitectura.designpatterns.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CarRentalComponent implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Car economyCar = CarRentalService.rentCarByType("EconomyCar");
        Car luxuryCar = CarRentalService.rentCarByType("LuxuryCar");
        log.info("Rented car type: {}", economyCar.getCarType());
        log.info("Rented car type: {}", luxuryCar.getCarType());
    }
}

