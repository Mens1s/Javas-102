package A_JavaBasics.section8;

public class Car {

    private String color;
    private int door;
    private int wheel;
    private String engine;
    private String model;

    public void setColor(String color){ this.color = color; }
    public String getColor(){ return color; }

    public void setDoor(int door){
        if (door <= 0){
            System.out.println("Car must has at least one door!");
        }
        else
            this.door = door;
    }
    public int getDoor(){ return door; }

    public void setWheel(int wheel){ this.wheel = wheel; }
    public int getWheel(){ return wheel; }

    public void setEngine(String engine){ this.engine = engine;}
    public String getEngine(){ return engine;}

    public void setModel(String model){ this.model = model; }
    public String getModel(){ return model; }

}
