import java.util.*;
public class small{
    public static void find(int arr[], int n){
        
        int lar=Integer.MIN_VALUE;
        int secondlar=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>lar){
                secondlar=lar;
                lar=arr[i];
            }
            else if(arr[i]>secondlar && arr[i]!=lar){
                secondlar=arr[i];
            }
            if(arr[i]<small){
                secondsmall=small;
                small=arr[i];
            }
            else if(arr[i]<secondsmall && arr[i]!=small){
                secondsmall=arr[i];
            }
        }
        System.out.println("Largest element: " + lar);
        System.out.println("Second largest element: " + secondlar);
        System.out.println("Smallest element: " + small);
        System.out.println("Second smallest element: " + secondsmall);


    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        find(arr,n);
        sc.close();
    }
}