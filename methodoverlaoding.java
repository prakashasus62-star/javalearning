 class Innermethodoverlaoding {
    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b, int c){
        return a+b+c;
    }

    
}
public class methodoverlaoding {
    public static void main(String[] args) {
        Innermethodoverlaoding m=new Innermethodoverlaoding();
            System.err.println(m.add(2,3));
             System.err.println(m.add(2,3,4));
    }
    }

    
