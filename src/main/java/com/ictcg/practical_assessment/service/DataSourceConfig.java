package com.ictcg.practical_assessment.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
@Profile("date")
public class DataSourceConfig implements SourceConfig {
    @Override
    public void getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm", Locale.GERMAN);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String f = formatter.format(time);
        System.out.println("date: " + date + ",\ntime: " + f);
    }
}
