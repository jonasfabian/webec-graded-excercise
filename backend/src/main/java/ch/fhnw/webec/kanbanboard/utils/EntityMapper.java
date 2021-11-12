package ch.fhnw.webec.kanbanboard.utils;

import ch.fhnw.webec.kanbanboard.dto.KanbanBoardDTO;
import ch.fhnw.webec.kanbanboard.entity.KanbanBoardEntity;
import org.mapstruct.Mapper;

@Mapper
public abstract class EntityMapper {
    public abstract KanbanBoardDTO kanbanBoardToDTO(KanbanBoardEntity entity);
}
