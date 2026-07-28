import java.util.*;

public class Demp{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str [] = new String [4];
        int i = 0;
        while(n>0){
             
            int rem = n%10;
            int num = 1;
            rem += 2;
            if(rem == 10){
                str [i] = "0";
                num = 0;
            }
            if(rem >10){
                String s  = Integer.toString(rem);
                String ch [] = s.split("");
                num = 0;
                str [i] = ch[0];
            }
            if(num == 1){
                str [i] = Integer.toString(rem); 
            }
            n /= 10;
            i++;
            
        }
        for(int j = str.length-1 ; j>=0;j--){
            System.out.print(str[j]);
        }
    }
}