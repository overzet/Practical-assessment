package com.ictcg.practical_assessment.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class DateModel {

    private static LocalTime localTime;
    private static LocalDate localDate;

    public static LocalDate getLocalDate() {
        return localDate;
    }

    public static LocalTime getLocalTime() {
        return localTime;
    }

}
