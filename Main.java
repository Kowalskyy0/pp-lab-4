import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("John Doe", 5000, 0),
                new Worker("Jane Smith", 3000, "Engineer"),
                new Worker("Bob Johnson", 3500, "Developer"),
        };

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            Manager manager = (Manager) employees[0];
            manager.setNumberOfSubordinates(nonManagerCount);
            manager.setSalary(7500);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
