package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HallDto implements Serializable {
    private final Long id;
    private final String name;
    private final Integer row_count;
    private final Integer place_count;
    private final String description;
}
