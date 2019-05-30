package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.entity.DateEntity;
import com.ictcg.practical_assessment.repository.DateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController//to be able to receive HTTP requests,
@RequestMapping("date")
public class DateController {

    @Autowired
    private DateRepository dateRepository;

    @GetMapping("/getDate/{countryCode}")
    public DateEntity getDate(@PathVariable String countryCode) {

        return dateRepository.getDate(countryCode);
    }

    @GetMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        DateEntity dateEntity = new DateEntity(name, email);
        dateRepository.save(dateEntity);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<DateEntity> getAllUsers() {
        // This returns a JSON or XML with the users
        //TODO in returns JSON by default as you have put @RestController, if you put @Controller then it should return XML and JSON and you will need to handle that on server side,
        //TODO with Rest inside you have already define it's response

        //todo So I can remove line 40?
        return dateRepository.findAll();
    }


}

