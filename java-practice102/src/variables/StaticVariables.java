package variables;

public class StaticVariables {

    /** scope within the class
     * memory allocation when class is loaded
     */
    static int a=10;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);  //call with class name

    }

    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);




    }



}
