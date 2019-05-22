package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateService extends JpaRepository<Date, Long> {

    //DateRepository

    Date getDate(String countryCode);
    //

}

