package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.FilmSession;
import ru.zubov.newcinema.model.dto.FilmSessionDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FilmSessionMapper {
    FilmSession filmSessionDtoToFilmSession(FilmSessionDto filmSessionDto);

    FilmSessionDto filmSessionToFilmSessionDto(FilmSession filmSession);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FilmSession updateFilmSessionFromFilmSessionDto(FilmSessionDto filmSessionDto, @MappingTarget FilmSession filmSession);
}
