package application.model.groups;

import application.model.people.Person;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Group {

    private final List<Person> people = new ArrayList<>();

    @Override
    public List<Person> getStudents() {
        return people;
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "people=" + people +
                '}';
    }
}
