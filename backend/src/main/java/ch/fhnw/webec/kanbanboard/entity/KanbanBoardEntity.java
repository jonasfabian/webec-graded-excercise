package ch.fhnw.webec.kanbanboard.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name ="kanban_board")
@Getter
@Setter
public class KanbanBoardEntity extends AbstractAuditEntity {
    @Column
    private String name;

    @Column
    private String description;
}
