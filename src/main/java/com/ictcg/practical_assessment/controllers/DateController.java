package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController//to be able to receive HTTP requests
@RequestMapping("date")

public class DateController {

    @Autowired
    private DateService dateService;

    //   private DateService sourceConfig;
//
//    public void setSourceConfig(DateService sourceConfig) {
//            this.sourceConfig = sourceConfig;
//       }

    @GetMapping
    public Date getDate() {
        return dateService.getDate();
    }


}
