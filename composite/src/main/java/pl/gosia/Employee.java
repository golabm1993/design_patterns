package pl.gosia;

public class Employee extends Person {
    private String job;

    public Employee(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    public Employee(String firstName, String lastName, Integer age, String job) {
        super(firstName, lastName, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + " is an employee{" +
                "job='" + job + '\'' +
                '}';
    }
}
