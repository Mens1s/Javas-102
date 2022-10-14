package E_MaceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;

    public BattleLoc(Player player,String name ,Obstacle obstacle) {
        super(player, "Battle Location");
        this.obstacle = obstacle;
    }


    public boolean onLocation(){
        return true;
    }

    public void combat(int enemyCount){
        System.out.println("Welcome " + this.getPlayer().getName());
        boolean isDead = false;
        int i = 0;

        while((!isDead) && i < enemyCount){
            System.out.println("\n\n\n");
            Random rn = new Random();
            int a = rn.nextInt(2) + 1;

            if(a == 1){
                System.out.println(this.getObstacle().getName() + " hit you...");
                this.getPlayer().setHealth(this.getPlayer().getHealth()+this.getPlayer().inventory.getArmorDefence()-this.getObstacle().getDamage());

                if(this.getPlayer().getHealth() <= 0){
                    System.out.println("You died...");
                    isDead = true;
                    break;
                }

                System.out.println(this.getPlayer().getName() + " health -> " + this.getPlayer().getHealth());
                System.out.println(this.getObstacle().getName() + " health -> " + this.getObstacle().getHealth());
                System.out.println("\n\n");
            }

            System.out.println("You hit the " + this.getObstacle().getName());

            this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage()-this.getPlayer().inventory.getWeaponDamage());

            if(this.getObstacle().getHealth() <= 0){
                System.out.println("You killed a "+this.getObstacle().getName() );
                this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                i++;
            }

            else{
                System.out.println(this.getObstacle().getName() + " hit you...");
                this.getPlayer().setHealth(this.getPlayer().getHealth()+this.getPlayer().inventory.getArmorDefence()-this.getObstacle().getDamage());

                if(this.getPlayer().getHealth() <= 0){
                    System.out.println("You died...");
                    isDead = true;
                    break;
                }

                System.out.println(this.getPlayer().getName() + " health -> " + this.getPlayer().getHealth());
                System.out.println(this.getObstacle().getName() + " health -> " + this.getObstacle().getHealth());
            }
        }


        if (!isDead){
            System.out.println("You are perfectly done this level...");
        }
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
}
