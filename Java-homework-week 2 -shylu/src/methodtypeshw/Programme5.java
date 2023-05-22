package methodtypeshw;

import java.util.Scanner;

public class Programme5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner((System.in));
        int n1=10;
        int n2=20;
        Programme5 t=new Programme5();
        Programme5.addition(n1,n2);
      Programme5.substraction(n1,n2);
      t.multiplication(n1,n2);
      t.division(n1,n2);

    }
    static void addition(int n1,int n2){

        System.out.println(n1+n2);
    }
    static void substraction(int n1,int n2){
        System.out.println(n1-n2);

    }
    void multiplication(int n1,int n2){
        System.out.println(n1*n2);
    }
    void division(int n1, int n2){
        System.out.println(n1/n2);
    }
    }










