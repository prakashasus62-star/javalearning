public class Low {

    public static void main(String[] args) {
    StringBuilder  a=new StringBuilder("tuTor joes coMputer educaton");
    System.out.println("original string:"+"a");
    if (a.charAt(0)>= 97 && a.charAt(0)<=122) {
        int c=(int)a.charAt(0)-32;
        a.charAt((char)c);
        
    }
    }
}