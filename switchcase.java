import java.util.Scanner;

// public class switchcase {
//     public static void main(String[] args) {
//         Scanner inn=new Scanner(System.in);
//          int ch=inn.nextInt();
//          switch (ch) {
//             case 1:
//                 System.out.println("break");
                
//                 break;
//             case 2:
//                 System.out.println("add");
         
//             default:
//                 System.out.println("bye");
//                 break;
//          }
//          inn.close();
    
//     }
// }
// public class switchcase {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         switch (ch) {
//           case 'a':
//           case 'b':
//           case 'c':
//           case  'd':
//             System.out.println("vowels");
//             break;
//             default:
//                 System.out.println("constant");
//         }
//         sc.close();
//     }
// }
public class switchcase {

    public static void main(String[] args) {
    //     int numbers[]={10,20,30,40,50};
    //     for(int n:numbers){
    //         System.out.println(n);
    //     }
    // }
    for (int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
}