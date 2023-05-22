package methodtypes;

public class NoReturnNoParameters {
    public static void main(String[] args) {

        addition();
        NoReturnNoParameters obj = new NoReturnNoParameters();
        obj.substraction();
        obj.multiplication();
        // no return params
    }



    //no return no params
    public static void addition(){
        int a=5;
        int b=10;
         int ans=a+b;
        System.out.println("addition of two numbers is :"+ ans);
        System.out.println("Addition of two numbers "+a + " and "+b+" is : " +ans);
    }

    public void substraction(){
        int a=5;
        int b=10;
        int ans=b-a;
        System.out.println("This is Substraction method" );}

    public void multiplication(){
    }
}







