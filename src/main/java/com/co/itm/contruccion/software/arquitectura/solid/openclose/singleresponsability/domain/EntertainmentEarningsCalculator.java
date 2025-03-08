package com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.domain;

import com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.model.Video;
import org.springframework.stereotype.Component;

@Component
public class EntertainmentEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }
}