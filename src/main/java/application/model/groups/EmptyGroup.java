package application.model.groups;

import application.model.people.Person;

import java.util.ArrayList;
import java.util.List;

public class EmptyGroup implements Group {
    @Override
    public List<Person> getStudents() {
        return new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
    }
}
