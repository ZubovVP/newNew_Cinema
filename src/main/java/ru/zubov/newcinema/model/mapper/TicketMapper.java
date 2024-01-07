package ru.zubov.newcinema.model.mapper;

import org.mapstruct.*;
import ru.zubov.newcinema.model.Ticket;
import ru.zubov.newcinema.model.dto.TicketDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "cdi")
public interface TicketMapper {
    Ticket ticketDtoToTicket(TicketDto ticketDto);

    TicketDto ticketToTicketDto(Ticket ticket);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Ticket updateTicketFromTicketDto(TicketDto ticketDto, @MappingTarget Ticket ticket);
}
