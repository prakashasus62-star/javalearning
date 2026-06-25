// import java.util.*;
class practice{
    public static void main(Main[] args){
        // Scanner sc=new Scanner(System.in);
        // int num=s.nextInt();
        // int evensum=0,oddsum=0;
        // while (num!=0) {
        //     int digit=num%10;
        //     if(digit%2==0){
        //         evensum++;
        //     }
        //     else{
        //         oddsum++;
        //     }
        //     num=num/10;
        // }
        // System.out.println(evensum-oddsum);
        // s.close();
        // System.out.println("pk");
        // int num=sc.nextInt();
        // int removenum=sc.nextInt();
        // int removecrt=0;
        // int place=1;
        // while(num>0){
        //     int digit=num%10;
        //     if (digit!=removenum) {
        //         removecrt =digit*place+removecrt;
        //         place=place*10;

                
        //     }
        //     num=num/10;
        // }
        // System.out.println(removecrt);
        // int num=sc.nextInt();
        // int sum=0;
        // for(int i=1; i<num; i++){
        //     if (num%i==0) {
        //         sum=sum+i;
                
        //     }
        // }
        // if (num==sum) {
        //     System.out.println("Perfect number");
            
        // }
        // else{
        //     System.out.println("Not a perfect number");
        // }
        // sc.close();
        // int start=10;
        // int end=30;
    //     for(int i=start; i<=end; i++){
    //         int count=0;
    //         for(int j=1; j<=i; j++){
    //             if(i%j==0){
    //                 count++;
    //             }
                
                
    //         }
    //         if (count==2) {
    //                 System.out.println(i+" ");
                    
    //     }
        


    // }
    int start=10;
    int end=30;
    int a=1,b=0;
    while (b<=end) {
        if (b>=start) {
            System.out.println(b+"");
            
        }
        int c=a+b;
        a=b;
        b=c;

        
    }

}
}