package com.ictcg.practical_assessment.service;

import com.ictcg.practical_assessment.model.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO as this is Repository then it shouldn't be in service package but instead in repository
@Repository
public interface DateRepository extends JpaRepository<Date, Long> {


    Date getDate(String countryCode);

}

