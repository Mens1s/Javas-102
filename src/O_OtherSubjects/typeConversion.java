package O_OtherSubjects;

public class typeConversion {
    public static void main(String[] args) {
        // widening casting oto
        int a = 10;
        double b = a;
        System.out.println(b);

        // narrowing casting
        double pi = 3.14;
        int c = (int) pi;
        System.out.println(c);

        // integer To string
        int d = 20;
        System.out.println("Int : " + d);
        String str = String.valueOf(d);
        System.out.println("Str : " + str);

        // string to integer
        String e = "185";
        int f = Integer.parseInt(e);
        System.out.println(e);
    }
}
