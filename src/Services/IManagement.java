package Services;

import entities.student;

import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.Comparator;

public interface IManagement {
    void displayStudents(List<student> students, Consumer<student> con);

    void displayStudentsByFilter(List<student> students, Predicate<student> pre, Consumer<student> con);

    String returnStudentsNames(List<student> students, Function<student, String> fun);

    student createStudent(Supplier<student> sup);

    List<student> sortStudentsById(List<student> students, Comparator<student> com);
    Stream<student> convertToStream(List<student> students);

}
