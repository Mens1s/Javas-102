package C_ObjectOriented.RelationsBtwClasses;

public class Instructor {
    private String name;
    private String surname;
    private String department;

    public Instructor(String name, String surname, String department){
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setDepartment(String department) {this.department = department;}

    public String getSurname() {return surname;}
    public String getName() {return name;}
    public String getDepartment() {return department;}

}

