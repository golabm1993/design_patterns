package pl.gosia;

import java.util.List;

public class Student extends Person {
    List<Integer> schoolGrades;

    public Student(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    public Student(String firstName, String lastName, Integer age, List<Integer> schoolGrades) {
        super(firstName, lastName, age);
        this.schoolGrades = schoolGrades;
    }

    public List<Integer> getSchoolGrades() {
        return schoolGrades;
    }

    public void setSchoolGrades(List<Integer> schoolGrades) {
        this.schoolGrades = schoolGrades;
    }

    @Override
    public String toString() {
        return super.toString() + " is a student{" +
                "schoolGrades=" + schoolGrades +
                '}';
    }
}
