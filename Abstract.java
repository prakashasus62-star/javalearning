abstract class Animal {

    abstract void display();

    void sound() {

        System.out.println("sound makes");
    }
}

class Dog extends Animal {

    void display() {

        System.out.println("Display method");
    }

    void sleep() {

        System.out.println("Java");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();

        d.sound();

        d.sleep();
    }
}
