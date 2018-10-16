package pl.gosia;

public class App {

    public static void main(String[] args) {

        User user = new UserBuilder().withFirstName("Jan").withLastName("Kowalski").withAge(50).build();

        System.out.println(user);
    }
}
