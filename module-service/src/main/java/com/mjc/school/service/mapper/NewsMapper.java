package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.service.dto.NewsDto;
import org.modelmapper.ModelMapper;

public class NewsMapper {
    private final ModelMapper mapper = new ModelMapper();
    public NewsDto mapModelToDto(NewsModel model){
        return mapper.map(model,NewsDto.class);
    }
    public NewsModel mapDtoToModel(NewsDto dto){
        return mapper.map(dto,NewsModel.class);
    }
}
