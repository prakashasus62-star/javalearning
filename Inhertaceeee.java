class summaation {
    void displayyy(){
        System.out.println("This is parent class");
    }
    
}
class child extends summaation{
    void display(){
        System.out.println("This is child class");
    }
   
}
class child2 extends child{
    void displayu(){
        System.out.println("this is child class 2");
    }
}
public class Inhertaceeee{
     public static void main(String [] args){
        child2 c=new child2();
        c.displayu();
    }
}
