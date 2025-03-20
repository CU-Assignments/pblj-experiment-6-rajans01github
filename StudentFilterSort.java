import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Sunil", 78),
            new Student("Dev", 65),
            new Student("Mahesh", 85),
            new Student("Akash", 90),
            new Student("Ayush", 72)
        );

        // Filtering students with marks > 75, sorting by marks, and displaying names
        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble(s -> s.marks))
            .map(s -> s.name)
            .collect(Collectors.toList());

        System.out.println("Students scoring above 75%, sorted by marks: " + topStudents);
    }
}
// Output
// Students scoring above 75%, sorted by marks: [Ayush, Sunil, Mahesh