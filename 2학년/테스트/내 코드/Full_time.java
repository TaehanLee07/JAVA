package test;

public class Full_time implements Employee{

    double baseSalary;
    double bonus;
    EmployeeType employeeType = EmployeeType.FULL_TIME;

    public Full_time(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.FULL_TIME;
    }

    @Override
    public String toString() {
        return "Full_time{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType=" + employeeType.name() +
                '}';
    }
}
