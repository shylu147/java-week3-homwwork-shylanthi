package javahomework3;

import java.util.Scanner;

public class Programme16{
    /**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     “ZERO”
     */
    public static void m1() {
        Scanner s  = new Scanner(System.in);
        System.out.println("Input a Number : ");
        int number = s.nextInt();
        s.close();
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }

    public static void main(String[] args) {
        Programme16.m1();
    }
}
