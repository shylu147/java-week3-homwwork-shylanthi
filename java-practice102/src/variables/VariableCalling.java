package variables;

public class VariableCalling {

    String name= "Prime"; // instance
    static int number = 100; // static variable

    public static void main(String[] args) {
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        obj.m1();
        System.out.println(VariableCalling.number);
        System.out.println(number);


    }

    public void m1(){
        int a=10;
        System.out.println(a);
        System.out.println(VariableCalling.number);
        System.out.println(number);


    }

    }



