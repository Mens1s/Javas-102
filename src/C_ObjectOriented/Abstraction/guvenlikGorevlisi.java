package C_ObjectOriented.Abstraction;

public class guvenlikGorevlisi extends Memur {
    private String belge;

    public guvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {return belge;}

    public void setBelge(String belge) {this.belge = belge;}

    public void nobet(){System.out.println(this.getAdSoyad() + " nobet tutuyor!");}
}
