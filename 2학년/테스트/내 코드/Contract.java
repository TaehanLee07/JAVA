package test;

public class Contract implements Employee{

    double baseSalary;
    EmployeeType type = EmployeeType.CONTRACT;

    public Contract(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + type +
                '}';
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.CONTRACT.adjustBaseSalary(type, baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.CONTRACT;
    }

}
