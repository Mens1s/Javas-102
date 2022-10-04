package C_ObjectOriented.RelationsBtwClasses;

public class Student {
    private String name;
    private String surname;
    private String idNo;
    private String address;
    private int note;

    public Student(String name,String surname,String idNo,String address,int note){
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.address = address;
        if (note < 0 || note > 100)
            this.note = 0;
        else
            this.note = note;
    }



    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getIdNo() {return idNo;}
    public void setIdNo(String idNo) {this.idNo = idNo;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public int getNote() {return note;}
    public void setNote(int note) {
        if (note < 0 || note > 100)
            this.note = 0;
        else
            this.note = note;
    }
}
