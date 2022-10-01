package B_AccessModifiers;

public class User {
    public String name;

    static {
        System.out.println("that is a static code block!");
    }
    public static int counter = 0;
    public User(String name){
        this.name = name;
        counter++;
    }
}
