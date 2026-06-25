class Innermathematical {
    public static int sub(int base, int power) {
        int result =1;
        for(int i=0; i<=power; i++){
            result *=base;
        }
         return result;
    }
   

    
} 
public class mathematical {

    public static void main(String[] args) {
        System.out.println(Innermathematical.sub());
        
    }
    
}
