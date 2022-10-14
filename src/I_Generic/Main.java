package I_Generic;

public class Main {
    public static void main(String[] args) {
        // undefined
        String s;
        // null
        String s1 = null;
        // empty
        String s2 = "hello world";

        // undefined mistake
        //  nl = new Nullable(s);
        // nl.run();
        Nullable nl1 = new Nullable(s1);
        nl1.run();
        Nullable nl2 = new Nullable(s2);
        nl2.run();

        // undefined
        Integer i;
        // null
        Integer i1 = null;
        // empty
        Integer i2 = 2355;
        NullableInt ni1 = new NullableInt(i1);
        ni1.run();
        NullableInt ni2 = new NullableInt(i2);
        ni2.run();

        // Generic
        Integer d = 12;
        NullableGeneric<Integer> a = new NullableGeneric<>(d);
        a.run();


        Integer[] arr = {1,2,3};
        Sol<Integer> sol = new Sol<>(arr);
        sol.printArray();
        String[] arr1 = {"Hello", "World"};
        Sol<String> sol1 = new Sol<>(arr1);
        sol1.printArray();

    }
}
