public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Doe", 3000);
        employees[1] = new Employee("Jane Doe", 3500);
        employees[2] = new Employee("Jim Smith", 4000);
        employees[3] = new Employee("Jill Johnson", 4500);
        employees[4] = new Employee("Joe Brown", 5000);

        System.out.println(employees[3].toString());

        employees[3].setSalary(5000);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
