package ch.fhnw.webec.kanbanboard.service;

import ch.fhnw.webec.kanbanboard.dto.KanbanBoardDTO;
import ch.fhnw.webec.kanbanboard.repository.KanbanBoardRepository;
import ch.fhnw.webec.kanbanboard.utils.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KanbanBoardService {
    private final EntityMapper mapper;
    private final KanbanBoardRepository kanbanBoardRepository;

    public Collection<KanbanBoardDTO> getKanbanBoards() {
        return kanbanBoardRepository.findAll().stream().map(mapper::kanbanBoardToDTO).toList();
    }
}
