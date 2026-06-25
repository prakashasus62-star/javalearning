public class MethodOverloadingg {
        void sum(int a, int b){
            System.out.println(a+b);
        }
        void sum(int a, int b, int c){
            System.out.println(a+b+c);
        }
    public static void main(String[] args) {
        MethodOverloadingg obj = new MethodOverloadingg();
        obj.sum(10,20);
        obj.sum(10,20,30);
        
    }
    
}
