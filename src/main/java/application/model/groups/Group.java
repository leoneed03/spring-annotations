package application.model.groups;

import application.model.people.Person;

import java.util.List;

public interface Group {
    List<Person> getStudents();

    void addPerson(Person person);
}
