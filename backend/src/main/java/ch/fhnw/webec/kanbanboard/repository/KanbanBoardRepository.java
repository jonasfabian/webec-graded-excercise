package ch.fhnw.webec.kanbanboard.repository;

import ch.fhnw.webec.kanbanboard.entity.KanbanBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KanbanBoardRepository extends JpaRepository<KanbanBoardEntity, UUID> {
}
