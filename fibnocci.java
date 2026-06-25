import java.util.Scanner;

public class fibnocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=-1;
        int b=1,c;
        for(int i=0; i<=n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        

        }
        sc.close();
    }
    
}
