package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.entity.DateEntity;
import com.ictcg.practical_assessment.repository.DateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
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
        DateEntity dateEntity = new DateEntity(name, email);
        dateRepository.save(dateEntity);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public Iterable<DateEntity> getAllUsers() {
        return dateRepository.findAll();
    }


}

