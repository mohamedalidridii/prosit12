import Services.studentManagement;
import entities.student;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        studentManagement sm = new studentManagement();

        List<student> students = Arrays.asList(
                new student(3, "daly", 22),
                new student(1, "Ahmed", 20),
                new student(2, "Marwen", 23)
        );

        sm.displayStudents(students, s -> System.out.println(s));

        sm.displayStudentsByFilter(students, s -> s.getAge() > 21, s -> System.out.println(s));

        String names = sm.returnStudentsNames(students, s -> s.getName());
        System.out.println(names);

        student newStudent = sm.createStudent(() -> new student(4, "David", 19));
        System.out.println(newStudent);


        List<student> sorted = sm.sortStudentsById(students, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        sorted.forEach(s -> System.out.println(s));


        sm.convertToStream(students).forEach(s -> System.out.println(s));
    }
}