package Z_Homeworks.InsuranceSystem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {

    private final ArrayList<Address> addressList;
    static private final ArrayList<Insurance> InsuranceList = new ArrayList<>();
    String name, surname, email, password, job, age;
    Date date;

    User(String name, String surname, String email, String password, String job, String age){
        this.name = name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.job=job;
        this.age = age;
        this.addressList = new ArrayList<>();
        date = new Date();
        date = Date.from(Instant.now());
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public static ArrayList<Insurance> getInsuranceList() {
        return InsuranceList;
    }


    public String getName() {return name;}
    public String getSurname(){return surname;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public String getJob(){return job;}

    public String getAge(){return age;}

    public String getLastLogin(){return date.toString();}
    public void setLastLogin(){date = Date.from(Instant.now());}


}
