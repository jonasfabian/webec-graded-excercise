package ch.fhnw.webec.kanbanboard.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class KanbanBoardDTO {
    private UUID id;

    private String name;

    private String description;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;

    private int version;
}
