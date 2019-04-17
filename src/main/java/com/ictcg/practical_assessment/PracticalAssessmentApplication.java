package com.ictcg.practical_assessment;

import com.ictcg.practical_assessment.controllers.UserController;
import com.ictcg.practical_assessment.service.SourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticalAssessmentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PracticalAssessmentApplication.class, args);
        UserController userController = (UserController) ctx.getBean("dataSourceConfig", SourceConfig.class);
        userController.setSourceConfig();
    }

}
