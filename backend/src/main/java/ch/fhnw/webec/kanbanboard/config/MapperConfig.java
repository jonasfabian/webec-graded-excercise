package ch.fhnw.webec.kanbanboard.config;

import ch.fhnw.webec.kanbanboard.utils.EntityMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public EntityMapper mapper() {
        return Mappers.getMapper(EntityMapper.class);
    }
}
