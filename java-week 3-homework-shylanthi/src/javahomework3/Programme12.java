package javahomework3;

import java.util.Scanner;

public class Programme12 {
    /**Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void m1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = s.next().charAt(0);
        s.close();
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");

    }}

    public static void main(String[] args) {
        Programme12.m1();
    }
}
