package com.ictcg.practical_assessment.mapper;

import com.ictcg.practical_assessment.dto.DateDTO;
import com.ictcg.practical_assessment.model.DateModel;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "cdi")
@Mapper
public interface DateMapper {

    //@Mapping(target = "title", source = "name")
    DateDTO customer2DTO(DateModel dateModel);
}
