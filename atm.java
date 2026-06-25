public class atm {
    private int atmId;
    private String location;
    public void setAtmid(int atmId){
        this.atmId=atmId;

    }
    public int getatmId(){
        return atmId;
    }
    public void setlocation(String location){
        this.location=location;
    }
    public String getlocation(){
        return location;
    }


    
}
public class Encasulation {
    public static void main(String[] args) {
        atm a1=new atm();
        a1.setAtmid(12);
        a1.setlocation("salem");
        System.out.println(a1.getatmId());
        System.out.println(a1.getlocation());
    }
    
}
