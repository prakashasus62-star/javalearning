 class enacp {
    
 private String name;
    private int age;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;

    }
}
public class Encapsulation {
    public static void main(String[] args) {
        enacp s=new enacp();
        s.setName("pk");
        s.setAge(12);
        System.out.println(s.getname());
        System.out.println(s.getage());
    }
   
    
}
