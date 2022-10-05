package C_ObjectOriented.Polymorphism;

public class bilgiIslem extends Memur {
    private String gorev;

    public bilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev){
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }
    public String getGorev(){return this.gorev;}
    public void setGorev(String gorev){this.gorev = gorev;}
    public void networkKurulum(){
        System.out.println(this.getAdSoyad() + " networku kurdu!");
    }
}
