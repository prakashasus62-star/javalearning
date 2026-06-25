import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the table");
        int t=sc.nextInt();
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(i+"x"+t+"="+(t*i));
        }
    }
    
}
