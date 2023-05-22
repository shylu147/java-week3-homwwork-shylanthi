package arrays;

import java.security.SecureRandom;

public class ArraysDemo {
    public static void main(String[] args) {
        //Array declaration
        int x[];
        int y[];
        String studentsName[];

        //Approach 1
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(a[2]);
        //dif bw length() and length
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    //Approach 2
        int z[]=new int[5];
        z[0]=11;
        z[1]=12;
        System.out.println(z[1]);

        String names[]= {"Java,C++,Pythone"};
        System.out.println(names[0]);

    }


}
