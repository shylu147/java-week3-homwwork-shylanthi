package javahomework3;

import java.util.Scanner;

public class Programme1 {
    /**Write a java program that tells us that Input number is odd or even?
     HINT: use ternary operator (? :)
     */
        public static void m1(){

            Scanner s = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = s.nextInt();

            String evenOdd = (num % 2 == 0) ? "even" : "odd";
            System.out.println(num + " is " + evenOdd);
        }

    public static void main(String[] args) {
            Programme1.m1();
    }




    }



