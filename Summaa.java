public class Summaa {
    public static void main(String[] args) {
        // String a="prakash";
        // String b="prakahs";
        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        // System.out.println(a.equals(b));
        // System.out.println(a.equalsIgnoreCase(b));
        // System.out.println(a.length());
        // System.out.println(a.toLowerCase());
        // System.out.println(b.toLowerCase());
        // System.out.println(a.length());
        // System.out.println(a.replace(a, a));  
        // System.out.println(a.contains(b));
        // System.out.println(a.isEmpty()
        // );
        // System.out.println(a.endsWith("es")) ;
        // System.out.println( a.substring(1, 5));
        // char [] carray=a.toCharArray();
        // for(char c: carray){
        //     System.out.println(c+" ");
        // }
        StringBuffer buffer= new StringBuffer("prakash");
        System.out.println(buffer);
        // buffer.append(" joes");
        System.out.println(buffer);
        buffer.insert(8, 0);
        System.out.println(buffer);


    }
    
}
