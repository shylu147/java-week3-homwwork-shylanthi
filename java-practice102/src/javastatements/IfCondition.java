package javastatements;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int age=21;
        if(age>=18){
            System.out.println("Eligible for vote"); //logic outside the main method

        }
        if (age<17){
        }
        System.out.println("Hello");
    }
}
