import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Manager Name", 50000, 0);
        employees[1] = new Worker("Worker 1", 30000, "Position 1");
        employees[2] = new Employee("Employee 1", 40000);
        employees[3] = new Employee("Employee 2", 40000);
        employees[4] = new Worker("Worker 2", 30000, "Position 2");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
