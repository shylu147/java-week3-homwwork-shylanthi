package javastatements;

public class NestedIfElse {
    public static void main(String[] args) {

        int marks = 60;


        if (marks>=80) {
            System.out.println("distintion");
        } else if (marks<80 && marks>=70) {
            System.out.println("Grade A");
        } else if (marks<70 && marks>=60){
            System.out.println("Grade B");
        } else if (marks<50 && marks>=35){
            System.out.println("Pass");
        }
        System.out.println("Weldone");

    }

}
