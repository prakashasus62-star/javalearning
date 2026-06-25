public class methodoverloading {
    public methodoverloading(){
        System.out.println("pk");
    }
    public static void main(String[] args) {
        System.out.println("method overloading");
        demo(args);
        demo(10,20);

    }
    public static void demo(String[] args) {
        System.out.println("hello");
        
    }
    public static void demo(int a,int b) {
        System.out.println(a+b);

        
    }
    
}
