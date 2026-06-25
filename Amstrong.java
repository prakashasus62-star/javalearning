import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int digit1,digit2,digit3;

        for(int num=100; num<=999; num++){
            int temp=num;
            digit3=temp%10;
        temp=temp/10;

        digit2=temp%10;
        temp=temp/10;
        digit1=temp%10;
        temp=temp/10;
        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (num==result) {
            System.out.println(num);
            
        }
        }
        // else{
        //     System.out.println("not a amstrong number");
        // }
         
    }
    
}
 