public class constructor {
    int id;
    String name;
    constructor(){
        id=101;

    }
    void display(){
        System.out.println(id);
    }
    public static void main(String[] args) {
        constructor pk=new constructor();
        pk.display();
    }
    
}
