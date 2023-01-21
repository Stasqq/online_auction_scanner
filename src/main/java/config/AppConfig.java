package config;

import entity.config.EntityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import repository.config.RepositoryConfig;
import rest.config.RestConfig;

@Configuration
@Import({
        EntityConfig.class,
        RepositoryConfig.class,
        RestConfig.class
})
public class AppConfig {
}
