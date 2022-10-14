package E_MaceraOyunu;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("<breathing> Mmmmm you are now at "+ this.getName()+"....");
        this.getPlayer().setHealth(this.getPlayer().getOriginialHealth());
        System.out.println("Your health is renewed!");
        return super.onLocation();
    }
}
