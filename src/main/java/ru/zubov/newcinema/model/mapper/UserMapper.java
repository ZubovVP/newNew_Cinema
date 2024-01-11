package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.User;
import ru.zubov.newcinema.model.dto.UserDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User updateUserFromUserDto(UserDto userDto, @MappingTarget User user);
}
