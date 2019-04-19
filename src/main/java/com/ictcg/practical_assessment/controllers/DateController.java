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
/*TODO reason why you crated this one is to get current date,
  if you wanted also to set the date you will create one more.
  Because of that you need only getDate.
  * */

//  Why is this not needed?
//    public void setSourceConfig(DateService sourceConfig) {
//        this.sourceConfig = sourceConfig;
//    }
//TODO add parameter isUS if it is true you will send in am/pm format
    //implementation should be done in service for that
    //Add model class Date and return it as response
    @GetMapping
    public String getDate() {
        return sourceConfig.getDate();
    }


}
