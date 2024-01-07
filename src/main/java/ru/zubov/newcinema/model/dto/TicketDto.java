package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TicketDto implements Serializable {
    private final Long id;
    private final FilmSessionDto filmSession;
    private final Integer row_number;
    private final Integer place_number;
    private final UserDto user;
}
