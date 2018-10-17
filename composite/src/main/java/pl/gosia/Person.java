package pl.gosia;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Person> students;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        students = new ArrayList<>();
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public List<Person> getStudents() {
        return students;
    }

    public void add(Person person) {
        students.add(person);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
