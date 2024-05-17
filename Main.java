import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", 3000, 1);
        Worker worker2 = new Worker("Steven", 3200, 2);
        Worker worker3 = new Worker("Bob", 3100, 3);
        Worker worker4 = new Worker("Mat", 3300, 4);

        Manager manager = new Manager("Daniel", 5000, 5);

        Worker[] workers = { worker1, worker2, worker3, worker4 };

        for (Worker worker : workers) {
            System.out.println("Worker salary: " + worker.getSalary());
            worker.work();
        }

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}
