package Z_Homeworks.Collection.BookOrder;

public class Book implements Comparable<Book>{

    private String  name;
    private int     pageNumber;
    private String  author;
    private String  pubDate;

    Book(String name, String author, String pubDate, int pageNumber){
        this.name = name;
        this.author = author;
        this.pubDate = pubDate;
        this.pageNumber = pageNumber;
    }

    public String getName(){ return this.name; };
    public String getAuthor(){ return this.author; };
    public String getPubDate(){ return this.pubDate; };
    public int getPageNumber(){ return this.pageNumber; };

    @Override
    public int compareTo(Book o1) {
        return this.getPageNumber() - o1.getPageNumber();
    }
    public void display(){
        System.out.println("Name : "+ this.name+ "Author : "+ this.author + "  PubDate : " + pubDate + "  PageNumber : " + pageNumber );
    }



}
