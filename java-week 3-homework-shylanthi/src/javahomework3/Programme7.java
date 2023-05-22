package javahomework3;

import java.util.Scanner;

public class Programme7 {
    public static void m1(){
        Scanner s = new Scanner(System.in);
        System.out.println( " Enter Sales Id :");
        int salesId = s.nextInt();
        System.out.println( " Enter Seller's name :");
        String name = s.next();
        System.out.println(" Enter Sales Amount :");
        int sales = s.nextInt();
        System.out.println(" Enter basic Salary :");
        int basic = s.nextInt();

        s.close();

        if (sales>=50000){
            System.out.println("Commission : " + (sales*35)/100);
        } else if (sales>=30000) {
            System.out.println("Commisssion :" +(sales*20)/100);
        }else if (sales>=20000) {
            System.out.println("Commisssion :" + (sales * 10) / 100);
        }else if (sales>=10000) {
            System.out.println("Commisssion :" + (sales * 5) / 100);
        }else {
            System.out.println("Commisssion :" + (sales * 2) / 100);
        }
    }

    public static void main(String[] args) {
        Programme7.m1();
    }
}