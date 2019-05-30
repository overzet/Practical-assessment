package com.ictcg.practical_assessment.mapper;

import com.ictcg.practical_assessment.entity.DateEntity;
import com.ictcg.practical_assessment.model.DateModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DateMapper {

    @Mapping(target = "ID", source = "id")
    DateModel customer2DTO(DateEntity dateEntityModel);
}
