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
    public String getDate(String countryCode) {

        DateModel dateModel = new DateModel();

        dateModel.setLocalDate(LocalDate.now());
        dateModel.setLocalTime(LocalTime.now());

        if (countryCode.equals("US")) {

            //US
            DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");
            DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern("h:mm a");

            //US
            String uDate = dateModel.getLocalDate().format(usaDateFormat);
            String uTime = dateModel.getLocalTime().format(usaTimeFormat);

            //US
            return "date: \"" + uDate + "\",\ntime:  \"" + uTime + "\"";

        } else if (countryCode.equals("EU")) {

            //EU
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.FRENCH);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm", Locale.FRENCH);

            //EU
            String sDate = dateModel.getLocalDate().format(dateFormatter);
            String sTime = dateModel.getLocalTime().format(timeFormatter);

            return "date: \"" + sDate + "\",\ntime:  \"" + sTime + "\"";
        } else {

            return "Not a valid code!";
        }

    }
}