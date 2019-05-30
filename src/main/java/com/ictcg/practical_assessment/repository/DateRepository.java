package com.ictcg.practical_assessment.repository;

import com.ictcg.practical_assessment.entity.DateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends JpaRepository<DateEntity, Long> {

    DateEntity getDate(String countryCode);

}

