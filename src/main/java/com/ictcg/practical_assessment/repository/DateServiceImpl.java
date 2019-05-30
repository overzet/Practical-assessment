package com.ictcg.practical_assessment.repository;

import com.ictcg.practical_assessment.entity.DateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


//TODO This should be named DateServiceImpl also it will implement DateService interface,
// now called --> DateRepository

/**
 * DateService will have method getDate(String countryCode), and this class will override that method
 */
@Service
public class DateServiceImpl implements DateRepository {

    @Autowired
    DateRepository dateRepository;

    private static final String EU = "EU";
    private static final String US = "US";

    //TODO Autowired DateRepository, @Autowired DateRepository dateRepository
    //In db you will need to create table to save this record that can be done after Unit & Integration Tests or before, you will then before each return call dateRepository.save(date)

    public DateEntity getDate(String countryCode) {
//TODO Rename dataModel to date, modelRepresent a class we already know that this is a class
        DateEntity dateEntityModel = new DateEntity();

        dateEntityModel.setLocalDate(LocalDate.now());
        dateEntityModel.setLocalTime(LocalTime.now());

        if (countryCode.equals(US)) {

            DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");
            DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern("h:mm a");

            String uDate = dateEntityModel.getLocalDate().format(usaDateFormat);
            String uTime = dateEntityModel.getLocalTime().format(usaTimeFormat);

            return dateEntityModel;
//TODO dont use String, use Constants , private static final String EU = "EU" ; declare this before the first method in class, same for pattern line 35 and 36 and 25,26
        } else if (countryCode.equals(EU)) {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.FRENCH);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm", Locale.FRENCH);

            String sDate = dateEntityModel.getLocalDate().format(dateFormatter);
            String sTime = dateEntityModel.getLocalTime().format(timeFormatter);

            return dateEntityModel;
//TODO remove last else and just leave return null;
        }

        return null;


    }

}