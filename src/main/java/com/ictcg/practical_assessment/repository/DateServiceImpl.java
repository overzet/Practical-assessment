package com.ictcg.practical_assessment.repository;

import com.ictcg.practical_assessment.entity.DateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class DateServiceImpl implements DateRepository {

    @Autowired
    DateRepository dateRepository;

    private static final String EU = "EU";
    private static final String US = "US";
    private static final String DATE_REGEX = "MMM dd yyyy";
    private static final String TIME_REGEX = "h:mm a";

    //TODO In db you will need to create table to save this record that can be done after Unit & Integration
    // Tests or before, you will then before each return call dateRepository.save(date)
    //TODO create method that has dateRepository.save() inside
    public DateEntity getDate(String countryCode) {
        DateEntity dateEntityModel = new DateEntity();

        dateEntityModel.setLocalDate(LocalDate.now());
        dateEntityModel.setLocalTime(LocalTime.now());

        if (countryCode.equals(US)) {

            DateTimeFormatter usaDateFormat = DateTimeFormatter.ofPattern(DATE_REGEX);
            DateTimeFormatter usaTimeFormat = DateTimeFormatter.ofPattern(TIME_REGEX);

            String uDate = dateEntityModel.getLocalDate().format(usaDateFormat);
            String uTime = dateEntityModel.getLocalTime().format(usaTimeFormat);

            return dateEntityModel;

        } else if (countryCode.equals(EU)) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_REGEX, Locale.FRENCH);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIME_REGEX, Locale.FRENCH);

            String sDate = dateEntityModel.getLocalDate().format(dateFormatter);
            String sTime = dateEntityModel.getLocalTime().format(timeFormatter);

            return dateEntityModel;
        }
        return null;
    }
}