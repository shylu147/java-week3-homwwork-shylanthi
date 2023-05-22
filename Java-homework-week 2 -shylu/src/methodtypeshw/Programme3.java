package methodtypeshw;

public class Programme3 {

    /**
     * Declare one instance and one static variable.
     * Declare one instance method.
     * Declare one static method.
     * Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme.
     */
    int a = 10; //instance variable
    static int b = 20;//static variable

    void m1() //instance method
    {
        System.out.println(a);
        System.out.println(b);
    }

    static void m2() //static method
    {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Programme3 t = new Programme3();
        t.m1();                            // instance method calling
        Programme3.m2();                     // static method calling

    }


}
