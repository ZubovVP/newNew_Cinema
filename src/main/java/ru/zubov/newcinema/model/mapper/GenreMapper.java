package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.Genre;
import ru.zubov.newcinema.model.dto.GenreDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "cdi")
public interface GenreMapper {
    Genre genreDtoToGenre(GenreDto genreDto);

    GenreDto genreToGenreDto(Genre genre);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Genre updateGenreFromGenreDto(GenreDto genreDto, @MappingTarget Genre genre);
}
