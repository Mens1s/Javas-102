package C_ObjectOriented.Inheritance;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Ahmet Yigit","5544454543","a@a.com");
        Akademisyen a1 = new Akademisyen("Patika Dev","18818181818","b@b.com","CSE","PROF");
        Memur m1 = new Memur("Ali Veli","123343","a@aa.com","Bilgi islem","09-00:18-00");
        OgretimGorevlisi o1 = new OgretimGorevlisi("R","1","1","1","1","1");
        labAsistani l1 = new labAsistani("r","r","r","r","r","1");
        bilgiIslem b1 = new bilgiIslem("a1","a","21","21","12","12");
        guvenlikGorevlisi g1 = new guvenlikGorevlisi("ua","as","21","3123","213","21313");
        g1.nobet();
        System.out.println(g1.getAdSoyad() + g1.getBelge());
    }
}
