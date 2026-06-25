import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int num:arr){
            if (num>max) {
                max=num;
                
            }
        }
        System.out.println(max);
        Arrays.sort(arr);
        System.out.println(arr[1]);
        for(int i=arr.length-1; i>=0; i--){
            System.out.print( arr[i]+" ");
        }
        sc.close();
        
    }
    
}
