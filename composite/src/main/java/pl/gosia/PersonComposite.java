package pl.gosia;

import java.util.ArrayList;
import java.util.List;

public class PersonComposite {

    public static void main(String[] args) {

        List<Integer> student1Rates = new ArrayList<>();
        student1Rates.add(3);
        student1Rates.add(5);
        student1Rates.add(2);
        student1Rates.add(4);
        Student student1 = new Student("Jan", "Kowalski", 21, student1Rates);

        List<Integer> student2Rates = new ArrayList<>();
        student2Rates.add(3);
        student2Rates.add(3);
        student2Rates.add(3);
        student2Rates.add(3);
        Student student2 = new Student("Adam", "Iksiński", 24, student2Rates);

        Employee employee = new Employee("Anna", "Nowak", 40, "Teacher");

        employee.add(student1);
        employee.add(student2);

        System.out.println(employee);

        for (Person students: employee.getStudents()) {
            System.out.println(students);
        }
    }
}
