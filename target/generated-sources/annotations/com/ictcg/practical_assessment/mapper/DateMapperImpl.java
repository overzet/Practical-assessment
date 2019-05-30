package com.ictcg.practical_assessment.mapper;

import com.ictcg.practical_assessment.entity.DateEntity;
import com.ictcg.practical_assessment.model.DateModel;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-30T11:42:29+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class DateMapperImpl implements DateMapper {

    @Override
    public DateModel customer2DTO(DateEntity dateEntityModel) {
        if ( dateEntityModel == null ) {
            return null;
        }

        DateModel dateModel = new DateModel();

        dateModel.setID( dateEntityModel.getId() );
        dateModel.setName( dateEntityModel.getName() );
        dateModel.setEmail( dateEntityModel.getEmail() );

        return dateModel;
    }
}
