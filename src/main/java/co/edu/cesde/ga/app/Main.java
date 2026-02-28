package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.setFirstName("John");
        person.getFirstName();
        Person person4 = new Person(1L, "123", "1234567890", "Jane", "Doe", "jua@hot.com", true);

    }
}
