package Examnation01082022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
. Write a program to sort 5 Employee objects based on salary and display
the names of those in decebding sorting order.
 */
public class SortingDecendingOrder {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pradip", 3000));
        employees.add(new Employee("Ram", 10000));
        employees.add(new Employee("Shyam", 4000));
        employees.add(new Employee("Hari", 8000));
        employees.add(new Employee("Krishna", 12000));

        // Sort the list of Employee objects by salary in descending order
        Collections.sort(employees);

        // Iterate through the sorted list and print the names of the employees in descending order of salary
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
