package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.Hall;
import ru.zubov.newcinema.model.dto.HallDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "cdi")
public interface HallMapper {
    Hall hallDtoToHall(HallDto hallDto);

    HallDto hallToHallDto(Hall hall);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Hall updateHallFromHallDto(HallDto hallDto, @MappingTarget Hall hall);
}
