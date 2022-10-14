package E_MaceraOyunu;

import java.util.Random;
public class Mine extends BattleLoc{
    Random rd = new Random();
    public Mine(Player player) {
        super(player, "Mine", new Snake() );
    }

    public void win(){
        int rot = rd.nextInt(100) + 1;

        // get Weapon
        if(rot < 15){
            rot = rd.nextInt(100) + 1;
            // get shotgun
            if (rot < 20){
                System.out.println("You win 4 Weapon Damage");
                this.getPlayer().inventory.setWeaponDamage(7);
            }
            else if (rot < 50){
                System.out.println("You win 3 Weapon Damage");
                this.getPlayer().inventory.setWeaponDamage(3);
            }
            else{
                System.out.println("You win 2 Weapon Damage");
                this.getPlayer().inventory.setWeaponDamage(2);
            }
        }
        // get armor
        else if(rot < 30){
            // get high
            if (rot < 20){
                System.out.println("You win 5 Armor Defence");
                this.getPlayer().inventory.setArmorDefence(5);
            }
            else if (rot < 50){
                System.out.println("You win 3 Armor Defence");
                this.getPlayer().inventory.setArmorDefence(3);
            }
            else{
                System.out.println("You win 1 Armor Defence");
                this.getPlayer().inventory.setArmorDefence(1);
            }
        }
        // get money
        else if(rot < 55){
            if (rot < 20){
                System.out.println("You win 10$");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
            }
            else if (rot < 50){
                System.out.println("You win 5$");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
            }
            else{
                System.out.println("You win 1$");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
            }
        }
        else{
            System.out.println("You cannot win anything...");
        }
    }
}
