package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.DateModel;
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

        LocalDate date = DateModel.getLocalDate();
        LocalTime time = DateModel.getLocalTime();

        String f = formatter.format(time);
        return ("date: " + date + ",\ntime: " + f);
    }
}
