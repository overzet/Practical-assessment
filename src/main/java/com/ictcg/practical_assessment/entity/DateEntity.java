package com.ictcg.practical_assessment.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // lombok magic
@Entity // This tells Hibernate to make a table out of this class
public class DateEntity {// the model contains your data

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    public DateEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
