package com.ictcg.practical_assessment.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class DateServiceImpl implements DateService {
    @Override
    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm", Locale.GERMAN);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String f = formatter.format(time);
        return ("date: " + date + ",\ntime: " + f);
    }
}
