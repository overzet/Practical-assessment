package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.DateModel;
import org.springframework.stereotype.Service;

@Service //it’s a good idea to use @Service over @Component
public class DateServiceImpl {
    // @Override
    public DateModel getDate(String countryCode) {
        return null;
    }
/*
    @Override
    public DateModel getDate(String countryCode) {

        DateModel dateModel = new DateModel();

        dateModel.setLocalDate(LocalDate.now());
        dateModel.setLocalTime(LocalTime.now());

        if (countryCode.equals("US")) {

            DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");
            DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern("h:mm a");

            String uDate = dateModel.getLocalDate().format(usaDateFormat);
            String uTime = dateModel.getLocalTime().format(usaTimeFormat);

            return dateModel;

        } else if (countryCode.equals("EU")) {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.FRENCH);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm", Locale.FRENCH);

            String sDate = dateModel.getLocalDate().format(dateFormatter);
            String sTime = dateModel.getLocalTime().format(timeFormatter);

            return dateModel;

        } else {

            return null;
        }

    }
*/
}