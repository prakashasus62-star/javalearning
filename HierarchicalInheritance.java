class Animal {
    void eat(){
        System.out.println("This animal eats food");
    }

    
}
class Dog extends Animal{
    void bark(){
        System.out.println("this is dog class");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("this is cat class");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        cat Cat = new cat();
        
        dog.eat();
        dog.bark();
        
        Cat.eat();
        Cat.meow();
    }
}
