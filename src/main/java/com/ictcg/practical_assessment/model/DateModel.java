package com.ictcg.practical_assessment.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//TODO So this is in entity package but it is model, and in model you have entity,
// change them, also if some class is in entity it should be DateEntity,
// if class is in model it should be called DateEntity

// todo --> You mean DateModel instead or DateEntity?
@Data // lombok magic
//@Entity // This tells Hibernate to make a table out of this class
public class DateModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String name;

    private String email;

}