package D_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Tutar Giriniz : ");
        double price = scn.nextDouble();

        System.out.print("Kart NO giriniz : ");
        String cardNumber = scn.next();

        System.out.print("Son kullanim tarihi giriniz : ");
        String exDate = scn.next();

        System.out.print("CVC Giriniz : ");
        String cvc = scn.next();

        System.out.println("1- A Bankasi");
        System.out.println("2- B Bankasi");
        System.out.println("3- C Bankasi");
        System.out.print("Banka seciniz : ");
        int bank = scn.nextInt();

        switch (bank){
            case 1:
                ABank aPos = new ABank("A Bankasi", "123132131", "1212313");
                aPos.connect("132.435.123.33");
                aPos.payment(price, cardNumber, exDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("B Bankasi", "1231313132","12321312");
                bPos.connect("3243.123.54.12");
                bPos.payment(price, cardNumber, exDate, cvc);
                break;
            case 3:
                break;
            default:
                System.out.println("Yanlis banka secimi! ");
                break;
        }
    }
}
