package javahomework3;

import java.util.Scanner;

public class Programme9 {
    /**Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     any other alphabet should be invalid entry
     */
public static void m1(){
    Scanner s=new Scanner(System.in);
    System.out.println("Please enter alphabet between A to F : ");
    String city=s.nextLine();

    switch(city){
        case "A":
        System.out.println("Aberdeen");
        break;
        case "B":
            System.out.println("Bath");
            break;
        case "C":
            System.out.println("Cambridge");
            break;
        case "D":
            System.out.println("Durham");
            break;
        case "E":
            System.out.println("Ely");
            break;
        case "F":
            System.out.println("Falkstone");
            break;
        default:
            System.out.println("alphabet should be invalid entry:");
            break;

}
}

    public static void main(String[] args) {
        Programme9.m1();
    }
}
