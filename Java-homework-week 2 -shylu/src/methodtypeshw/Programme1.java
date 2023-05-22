package methodtypeshw;

public class Programme1 {
    /**
     * Declare two instance variables.
     * Declare one instance method.
     * Call both instance variables into the instance method inside the print statement.
     * Declare the Main method.
     * Call the above instance method into the Main method and Run the programme.
     */
    int a = 2;
    int b = 3;

    public void m1(){
        Programme1 obj =new Programme1();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public static void main(String[] args) {
        Programme1 t=new Programme1();
        t.m1();
    }
    }






















