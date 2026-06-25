public class Main {
    public static void main(String[] args) {
        // // String s1="pk";
        // String s2="prakash";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.charAt(0));
        // System.out.println(s2.charAt(1));
        // System.out.println(s1.toLowerCase());
        // System.out.println(s2.toUpperCase());
        // System.out.println(s1.contains("p"));
        // System.out.println(s1.isEmpty());
        // System.out.println(s1.startsWith("p"));
        // System.out.println(s2.endsWith("k"));
        // System.out.println(s1.substring(1));
        // System.out.println(s1.substring(0,1));
        // char [] carray=s1.toCharArray();
        // for(char c:carray){
        // System.out.println(c+" ");
        // }
        // String rev="";
        // for(int i=s2.length()-1; i>=0; i--){
        // rev=rev+s2.charAt(i);

        // }
        // System.out.println(rev);
        // StringBuffer buf=new StringBuffer("Prakash pk");
        // System.out.println(buf);
        // StringBuilder buf2=new StringBuilder("pk");
        // System.out.println(buf2);
        // buf.insert(10,"nalla paiyan");
        // System.out.println(buf);
        // buf.replace(1, 3, null);
        // System.out.println(buf);
        // buf.reverse();
        // System.out.println(buf);
        // buf.setCharAt(4, 0);
        // StringBuffer sb = new StringBuffer("Ram-age is 12@");
        // int lower = 0, upper = 0, space = 0, vowels = 0, number = 0;
        // for (int i = 0; i < sb.length(); i++) {
        //     if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {
        //         lower++;

        //     }
        //     if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
        //         upper++;

        //     }
        //     if (sb.charAt(i) == 32) {
        //         space++;

        //     }
        //     if (sb.charAt(i) >= 48 && sb.charAt(i) <= 57) {
        //         number++;

        //     }

        // }
        // System.out.println(lower);
        // System.out.println(upper);
        // System.out.println(space);
        // System.out.println(number);
        StringBuffer a=new StringBuffer("PK.PRAKASH");
        System.out.println(a);
        // StringBuffer b=new StringBuffer();
        for(int i=0; i<a.length(); i++){
            if (a.charAt(i)>=65 && a.charAt(i)<=90) {
                // int c=(int)a.charAt(i)+32;
                // a.setCharAt(i,(char)c);
                int c=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);

                
            }
        }
        System.out.println(a);

    }
}