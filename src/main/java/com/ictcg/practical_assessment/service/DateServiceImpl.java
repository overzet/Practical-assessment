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

        DateModel dateModel = new DateModel();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.GERMAN);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm", Locale.GERMAN);

        dateModel.setLocalDate(LocalDate.now());
        dateModel.setLocalTime(LocalTime.now());

        String sDate = dateModel.getLocalDate().format(dateFormatter);
        String sTime = dateModel.getLocalTime().format(timeFormatter);

        return " date: \"" + sDate + "\",\ntime:  \"" + sTime + "\"";
    }
}
