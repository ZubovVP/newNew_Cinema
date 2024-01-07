package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class FilmSessionDto implements Serializable {
    private final Long id;
    private final FileDto file;
    private final HallDto hall;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final Integer price;
}
