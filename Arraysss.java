import java.util.Scanner;
import java.util.Arrays;

public class Arraysss {
    public static int[] sortArray(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        return a;


        



    }
    public static void main(String[] args) {
        int arr[] =sortArray();
        for(int a:arr){
            System.out.println(a);
        }
        
        
    }
    
}
