package test;

public class TestEmployee {
    public static void main(String[] args) {
        Employee fullEmp = new Full_time(3000, 500);
        Employee contractEmp = new Contract(2500);
        Employee internEmp = new Intern(1500);

        System.out.println("fullEmp Salary = " + fullEmp.calculateSalary());
        System.out.println("contractEmp Salary = " + contractEmp.calculateSalary());
        System.out.println("internEmp Salary = " + internEmp.calculateSalary());

        System.out.println();

        System.out.println(fullEmp.toString());
        System.out.println(contractEmp.toString());
        System.out.println(internEmp.toString());
    }
}
