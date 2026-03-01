package FunctionalProgramming;

import java.util.List;

public class TestingEmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Prashant",100),
                new Employee("Sudhanshu",1000),
                new Employee("Harshit",10000),
                new Employee("Samarth",100000)
        );
        employees.stream()
                .sorted((emp1,emp2)-> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
