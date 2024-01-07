package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.Film;
import ru.zubov.newcinema.model.dto.FilmDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "cdi")
public interface FilmMapper {
    Film filmDtoToFilm(FilmDto filmDto);

    FilmDto filmToFilmDto(Film film);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Film updateFilmFromFilmDto(FilmDto filmDto, @MappingTarget Film film);
}
