package com.ictcg.practical_assessment.repository;

import com.ictcg.practical_assessment.entity.DateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO as this is Repository then it shouldn't be in service package but instead in repository

//todo so I changed the package name to repository
@Repository
public interface DateRepository extends JpaRepository<DateEntity, Long> {

    DateEntity getDate(String countryCode);

}

