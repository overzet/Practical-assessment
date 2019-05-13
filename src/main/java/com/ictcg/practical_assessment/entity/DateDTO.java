package com.ictcg.practical_assessment.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data // lombok magic
//@Entity // This tells Hibernate to make a table out of this class
public class DateDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String name;

    private String email;

}
