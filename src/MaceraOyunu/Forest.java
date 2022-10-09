package MaceraOyunu;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", new Vampire());

    }

    public void win(){
        System.out.println("You got a firewood");
        this.getPlayer().inventory.setFireword(true);
    }

}
