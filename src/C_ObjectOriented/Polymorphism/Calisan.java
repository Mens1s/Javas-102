package C_ObjectOriented.Polymorphism;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {return this.adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}

    public String getTelefon() {return telefon;}
    public void setTelefon(String telefon) {this.telefon = telefon;}

    public String getEposta() {return eposta;}
    public void setEposta(String eposta) {this.eposta = eposta;}

    public void giris(){
        System.out.println(this.getAdSoyad() + " uniye giris yapti");
    }
    public void giris(String girisSaati){System.out.println(this.getAdSoyad() + " uniye " + girisSaati + " bu saatte giris yapti." );}
    public void cikis(){
        System.out.println(this.getAdSoyad() + "üniye cikis yapti");
    }
    public void yemekhane(){
        System.out.println(this.getAdSoyad() + "yemekhaneye girdi");
    }

    public static void girisYapanlar(Calisan[] loginUsers){
        for (Calisan user:loginUsers) {
            user.giris();
        }
    }
}
