package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.File;
import ru.zubov.newcinema.model.dto.FileDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "cdi")
public interface FileMapper {
    File fileDtoToFile(FileDto fileDto);

    FileDto fileToFileDto(File file);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    File updateFileFromFileDto(FileDto fileDto, @MappingTarget File file);
}
