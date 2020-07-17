package com.learning.springframework.msscbeerservice.web.mappers;

import com.learning.springframework.msscbeerservice.domain.Beer;
import com.learning.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
