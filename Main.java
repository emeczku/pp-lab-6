import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all Managers: " + totalManagerSalary);
        System.out.println("Total salary of all Workers: " + totalWorkerSalary);

        Map<Integer, List<Employee>> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.computeIfAbsent(employee.hashCode(), k -> new ArrayList<>()).add(employee);
        }

        System.out.println("Duplicate employees based on ID:");
        for (Map.Entry<Integer, List<Employee>> entry : employeeMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("ID: " + entry.getKey());
                for (Employee employee : entry.getValue()) {
                    System.out.println("- " + employee.getName() + " (Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
                }
            }
        }
    }

    private static List<Employee> getEmployees() {
        Worker worker1 = new Worker("Tom", 3000, 1, "2023-01-15", "Developer");
        Worker worker2 = new Worker("Steven", 3200, 2, "2023-03-22", "Tester");
        Worker worker3 = new Worker("Bob", 3100, 2, "2023-05-30", "Designer");
        Worker worker4 = new Worker("Diana", 3300, 4, "2018-07-19", "Developer");
        Worker worker5 = new Worker("Emma", 3400, 1, "2022-09-10", "Developer");

        Manager manager1 = new Manager("Daniel", 5000, 5, "2023-11-11", "Project Manager");
        Manager manager2 = new Manager("Frank", 5500, 2, "2016-08-05", "Senior Manager");
        Manager manager3 = new Manager("John", 6000, 5, "2015-04-22", "Operations Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);
        return employees;
    }
}