package EmployeeDetails;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Sudhanshu",23,23000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
