package MaceraOyunu;

import java.util.Scanner;

public class Player{
    public Inventory inventory = new Inventory();
    private int damage;
    private int health;
    private int money;
    private String name;

    public int getOriginialHealth() {
        return OriginialHealth;
    }

    public void setOriginialHealth(int originialHealth) {
        OriginialHealth = originialHealth;
    }

    private int OriginialHealth;
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){
        System.out.println("Please select your character");
        System.out.println("1- Samurai");
        System.out.println("2- Archer");
        System.out.println("3- Knight");

        Scanner scnr = new Scanner(System.in);
        System.out.print("Choice : ");
        int choice;
        do {
            choice = scnr.nextInt();
            switch (choice) {
                case 1 -> {
                    setName("Samurai");
                    setDamage(5);
                    setHealth(21);
                    setMoney(15);
                    setOriginialHealth(21);
                }
                case 2 -> {
                    setName("Archer");
                    setDamage(7);
                    setHealth(18);
                    setMoney(20);
                    setOriginialHealth(18);

                }
                case 3 -> {
                    setName("Knight");
                    setDamage(8);
                    setHealth(24);
                    setMoney(5);
                    setOriginialHealth(24);

                }
                default -> System.out.println("Please select 1, 2 or 3...");
            }
        }while(!(choice == 1 || choice == 2 || choice == 3));


    }
}
