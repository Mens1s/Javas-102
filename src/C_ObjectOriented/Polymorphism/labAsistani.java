package C_ObjectOriented.Polymorphism;

public class labAsistani extends Asistan {

    public labAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvani, String ofisSaati){
        super(adSoyad,telefon,eposta,bolum,unvani,ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + "Laba girdi!");
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad() + "derse girdi!");
    }
}
