package Z_Homeworks.BookStore;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private int numOfPage;
    private String publishedDate;

    public Book(String name, String author,int numOfPage, String publishedDate){
        this.name = name;
        this.author = author;
        this.numOfPage = numOfPage;
        this.publishedDate = publishedDate;
    }


    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
