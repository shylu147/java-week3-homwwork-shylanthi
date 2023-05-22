package javahomework3;

import java.util.Scanner;

public class Programme10 {
    /**10.Write a java program to input any two number and ask user to enter their symbol (+, -,
     /, *) find addition, Subtraction, multiplication and division according to their symbol
     (using if else)
     */
    public static void m1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x=s.nextInt();
        System.out.println("Enter the second number : ");
        int y=s.nextInt();
        System.out.println("Enter the calcculation symbol +.-,*,/ : ");
        char symbol=s.next().charAt(0);
        s.close();

        if (symbol== '+'){    System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }

    public static void main(String[] args) {
        Programme10.m1();
    }
}
