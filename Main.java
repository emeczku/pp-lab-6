import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", 3000, 1, "2023-01-15", "Developer");
        Worker worker2 = new Worker("Steven", 3200, 2, "2023-03-22", "Tester");
        Worker worker3 = new Worker("Bob", 3100, 2, "2023-05-30", "Designer");

        Manager manager = new Manager("Daniel", 5000, 5, "2023-11-11", "Project Manager");


        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println("worker3 equals worker1: " + worker3.equals(worker1));
        System.out.println("worker3 equals worker2: " + worker3.equals(worker2));
        System.out.println("worker3 equals manager: " + worker3.equals(manager));
    }
}