package K_CollectionClass;

public class Student {
    private String name;
    private int note;
    private int no;
    Student(int no, String name, int note){
        this.note = note;
        this.name = name;
        this.no = no;
    }

    public int getNote(){return note;}
    public void setNote(int note){this.note = note;}

    public String getName(){return name;};
    public void setName(String name){this.name = name;};


}
