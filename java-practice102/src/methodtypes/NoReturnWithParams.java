package methodtypes;

public class NoReturnWithParams {

    public static void main(String[] args) {
        NoReturnWithParams obj = new NoReturnWithParams();
        obj.addition(10, 20);
        obj.addition(5, 6);
        courseName("Selenium");
    }

    // no return type-void
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }
    public static void courseName(String course){
        System.out.println(course);


    }


}


