package blocks;

public class StaticBlock {
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("I am in main method" );
    }


}
