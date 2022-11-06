package K_CollectionClass;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        // set interface => unique elements
        // order is not imported it can be complex

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

        */

        /*
        // TREESET
        // order kuralini kendimiz verebildigimiz bir set new OrderNoteComparator()
        TreeSet<Student> students = new TreeSet<>( new OrderNameComparator());

        students.add(new Student("Ahmet", 20));
        students.add(new Student("Behlul", 45));
        students.add(new Student("Damla", 66));
        students.add(new Student("Ceren", 66)); // ayni notlar/isimoldugu icin ilk yazilan oncelik ceren tree seete giremedi
        students.add(new Student("Ceren", 76));

        for (Student std : students) {
            System.out.println(std.getName());
        }
        */

        /*
        // ARRAYLIST
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(14);
        liste.add(15);
        liste.add(16);
        liste.add(null);

        Iterator<Integer> itr = liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int a : liste){
            System.out.println(a);
        }
        System.out.println(liste);

         */

        /*
        // Linked List
        List<String> liste = new LinkedList<>();
        liste.add("AhmetYigit");
        liste.add("Java");
        liste.add("102");
        liste.add("Egitimi");

        Iterator<String> itr = liste.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */

        /*
        // Vector ilkel ve eskiden gelmis yapilar
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        vector.add("e");

        vector.add(1,"abc");
        Iterator<String> itr = vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(vector);
        */

        /*
        // Queue linkedlist FIFO => LIFO

        // polimorphism
        Queue<String> q = new LinkedList<>();
        q.add("Ahmet");
        q.add("Yigit");
        q.add("Java");
        q.add("Egitimi");

        Iterator<String> itr = q.iterator();
        // pool => basindaki ogeyi verir ve siler onu peek/element => basini verir ama silmez
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


         */

        PriorityQueue<String> p = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        p.add("Ahmet");
        p.add("Yigit");
        p.add("Denememiz");
        p.add("Denememiz");

        for(String s : p){
            System.out.println(s);
        }

        Iterator<String> itr = p.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
