package Z_Homeworks.PatikaStore;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 1;
        Scanner scn = new Scanner(System.in);


        Product.productList.put("Telephone", new HashMap<Integer, Product>());


        Product.productList.put("Laptop",new HashMap<Integer, Product>());


        while(choice != 0){

            System.out.println("""
                    PatikaStore Urun Yonetim Paneli !
                    1 - Notebook Islemleri
                    2 - Cep Telefonu Islemleri
                    3 - Marka Listele
                    0 - Cikis Yap\n\n
                    Tercihiniz : """);

            choice = scn.nextInt();
            System.out.println("\n\n\n");
            if(choice == 1 ){
                System.out.println("Laptop islemlerine Hos Geldiniz.\n1 - Telefon Ekle 2 - Telefon Cikar 3 - Filtrele");
                choice = scn.nextInt();


                if(choice == 1){
                    System.out.print("Enter id : ");
                    int id = scn.nextInt();
                    Laptop.add(id, new Laptop(choice, 15, 9999,10, "Iphone XR","Laptop",Brand.getBrand(3),128,3200,12,6.3));
                }
                else if (choice == 2){
                    System.out.print("Enter id : ");
                    int id = scn.nextInt();
                    Laptop.productList.get("Laptop").get(id).delete("Telephone");
                }
                else if(choice == 3){
                    System.out.println("1 - Marka\n2 - ID|\n3 - Price");
                    choice = scn.nextInt();

                    if (choice == 1)  {
                        System.out.println("Enter your brand : ");
                        String s = scn.next();
                        Laptop.productFilter(1, s);
                    }
                    else if (choice == 2)  {
                        System.out.println("Enter your id : ");
                        String s = scn.next();
                        Laptop.productFilter(2, s);
                    }
                    else if (choice == 3)  {
                        System.out.println("Enter your max price : ");
                        String s = scn.next();
                        Laptop.productFilter(3, s);
                    }
                }
            }
            else if(choice == 2){
                System.out.println("Telefon islemlerine Hos Geldiniz.\n1 - Telefon Ekle 2 - Telefon Cikar 3 - Filtrele");
                choice = scn.nextInt();


                if(choice == 1){
                    System.out.print("Enter id : ");
                    int id = scn.nextInt();
                    Telephone.add(id, new Telephone(choice, 15, 9999,10, "Iphone XR","Telephone",Brand.getBrand(3),128,3200,12,6.3,"RED"));
                }
                else if (choice == 2){
                    System.out.print("Enter id : ");
                    int id = scn.nextInt();
                    Telephone.productList.get("Telephone").get(id).delete("Telephone");
                }
                else if(choice == 3){
                    System.out.println("1 - Marka\n2 - ID|\n3 - Price");
                    choice = scn.nextInt();

                    if (choice == 1)  {
                        System.out.println("Enter your brand : ");
                        String s = scn.next();
                        Telephone.productFilter(1, s);
                    }
                    else if (choice == 2)  {
                        System.out.println("Enter your id : ");
                        String s = scn.next();
                        Telephone.productFilter(2, s);
                    }
                    else if (choice == 3)  {
                        System.out.println("Enter your max price : ");
                        String s = scn.next();
                        Telephone.productFilter(3, s);
                    }
                }
            }
            else if(choice == 3)
                for(Brand brand : Brand.brandList)
                    System.out.println(brand.getName());
            System.out.println("\n\n\n\n");
        }
    }
}
