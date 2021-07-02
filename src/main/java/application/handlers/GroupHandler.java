package application.handlers;

import application.model.groups.Group;
import application.model.people.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GroupHandler {
//    @Autowired
//    RequiredAnnotationBeanPostProcessor requiredBeanPostProcessor;

    @Value("${localization.country}")
    private String region;

    public String getRegion() {
        return region;
    }

    public Integer getId() {
        return id;
    }

//    @Required
    public void setId(Integer id) {
        this.id = id;
    }

    private Group group;
    private Integer id;


    @Autowired
    public void setGroup(@Qualifier("studentGroup") Group group) {
        this.group = group;
    }

    public void addSomePerson() {
        group.addPerson(new Student(11, "George"));
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "GroupHandler from " + region + ": " +
                "group=" + group +
                ", id=" + id +
                '}';
    }
}
