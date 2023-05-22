package methodtypeshw;

import java.util.Scanner;

public class Programme6 {
    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r)
     */
    public static void area(double r)
    {
     double Area= 3.14*r*r;

        System.out.println("Area of the circle= " + Area);
    }

    public static void main(String[] args)
    {  Scanner s=new Scanner((System.in));
        System.out.println("Enter the radius of the circle:");
        double R=s.nextDouble();
        Programme6.area(R);




    }


    }




