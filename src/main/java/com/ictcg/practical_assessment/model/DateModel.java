package com.ictcg.practical_assessment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data // lombok magic
@Entity //there is nothing to persist. And the dependency 'jpa' gives an error
//TODO you dont need Srializable here, you can send Class without Serializable
//TODO Renamed DataModel to Data
public class DateModel implements Serializable {// the model contains your data, in this case it's only LocalTime

    @Id
    private Long id;
    private LocalTime localTime;
    private LocalDate localDate;

}
