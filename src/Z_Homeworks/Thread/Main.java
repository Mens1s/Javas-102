package Z_Homeworks.Thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            array.add(i);
        }

        List<Integer> subArray1 = array.subList(0, 2500);
        List<Integer> subArray2 = array.subList(2500, 5000);
        List<Integer> subArray3 = array.subList(5000, 7500);
        List<Integer> subArray4 = array.subList(7500, 10000);

        homework h1 = new homework(subArray1);
        h1.start();

        homework h2 = new homework(subArray2);
        h2.start();

        homework h3 = new homework(subArray3);
        h3.start();

        homework h4 = new homework(subArray4);
        h4.start();

    }
}
