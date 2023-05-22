package javahomework3;

import java.util.Scanner;

public class Programme6 {
  public static void m1(){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
    int num=s.nextInt();
    if(num%2==0)
        System.out.println(num +  " is even");
    else
        System.out.println(num  +  " is odd");

  }

    public static void main(String[] args) {
        Programme6.m1();
    }

    }

