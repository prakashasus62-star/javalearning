public class bin_dec {
    public static int binner(int binary){
        int decimal=0;
        int power=0;
        while (binary!=0) {
            int reminder=binary%10;
            decimal+=reminder*Math.pow(2, power);
            power++;
        }
        System.out.println(decimal);

    }
    public static void main(String[] args) {
        System.out.println(binner(1100));
    }
    
}
