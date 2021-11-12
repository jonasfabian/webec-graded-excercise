package ch.fhnw.webec.kanbanboard.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
public abstract class AbstractAuditEntity {
    @Id
    @GeneratedValue
    protected UUID id;

    @Column
    @CreatedDate
    protected LocalDateTime createdDate;

    @Column
    @LastModifiedDate
    protected LocalDateTime lastModifiedDate;

    @Version
    protected int version;
}
