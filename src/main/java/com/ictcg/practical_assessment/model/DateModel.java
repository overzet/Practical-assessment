package com.ictcg.practical_assessment.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
//@ Entity, there is nothing to persist. And the dependency 'jpa' gives an error
public class DateModel {// the model contains your data

    private LocalTime localTime;
    private LocalDate localDate;

}
