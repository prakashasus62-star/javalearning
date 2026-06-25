import java.util.*;
public class Binary {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n; i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Key element");
    int key=sc.nextInt();
    int index=Arrays.binarySearch(arr,50);
    System.out.println(index);
    if (index==key) {
        System.out.println("key element find");
        
    }
    else{
        System.out.println("not found");
    }
    sc.close();
    
    }
}
