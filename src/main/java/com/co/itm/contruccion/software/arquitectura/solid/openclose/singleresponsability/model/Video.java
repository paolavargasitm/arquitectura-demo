package com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.model;

import lombok.Getter;

@Getter
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {

        return (time / 3600.0) * views;
    }

}