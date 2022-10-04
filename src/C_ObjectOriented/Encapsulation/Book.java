package C_ObjectOriented.Encapsulation;
// encapsulation
public class Book {
    public String name;
    private int pageNumber;

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 0)
            this.pageNumber = 0;
        else
            this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public Book(String name){
        this.name = name;
    }
}
