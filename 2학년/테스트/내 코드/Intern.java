package test;

public class Intern implements Employee{

    double baseSalary;
    EmployeeType type = EmployeeType.INTERN;

    public Intern(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.INTERN.adjustBaseSalary(type, baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.INTERN;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + type +
                '}';
    }
}
