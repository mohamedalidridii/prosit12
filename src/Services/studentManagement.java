package Services;

import entities.student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class studentManagement implements IManagement {

    @Override
    public void displayStudentsByFilter(List<student> students, Predicate<student> pre, Consumer<student> con) {
        for (student s : students) {
            if (pre.test(s)) {
                con.accept(s);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<student> students, Function<student, String> fun) {
        return students.stream()
                .map(fun)
                .collect(Collectors.joining(", "));
    }

    @Override
    public student createStudent(Supplier<student> sup) {
        return sup.get();
    }

    @Override
    public List<student> sortStudentsById(List<student> students, Comparator<student> com) {
        return students.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    @Override
    public Stream<student> convertToStream(List<student> students) {
        return students.stream();
    }

    @Override
    public void displayStudents(List<student> students, Consumer<student> con) {
        for (student s : students) {
            con.accept(s);
        }
    }
}
