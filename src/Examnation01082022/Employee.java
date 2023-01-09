package Examnation01082022;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.salary == other.salary) {
            return 0;
        } else if (this.salary > other.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}

