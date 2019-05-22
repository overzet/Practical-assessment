package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.model.Date;
import com.ictcg.practical_assessment.service.DateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController//to be able to receive HTTP requests,
@RequestMapping("date")
public class DateController {

    @Autowired
    private DateService sourceConfig;//dateService

    @GetMapping("/getDate/{countryCode}")
    public Date getDate(@PathVariable String countryCode) {

        return sourceConfig.getDate(countryCode);
    }

    @GetMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Date date = new Date(name, email);
        sourceConfig.save(date);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Date> getAllUsers() {
        // This returns a JSON or XML with the users
        return sourceConfig.findAll();
    }


}

