package O_OtherSubjects;

import java.util.ArrayList;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);
        list.add(29);
        list.add(21);
        list.add(22);
        list.add(64);
        list.add(22);

        for(int i : list)
            System.out.println(i);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        list.stream().forEach(num -> System.out.println(num));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        list.stream().forEach(System.out::println);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");

        list.stream().filter(num -> num > 60).forEach(i -> System.out.println(i));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        list.stream().distinct().forEach(num -> System.out.println(num)); // set() no freq>1
        // sorted comperator da olabiliyor:D
        // limit X elemani verir
        // anyMatch istedigimize uyan bir match var mı yok mu?
        // allMatch tüm elemanları control eder
        // noneMatch !allMatch
        // map
        list.stream().map(i -> i *2 ).forEach(i -> System.out.println(i));
    }
}
