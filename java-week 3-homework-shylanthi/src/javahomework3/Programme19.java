package javahomework3;

public class Programme19 {
    /**Write a Java program to calculate the average value of array elements.
     */
    public static void m1(){
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

    public static void main(String[] args) {
        Programme19.m1();
    }
    }
