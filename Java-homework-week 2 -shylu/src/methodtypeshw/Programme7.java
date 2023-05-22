package methodtypeshw;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = s.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
    }
















