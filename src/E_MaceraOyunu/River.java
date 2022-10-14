package E_MaceraOyunu;

public class River extends BattleLoc{
    public River(Player player) {
        super(player, "River", new Bear() );

    }

    public void win(){
        System.out.println("You got a water");
        this.getPlayer().inventory.setWater(true);
    }
}
