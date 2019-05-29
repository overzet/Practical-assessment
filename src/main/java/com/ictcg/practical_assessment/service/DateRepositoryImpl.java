package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.Date;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TODO This should be named DateServiceImpl also it will implement DateService interface,
/** DateService will have method getDate(String countryCode), and this class will override that method*/
@Service
public class DateRepositoryImpl {

    //TODO Autowired DateRepository, @Autowired DateRepository dateRepository
    //In db you will need to create table to save this record that can be done after Unit & Integration Tests or before, you will then before each return call dateRepository.save(date)

    public Date getDate(String countryCode) {
//TODO Rename dataModel to date, modelRepresent a class we already know that this is a class
        Date dateModel = new Date();

        dateModel.setLocalDate(LocalDate.now());
        dateModel.setLocalTime(LocalTime.now());

        if (countryCode.equals("US")) {

            DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");
            DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern("h:mm a");

            String uDate = dateModel.getLocalDate().format(usaDateFormat);
            String uTime = dateModel.getLocalTime().format(usaTimeFormat);

            return dateModel;
//TODO dont use String, use Constants , private static final String EU = "EU" ; declare this before the first method in class, same for pattern line 35 and 36 and 25,26
        } else if (countryCode.equals("EU")) {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.FRENCH);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm", Locale.FRENCH);

            String sDate = dateModel.getLocalDate().format(dateFormatter);
            String sTime = dateModel.getLocalTime().format(timeFormatter);

            return dateModel;
//TODO remove last else and just leave return null;
        } else {

            return null;
        }

    }

}