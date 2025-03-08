package com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.domain;

import com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.model.Video;

public interface IEarningsCalculator {
    double calculateEarnings(Video video);
}
