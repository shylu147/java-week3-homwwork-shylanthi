package javahomework3;

import java.util.Scanner;

public class Programme2 {
    /**Write a java program to input any year like (ex.2007) and find out if it is leap year or
     not?
     */
    public static void m1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Input the year: ");
        int year=s.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year %100)!=0;
        boolean z=(year %100==0) && (year%400==0);

        if(x && (y||z)){
            System.out.println(year  + "is a leap year");
        }
        else{
            System.out.println(year + "is not a leap year");
        }
    }

    public static void main(String[] args) {
        Programme2.m1();
    }
}
