package application;

import application.config.AppConfig;
import application.model.people.Person;
import application.model.people.Student;
import application.model.groups.Group;
import application.handlers.GroupHandler;
import application.printers.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.refresh();
        Group group = context.getBean("studentGroup", Group.class);
        Person person = new Student(1, "John");
        group.addPerson(person);
        group.addPerson(new Student(2, "Ann"));

        System.out.println(context.getBean("printerName"));
        System.out.println(group.getStudents());

        GroupHandler groupHandler = context.getBean(GroupHandler.class);

        System.out.println(groupHandler.getGroup());
        groupHandler.addSomePerson();
        groupHandler.addSomePerson();
        System.out.println(groupHandler.getGroup());

        System.out.println(groupHandler.getRegion());


        AppConfig config = context.getBean(AppConfig.class);

        System.out.println(config.getRegion());


        System.out.println("group handler is " + groupHandler);

        context.getBean(Printer.class).print();

    }
}
