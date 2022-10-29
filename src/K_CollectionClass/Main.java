package K_CollectionClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // set interface => unique elements
        // order is not imported it cam be complex
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(123);
        hSet.add(124);
        hSet.add(125);
        hSet.add(126);
        hSet.add(127);
        hSet.add(128);
        hSet.add(129);
        System.out.println(hSet.contains(1244));
        for(int a : hSet)
            System.out.println(a);

        System.out.println("---------------------");
        Iterator<Integer> iterator = hSet.iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            System.out.println(iterator.next().toString());
        }

        System.out.println("*-*-*-*-*--*-**-*--**--*-**-*--*-*");
        // linkedhashset sirasiyla tutar
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(123);
        l.add(4);
        l.add(543);
        l.add(513);
        l.add(1213);
        Iterator<Integer> itr = l.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
