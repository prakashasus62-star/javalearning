import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0;
        for(int n=1; n<=999; n++){
           for(int i=0; i<=n; i++){
             if (n%i==0) {
                f++;

                
            }
           }
            if (f==2) {
                System.out.println(n);
                
            }
            f=0;
            


        }
        // if (f==2) {
        //         System.out.println("prime number");
                
        //     }
        //     else{
        //         System.out.println("not a prime number");
        //     }

        // sc.close();


    }
    
}
