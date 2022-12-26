package A_FinalHomework.Model;

import A_FinalHomework.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Room {
    private int hotelID;
    private String pansiyonType;
    private int bedNum;

    private boolean television;
    private boolean minibar;
    private boolean gameConsole;
    private boolean meterSquare;
    private boolean safe;
    private boolean projection;
    private double winterPrice;
    private double summerPrice;
    private double price;
    public int getHotelID() {
        return hotelID;
    }

    public String getPansiyonType() {
        return pansiyonType;
    }

    public int getBedNum() {
        return bedNum;
    }

    public boolean isTelevision() {
        return television;
    }

    public boolean isMinibar() {
        return minibar;
    }

    public boolean isGameConsole() {
        return gameConsole;
    }

    public boolean isMeterSquare() {
        return meterSquare;
    }

    public boolean isSafe() {
        return safe;
    }

    public boolean isProjection() {
        return projection;
    }

    public double getWinterPrice() {
        return winterPrice;
    }

    public double getSummerPrice() {
        return summerPrice;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) { this.price = price; }
    public Room(int hotelID, String pansiyonType, int bedNum, boolean television, boolean minibar, boolean gameConsole, boolean meterSquare, boolean safe, boolean projection, double winterPrice, double summerPrice) {
        this.hotelID = hotelID;
        this.pansiyonType = pansiyonType;
        this.bedNum = bedNum;
        this.television = television;
        this.minibar = minibar;
        this.gameConsole = gameConsole;
        this.meterSquare = meterSquare;
        this.safe = safe;
        this.projection = projection;
        this.winterPrice = winterPrice;
        this.summerPrice = summerPrice;
    }

    public boolean addRoom(){
        String query = "INSERT INTO room (hotelID, pansionType, bedNum, television, minibar, gameConsole, meterSquare, safe, projection, winterPrice, summerPrice) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,hotelID);
            pr.setString(2,pansiyonType);
            pr.setInt(3, bedNum);
            pr.setBoolean(4, television);
            pr.setBoolean(5, minibar);
            pr.setBoolean(6, gameConsole);
            pr.setBoolean(7, meterSquare);
            pr.setBoolean(8, safe);
            pr.setBoolean(9, projection);
            pr.setDouble(10, winterPrice);
            pr.setDouble(11, summerPrice);
            return pr.executeUpdate() != -1;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static ArrayList<Room> getRoomList(int bedNum, String pansiyonType){
        if(pansiyonType.equals("Hepsi")) pansiyonType = "";

        String query = "SELECT * FROM room WHERE bedNum >= " +bedNum + " AND pansionType LIKE '%"+pansiyonType + "%' ";
        ArrayList<Room> result = new ArrayList<>();

        try{
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                Room temp = new Room(rs.getInt("hotelID"), rs.getString("pansionType"), rs.getInt("bedNum"), rs.getBoolean("television")
                ,rs.getBoolean("minibar"), rs.getBoolean("gameConsole"), rs.getBoolean("meterSquare"), rs.getBoolean("safe"), rs.getBoolean("projection"),
                        rs.getInt("winterPrice"), rs.getInt("summerPrice"));
                result.add(temp);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static ArrayList<Room> getReservableList(Date  check_in, Date check_out, String pnsType, String loc){
        ArrayList<Room> reservable = new ArrayList<>();
        boolean isSummer = (check_in.getMonth() >= 6);

        String query = " SELECT * FROM room WHERE pansionType LIKE '%{pnsType}%' AND hotelID = ( SELECT hotelID FROM hotel WHERE hotelLoc LIKE '%{loc}%' ) ";
        query = query.replace("{pnsType}", pnsType);
        query = query.replace("{loc}", loc);

        try{
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                if(Reservation.isAvailable(rs.getInt("roomID"), check_in, check_out)){
                    Room temp = new Room(rs.getInt("hotelID"), rs.getString("pansionType"), rs.getInt("bedNum"), rs.getBoolean("television")
                            ,rs.getBoolean("minibar"), rs.getBoolean("gameConsole"), rs.getBoolean("meterSquare"), rs.getBoolean("safe"), rs.getBoolean("projection"),
                            rs.getInt("winterPrice"), rs.getInt("summerPrice"));
                    if(isSummer)
                        temp.setPrice(temp.getSummerPrice());
                    else
                        temp.setPrice(temp.getWinterPrice());
                    reservable.add(temp);
                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return reservable;
    }

}
