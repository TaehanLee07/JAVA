package test;

public enum EmployeeType {
    FULL_TIME(), CONTRACT(), INTERN();


    public double adjustBaseSalary(EmployeeType emp, double baseSalary) {
        if (emp.name().equals("FULL_TIME")) {
            baseSalary *= 1;
        }
        else if (emp.name().equals("CONTRACT"))
             baseSalary *= 0.8;
        else if (emp.name().equals("INTERN"))
             baseSalary *= 0.5;
        else
            System.out.println("계산 X");

        return baseSalary;
    }

}
