import java.util.*;
public class Binaryyyyyyy {
    public static void decimal(int n) {
        int [] binarynum=new int[1000];
        int i=0;
        while (n>0) {
            binarynum[i]=n%2;
            n=n/2;
            i++;
            
        }
        for(int j=i-1; j>=0; j--){
            System.out.println(binarynum[j]);
        }

        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        decimal(n);
        
        
    }
    
}
