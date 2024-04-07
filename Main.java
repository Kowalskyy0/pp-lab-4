import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("John Doe", 5000, 0),
                new Worker("Jane Smith", 3000, "Engineer"),
                new Worker("Bob Johnson", 3500, "Developer"),
                new Manager("Alice Williams", 6000, 0),
                new Worker("Charlie Brown", 3200, "Designer"),
                new Worker("David Davis", 3300, "Tester"),
                new Worker("Eva Green", 3400, "Analyst")
        };

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
                employee.setSalary(employee.getSalary() + 500);
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(nonManagerCount);
                manager.setSalary(7500);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
