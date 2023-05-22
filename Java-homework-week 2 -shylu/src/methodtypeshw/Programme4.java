package methodtypeshw;

public class Programme4 {
    /** Declare two instance and two static variables.
     * Declare one instance method.
     * Declare one static method.
     * Call all four instance and static variables into both instance and static methods inside the
        print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme.
      */
    int a=10;
    int b=20;
    static int c=2;
    static int d=3;

    static void m1(){
        Programme4 obj=new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);}

    void m2 (){
        Programme4 obj=new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);}

    public static void main(String[] args) {
     Programme4 t=new Programme4();
     t.m2();
     Programme4.m1();}
    }







