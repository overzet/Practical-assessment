package com.ictcg.practical_assessment.controllers;

import com.ictcg.practical_assessment.service.SourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController//to be able to receive HTTP requests,
public class UserController {

    private SourceConfig sourceConfig;

    @Autowired
    public void setSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
    }

    public void getDate() {

    }


}
