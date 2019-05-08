package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.DateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateService extends JpaRepository<DateModel, Long> {

    DateModel getDate(String countryCode);

}

