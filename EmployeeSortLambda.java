import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', age=%d, salary=%.2f}", name, age, salary);
    }
}

public class EmployeeSortLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sunil", 30, 50000.00));
        employees.add(new Employee("Mahesh", 25, 60000.00));
        employees.add(new Employee("Rahul", 35, 55000.00));

        // Sorting by name
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by name: " + employees);

        // Sorting by age
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("Sorted by age: " + employees);

        // Sorting by salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("Sorted by salary: " + employees);
    }
} 
//  Output
// Sorted by name: [Employee{name='Mahesh', age=25, salary=60000.00}, Employee{name='Rahul', age=35, salary=55000.00}, Employee{name='Sunil', age=30, salary=50000.00}]
// Sorted by age: [Employee{name='Mahesh', age=25, salary=60000.00}, Employee{name='Sunil', age=30, salary=50000.00}, Employee{name='Rahul', age=35, salary=55000.00}]
// Sorted by salary: [Employee{name='Sunil', age=30, salary=50000.00}, Employee{name='Rahul', age=35, salary=55000.00}, Employee{name='Mahesh', age=25, salary=60000.00}] 
 