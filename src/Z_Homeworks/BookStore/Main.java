package Z_Homeworks.BookStore;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> newBookList = new ArrayList<>();
        HashMap<String, String> hList = new HashMap<>();

        bookList.add(new Book("Book1","Book1Author",50, ("21-02-2002")));
        bookList.add(new Book("Book2","Book2Author",150, ("22-02-2002")));
        bookList.add(new Book("Book3","Book3Author",450, ("23-02-2002")));
        bookList.add(new Book("Book4","Book4Author",40, ("24-02-2002")));
        bookList.add(new Book("Book5","Book5Author",540, ("25-02-2002")));
        bookList.add(new Book("Book6","Book6Author",70, ("26-02-2002")));
        bookList.add(new Book("Book7","Book7Author",10, ("27-02-2002")));
        bookList.add(new Book("Book8","Book8Author",150, ("28-02-2002")));
        bookList.add(new Book("Book9","Book9Author",250, ("01-03-2002")));
        bookList.add(new Book("Book10","Book10Author",49, ("02-03-2002")));

        bookList.stream().forEach(book -> hList.put(book.getName(), book.getAuthor()));
        bookList.stream().filter(book -> book.getNumOfPage() > 100).forEach(book -> newBookList.add(book));

        hList.forEach((a, b) -> System.out.println("Book : "+ a + "Author : " +b));
        newBookList.stream().forEach(book -> System.out.println(book.getName() + " : " + book.getNumOfPage()));
    }
}
