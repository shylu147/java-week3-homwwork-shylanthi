package blocks;

public class InstanceBlock {
    String  name;

    {
        System.out.println("Instance block");
        name="Prime";
    }
    void display (){
        System.out.println(name);
    }

    public static void main(String[] args) {
        InstanceBlock t=new InstanceBlock();




    }

}
