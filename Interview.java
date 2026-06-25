public class Interview {
    int id;
        String name;
        void display(){
            System.out.println(id);
            System.out.println(name);
        }
    public static void main(String args[]){
        
        Interview sc=new Interview();
        sc.id=101;
        sc.name="Sachin";
        sc.display();
    
}
}
