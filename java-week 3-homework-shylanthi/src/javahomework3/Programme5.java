package javahomework3;

import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name :  ");
        String name = s.nextLine();

        System.out.println("Enter Your EmployeeID:  ");
        int employeeId = s.nextInt();

        System.out.println("Enter Your Basic Salary:  ");
        double basicSalary = s.nextDouble();

        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTa(basicSalary);
        double pf = calculatePF(basicSalary);

        double grossSalary = basicSalary + hRA + da + ta + pf;
        System.out.println("---------------------------------------");
        System.out.println("|               Salary Slip           |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                  |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");

        s.close();
    }

    public static double calculateHRA (double basicSalary ) { return (basicSalary * 10 ) / 100; }
    public static double calculateDA (double basicSalary ) { return (basicSalary * 8 ) / 100; }
    public static double calculateTa (double basicSalary ) { return (basicSalary * 9 ) / 100; }
    public static double calculatePF (double basicSalary ) { return (basicSalary * 20 ) / 100; }


}
