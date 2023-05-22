package stringexamples;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {
       String s1= "This is my first string";
       String s2= "This is my second string";
       String s3="";

           int l1 =s1.length();// lengh method is used
        System.out.println(l1);

        int l2=s2.length();
        System.out.println(l2);

        System.out.println(s1.contains("This"));
        System.out.println(s2.contains("first"));
        System.out.println(s1.toUpperCase());
        System.out.println(s3.isEmpty());

    }

}
