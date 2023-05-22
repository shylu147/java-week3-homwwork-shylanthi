package methodtypeshw;

import java.util.Scanner;

public class Programme19 {
    /** Write a Java program to convert a given string into lowercase.
     Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = s.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
