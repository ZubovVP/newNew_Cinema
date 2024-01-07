package ru.zubov.newcinema.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String fullName;
    private final String email;
}
