package com.ictcg.practical_assessment.bootstrap;

import com.ictcg.practical_assessment.model.Date;
import com.ictcg.practical_assessment.service.DateService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private DateService dateService;


    public DevBootstrap(DateService dateService) {
        this.dateService = dateService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        Date eric = new Date("Eric", "Evans");

        dateService.save(eric);

    }
}
