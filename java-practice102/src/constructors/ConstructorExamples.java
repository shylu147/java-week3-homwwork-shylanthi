package constructors;

import java.util.concurrent.Callable;

public class ConstructorExamples {

    int empID; //value not assigned , ins variables throughout class
    String empName;

    public ConstructorExamples(int empID,String empName){
        this.empID=empID;// local var  keyword this
        this.empName=empName;
    }

    public static void main(String[] args) {
       ConstructorExamples obj=new ConstructorExamples(10,"Nira");
       obj.demo();
       obj.demo();
    }
public void demo(){
    System.out.println(empID);
    System.out.println(empName);

}

}
