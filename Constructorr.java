class Rectang {
    int height,width;
    Rectang(){
        
        System.out.println("constructor called");
        height=10;
        width=20;

    }
    public Rectang(float x,float y){
        height=(int)x;
        width=(int)y;

    }
    int area(){
        int a=height*width;
        return a;

    }

    
}
public class Constructorr {
    public static void main(String[] args) {
        Rectang in=new Rectang();
        System.out.println(in.area());
        Rectang in1=new Rectang(3, 4);
        System.out.println(in1.area());
        
    }
    
}
