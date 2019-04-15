package com.ictcg.practical_assessment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestController//to be able to receive HTTP requests,
@RequestMapping("date")//that match this URL path http://localhost:8080/date
public class UserCotroller {

    @GetMapping//bind this method to HTTP get request
    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm", Locale.GERMAN);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String f = formatter.format(time);
        return ("date: " + date + ",\ntime: " + f);
    }

}
