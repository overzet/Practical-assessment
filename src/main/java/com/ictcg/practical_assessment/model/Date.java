package com.ictcg.practical_assessment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // lombok magic
@Entity // This tells Hibernate to make a table out of this class
public class Date {// the model contains your data, in this case it's only LocalTime

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

//    private LocalTime localTime;
//    private LocalDate localDate;

}
