import java.util.Scanner;

public class Storng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originum=n;
        int sum=0;
        for(; n>0;){
            int digit=n%10;
            int fact=1;
            for(int i=1; i<=digit; i++){
                fact*=i;
            }
            sum+=fact;
             n=n/10;
             

        }
        if (originum==sum) {
                System.out.println("Strong number");

            
        }
        else{
            System.out.println("not");
        }
    }
    
}
