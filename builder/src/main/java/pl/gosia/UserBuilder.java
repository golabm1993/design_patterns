package pl.gosia;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean adult;

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAge(Integer age) {
        this.age = age;
        this.adult = age >= 18 ? true : false;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, age, adult);
    }
}
