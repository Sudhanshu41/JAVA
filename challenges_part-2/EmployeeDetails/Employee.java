package EmployeeDetails;

 class Employee {
    private String name;
    private int age;
    private double Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        Salary = salary;
    }
     String getEmployeeDetails(){
        return "Employee Details: Name:"+name
                +", Age:"+age
                +", Salary"+Salary;
    }
}
