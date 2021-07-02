package application.config;

import application.model.groups.EmptyGroup;
import application.model.groups.Group;
import application.model.groups.StudentGroup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan({"application.model", "application.handlers"})
@Import(PrinterConfig.class)
public class AppConfig {

    @Value("${localization.country}")
    private String region;

    public String getRegion() {
        return region;
    }

    @Bean("studentGroup")
    @Scope("prototype")
    public Group getGroup() {
        return new StudentGroup();
    }

    @Bean("emptyGroup")
    public Group getGroupEmpty() {
        return new EmptyGroup();
    }
}
