package javahomework3;

import java.util.Scanner;

public class Programme8 {
    public static void m1(){
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city=s.nextLine();
        if (city.equals("A")) {
            System.out.println("Aberdeen");
        } else if (city.equals("B")) {
            System.out.println("Bath");
        } else if (city.equals("Cambrdge")) {
            System.out.println("Castle");
        } else if (city.equals("D")) {
            System.out.println("Durham");
        } else if (city.equals("E")) {
            System.out.println("Ely");
        } else if (city.equals("F")) {
            System.out.println("Falkstone");
        } else {
            System.out.println("alphabet should be invalid entry:");
        }
    }

    public static void main(String[] args) {
        Programme8.m1();
    }
}
