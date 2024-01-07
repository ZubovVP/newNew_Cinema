package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FileDto implements Serializable {
    private final Long id;
    private final String name;
    private final String path;
}
