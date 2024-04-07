package employees;

public class Worker extends Employee {
    public String position;

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return getName();
    }

    @Override
    public String toString() {
        return "Worker: " + getFullName() + ", Salary: " + getSalary() + ", Position: " + position;
    }
}