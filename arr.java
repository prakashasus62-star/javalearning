import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
         int b[];
         b=new int[10];
         for(int element:b){
            System.out.println(element);
         }
         for(int i=0; i<10; i++){
          Scanner in=new Scanner(System.in);
          b[i]=in.nextInt();  
         }
         for(int element:b){
            System.out.println(element);
         }

    }
    
}
