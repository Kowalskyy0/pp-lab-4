import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Bob Johnson", 50000, 0);
        employees[1] = new Worker("Bob Marley", 30000, "Position 1");
        employees[2] = new Employee("Hillary Clinton", 40000);
        employees[3] = new Employee("Joe Winter", 40000);
        employees[4] = new Worker("John Snow", 30000, "Position 2");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
