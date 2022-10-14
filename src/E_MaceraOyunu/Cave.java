package E_MaceraOyunu;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Cave", new Zombi() );

    }

    public void win(){
        System.out.println("You got a food");
        this.getPlayer().inventory.setFood(true);
    }

}
