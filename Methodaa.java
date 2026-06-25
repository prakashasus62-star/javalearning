class animal{
    void eat(){
        System.out.println("This is animal class");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("This is dog class");
    }
}
public class Methodaa {
    public static void main(String [] args){
        dog Dog = new dog();
        Dog.eat();
    }
    
    
}
