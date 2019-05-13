package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.model.Date;
import com.ictcg.practical_assessment.service.DateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController//to be able to receive HTTP requests,
@RequestMapping("date")
public class DateController {

    @Autowired
    private DateService sourceConfig;

    @GetMapping("/getDate/{countryCode}")
    public Date getDate(@PathVariable String countryCode) {

        return sourceConfig.getDate(countryCode);
    }


}

