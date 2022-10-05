package C_ObjectOriented.Abstraction;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {return kapiNo;}
    @Override
    public void giris(){
        super.giris();
        System.out.println("Ogretim gorevlisi giris yapti inanir misin? ");
    }

    @Override
    public void derseGir(String dersSaati){
        System.out.println(this.getAdSoyad() + " Derse "+dersSaati+" 'da girdi");
    }
    public void setKapiNo(String kapiNo) {this.kapiNo = kapiNo;}
}
