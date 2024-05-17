import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", 3000, 1, "2023-01-15", "Developer");
        Worker worker2 = new Worker("Steven", 3200, 2, "2023-03-22", "Tester");
        Worker worker3 = new Worker("Bob", 3100, 3, "2023-05-30", "Designer");
        Worker worker4 = new Worker("Mat", 3300, 4, "2023-07-19", "Developer");

        Manager manager = new Manager("Daniel", 5000, 5, "2023-11-11", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ").");
        }
    }
}