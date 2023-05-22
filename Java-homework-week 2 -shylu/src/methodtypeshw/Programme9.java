package methodtypeshw;

import java.util.Scanner;

public class Programme9 {
    /**  Write a program to convert the upper case to lower case.
     */
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = s.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
