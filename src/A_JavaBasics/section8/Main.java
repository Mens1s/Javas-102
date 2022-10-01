package A_JavaBasics.section8;

public class Main {
    public static void main(String[] args) {
        /* if variables in the class public
        Car c1 = new Car();

        c1.color = "Red";
        c1.door = 4;
        c1.wheel = 4;
        c1.engine = "16V";
        c1.model = "Volkswagen";
        */
        Car c2 = new Car();

        c2.setModel("Sedan");
        System.out.println(c2.getModel());

        c2.setDoor(-5);
        System.out.println(c2.getDoor());
    }
}
