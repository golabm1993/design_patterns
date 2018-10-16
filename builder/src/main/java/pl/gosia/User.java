package pl.gosia;

public class User {

    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean adult;

    public User(String firstName, String lastName, Integer age, Boolean adult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adult = adult;
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

    public Boolean isAdult() {
        return age >= 18 ? true : false;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", adult=" + adult +
                '}';
    }
}
