package B_AccessModifiers;

public class Circle {
    private final int r;
    public static final double pi = 3.14;
    public Circle(int r){
        this.r = r;
    }

    public void calcArea(){
        double area = Circle.pi * this.r * this.r;
        System.out.println("Circle area : " + area);
    }
}
