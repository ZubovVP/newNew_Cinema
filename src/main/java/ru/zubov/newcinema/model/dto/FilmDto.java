package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmDto implements Serializable {
    private final Long id;
    private final String name;
    private final String description;
    private final Integer year;
    private final GenreDto genre;
    private final Integer minimal_age;
    private final Integer duration_in_minutes;
    private final FileDto file;
}
