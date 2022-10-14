package H_Boxing;

public class Main {
    public static void main(String[] args) {
        // Boxing
        // Unboxing

        int a = 10;

        // AutoBoxing
        Integer b = a;

        // Boxing
        Integer c = Integer.valueOf(a);

        // AutoUnboxing
        int d = c;
            // d.toString() does not exist bcs of wrapper is Integer and int is "Ilkel"
        System.out.println(c.toString());

        // Unboxing
        int i = c.intValue();

    }
}
