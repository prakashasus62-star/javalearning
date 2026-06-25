import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a key elememt");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==key) {
                System.out.println("key element is found"+key);
                found=false;
                break;
                
            }
            if (!found) {
                System.out.println("elemrnt is not found");
                
            }
        }
        sc.close();

        
    }
    
    
}
