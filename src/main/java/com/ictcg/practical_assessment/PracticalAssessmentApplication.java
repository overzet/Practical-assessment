package com.ictcg.practical_assessment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticalAssessmentApplication {

    private final static Logger log = LoggerFactory.getLogger(PracticalAssessmentApplication.class);

    public static void main(String[] args) {
        log.info("Info running");
        log.debug("Debug running");
        SpringApplication.run(PracticalAssessmentApplication.class, args);

    }

}
