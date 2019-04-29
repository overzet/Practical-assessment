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

        dateModel.setLocalDate(LocalDate.now());
        dateModel.setLocalTime(LocalTime.now());

        //EU
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.FRENCH);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm", Locale.FRENCH);

        //US
        DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy a");
        DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern("h:mm a");

        //EU
        String sDate = dateModel.getLocalDate().format(dateFormatter);
        String sTime = dateModel.getLocalTime().format(timeFormatter);

        //US
        String uDate = dateModel.getLocalDate().format(usaDateFormat);
        String uTime = dateModel.getLocalTime().format(usaTimeFormat);

        //EU
        //return " date: \"" + sDate + "\",\ntime:  \"" + sTime + "\"";

        //US
        return " date: \"" + uDate + "\",\ntime:  \"" + uTime + "\"";
    }
}