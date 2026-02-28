package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person();

        person.setFirstName("John");
        person.getFirstName();
        Person person2 = new Person(1L, "123", "1234567890", "Jane", "Doe", "jua@hot.com", true);

        Student student = new Student();
        student.setFirstName("Jaime");
        Student student1 = new Student(2L, "456", "0987654321", "Alice", "Smith", "Juan@hot.com", true, "2000-01-01");

        Teacher teacher = new Teacher();
        teacher.setFirstName("Maria");
        Teacher teacher1 = new Teacher(3L, "789", "1122334455", "Bob", "Johnson", "Soft@hot.com", true);

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(teacher.toString());
        System.out.println(teacher1.toString());
    }
}
