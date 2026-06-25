import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int o,e;
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0; i<=n; i++){

            a[i]=in.nextInt();

        }
        for(int element:a){
            if (element%2==0) {
                e++;
                
            }
            else{
                o++;
            }
        }
    }
    
}
