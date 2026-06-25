public class jagged {
    public static void main(String[] args) {
      int a[][]= {
        {10,20,30},
        {10,203,04,40},
        {10,20,304,40,40}
      };
      for(int k[]:a){
        for(int l:k){
            System.out.print(l);
        }
        System.out.println();

      }
    }
    
}
