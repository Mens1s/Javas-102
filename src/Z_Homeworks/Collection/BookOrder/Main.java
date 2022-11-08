package Z_Homeworks.Collection.BookOrder;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Book1","Ahmet","15/02/2022",152);

        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("Book2","Ahmet","15/02/2235",52));
        bookSet.add(new Book("Book3","Ahmet","5/02/2062",852));
        bookSet.add(new Book("Book4","Ahmet","55/04/2097",652));
        bookSet.add(new Book("Book5","Ahmet","45/02/2062",252));
        bookSet.add(new Book("Book6","Ahmet","11/02/2052",452));

        for(Book book : bookSet)
            book.display();
        System.out.println("\n\n------------------------------------------------\n\n");

        TreeSet<Book> sortedBookSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        sortedBookSet.add(new Book("Book2","Ahmet","15/02/2235",52));
        sortedBookSet.add(new Book("Book3","Ahmet","5/02/2062",852));
        sortedBookSet.add(new Book("Book4","Ahmet","55/04/2097",652));
        sortedBookSet.add(new Book("Book5","Ahmet","45/02/2062",252));
        sortedBookSet.add(new Book("Book6","Ahmet","11/02/2052",452));

        for(Book book : sortedBookSet)
            book.display();
    }

}
