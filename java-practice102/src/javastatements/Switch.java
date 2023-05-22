package javastatements;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

public class Switch {
    public static void main(String[] args) {

        int day=2;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Frinday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid week number");

        }
        System.out.println("hello");


    }

}
