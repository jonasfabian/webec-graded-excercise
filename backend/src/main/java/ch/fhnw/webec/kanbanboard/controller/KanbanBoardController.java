package ch.fhnw.webec.kanbanboard.controller;

import ch.fhnw.webec.kanbanboard.dto.KanbanBoardDTO;
import ch.fhnw.webec.kanbanboard.service.KanbanBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/kanban-boards")
public class KanbanBoardController {

    protected KanbanBoardService kanbanBoardService;

    @Autowired
    public void setKanbanBoardService(KanbanBoardService kanbanBoardService) {
        this.kanbanBoardService = kanbanBoardService;
    }

    @GetMapping
    @ResponseBody
    public Collection<KanbanBoardDTO> getBoards() {
        return kanbanBoardService.getKanbanBoards();
    }

}
