package constructors;

import java.util.concurrent.Callable;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Zero args constructors");
    }
    public ConstructorDemo(int a){
        System.out.println("one args constructors"+a);
    }
    public ConstructorDemo(String name){
        System.out.println("one args constructors" +name);
    }
    public  ConstructorDemo(int a, int b){
        System.out.println("one args constructors"+(a+b));

    }

    public void addition(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        ConstructorDemo t= new ConstructorDemo();// calling zero args cons
        ConstructorDemo t1= new ConstructorDemo(10);// 1 args
        ConstructorDemo t2=new ConstructorDemo("prime");
        ConstructorDemo t3 = new ConstructorDemo(10,20);
        t.addition();

        }

    }




