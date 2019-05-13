package com.ictcg.practical_assessment.mapper;

import com.ictcg.practical_assessment.entity.DateDTO;
import com.ictcg.practical_assessment.model.Date;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DateMapper {

    @Mapping(target = "ID", source = "id")
    DateDTO customer2DTO(Date dateModel);
}
