class Animal {
    void sound(){
        System.out.println("Animal wow");
    }


    
}
class mn extends Animal{
    void sund(){
        System.out.println("mn");
    }
}
public class Inhritance {
    public static void main(String[] args) {
        mn d=new mn();
        d.sound();
    }

}
