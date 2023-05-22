package methodtypeshw;

import java.util.Scanner;

public class Programme10 {
/** Write a Java program that takes a number input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 ...
 8 x 10 = 80
 */

    public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);

    System.out.print("Input a number: ");
    int num1 = s.nextInt();

    for (int i=0; i< 10; i++){
        System.out.println(num1 + " x " + (i+1) + " = " +
                (num1 * (i+1)));
    }
}
}





