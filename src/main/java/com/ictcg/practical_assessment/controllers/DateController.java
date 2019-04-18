package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//to be able to receive HTTP requests,
@RequestMapping("date")
public class DateController {

    @Autowired
    private DateService sourceConfig;

//  Why is this not needed?
//    public void setSourceConfig(DateService sourceConfig) {
//        this.sourceConfig = sourceConfig;
//    }

    @GetMapping("/getDate")
    public String getDate() {
        return sourceConfig.getDate();
    }


}
