package P_GUI.patikadev.Model;

import P_GUI.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Course {
    private int id;
    private int user_id;
    private int patika_id;
    private String name;
    private String lang;

    private Patika patika;
    private User educator;

    public Course(int id, int user_id, int patika_id, String name, String lang) {
        this.id = id;
        this.user_id = user_id;
        this.patika_id = patika_id;
        this.name = name;
        this.lang = lang;
        this.patika = Patika.getFetch(this.patika_id);
        this.educator = User.getFetch(this.user_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Patika getPatika() {
        return patika;
    }

    public void setPatika(Patika patika) {
        this.patika = patika;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }

    public static ArrayList<Course> getList(){
        String query = "SELECT * FROM course";
        ArrayList<Course> courseList = new ArrayList<>();

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
                courseList.add(new Course(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("patika_id"), rs.getString("name"), rs.getString("lang")));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return courseList;
    }

    public static boolean add(int user_id, int patika_id, String name, String lang){
        String query = "INSERT INTO course (user_id, patika_id, name, lang) VALUES (?, ?, ?, ?) ";

        try{
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, user_id);
            pr.setInt(2, patika_id);
            pr.setString(3, name);
            pr.setString(4, lang);

            return pr.executeUpdate() != -1;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<Course> getListByUser(int user_id){
        String query = "SELECT * FROM course WHERE user_id = " + user_id;
        ArrayList<Course> courseList = new ArrayList<>();

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
                courseList.add(new Course(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("patika_id"), rs.getString("name"), rs.getString("lang")));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return courseList;
    }

    public static boolean delete(String id){
        String query = "DELETE FROM course WHERE id = ?";

        try {
            PreparedStatement pr  = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,id);

            return pr.executeUpdate() != -1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
