package B_AccessModifiers;

public class Player {
    public String name;
    public int id;
    public static int count = 0;
    public Player(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static void showName(){
        System.out.println(count);
    }
    public void login(){
        count++;
    }
}
