package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends JpaRepository<Date, Long> {


    Date getDate(String countryCode);

}

