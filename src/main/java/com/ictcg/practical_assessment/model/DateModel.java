package com.ictcg.practical_assessment.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data // lombok magic
//@ Entity, there is nothing to persist. And the dependency 'jpa' gives an error
public class DateModel {// the model contains your data, in this case it's only LocalTime

    private LocalTime localTime;
    private LocalDate localDate;

}
