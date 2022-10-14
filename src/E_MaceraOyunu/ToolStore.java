package E_MaceraOyunu;

import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player){
        super(player, "Tool Store");
    }

    private void menu(){
        System.out.println("Welcome "+this.getPlayer().getName()+" to "+ this.getName());
        System.out.println("Your money : "+ this.getPlayer().getMoney() + "$");

        System.out.println("Which do you want to buy?");
        System.out.println("1-) Weapon");
        System.out.println("2-) Armor");

        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Choice : ");
            choice = input.nextInt();
            if (choice == 1){
                System.out.println("Our weapons are : ");
                System.out.println("\t1- Gun     \tDamage -> 2 \tPrice -> 25");
                System.out.println("\t2- Sword   \tDamage -> 3 \tPrice -> 35");
                System.out.println("\t3- Shotgun \tDamage -> 7 \tPrice -> 45");
                System.out.print("Enter your choice : ");
                int ch2 = input.nextInt();

                boolean flag = false;
                if(ch2 == 1){
                    if(this.getPlayer().getMoney() >= 25){
                        this.getPlayer().inventory.setWeaponName("Gun");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-25);
                        this.getPlayer().inventory.setWeaponDamage(2);
                        flag = true;
                    }

                }
                else if(ch2 == 2){
                    if(this.getPlayer().getMoney() >= 35){
                        this.getPlayer().inventory.setWeaponName("Sword");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-35);
                        this.getPlayer().inventory.setWeaponDamage(3);
                        flag = true;
                    }
                }
                else if(ch2 == 3){
                    if(this.getPlayer().getMoney() >= 45){
                        this.getPlayer().inventory.setWeaponName("Shotgun");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-45);
                        this.getPlayer().inventory.setWeaponDamage(7);
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("Your money not enough to buy!");
                }
            }
            else if(choice == 2){
                System.out.println("Our armors are : ");
                System.out.println("\t1- Low     \tDefence -> 1 \tPrice -> 15");
                System.out.println("\t2- Mid     \tDefence -> 3 \tPrice -> 25");
                System.out.println("\t3- High    \tDefence -> 5 \tPrice -> 40");
                System.out.print("Enter your choice : ");
                int ch2 = input.nextInt();

                boolean flag = false;
                if(ch2 == 1){
                    if(this.getPlayer().getMoney() >= 15){
                        this.getPlayer().inventory.setArmorName("Low");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-15);
                        this.getPlayer().inventory.setArmorDefence(1);
                        flag = true;
                    }

                }
                else if(ch2 == 2){
                    if(this.getPlayer().getMoney() >= 25){
                        this.getPlayer().inventory.setArmorName("Mid");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-25);
                        this.getPlayer().inventory.setArmorDefence(3);
                        flag = true;
                    }
                }
                else if(ch2 == 3){
                    if(this.getPlayer().getMoney() >= 40){
                        this.getPlayer().inventory.setArmorName("High");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()-40);
                        this.getPlayer().inventory.setArmorDefence(5);
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("Your money not enough to buy!");
                }
            }
            else{
                System.out.println("Please enter right number...");
            }
        }while(!( choice == 1 || choice == 2));
    }
    @Override
    public boolean onLocation() {
        menu();
        return super.onLocation();
    }

}
