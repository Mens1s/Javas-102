package A_FinalHomework.Model;

import A_FinalHomework.Helper.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private SimpleDateFormat check_in;
    private SimpleDateFormat check_out;
    private int customer_id;
    private double price;
    private int roomID;

    public Reservation(SimpleDateFormat check_in, SimpleDateFormat check_out, int customer_id, double price, int roomID) {
        this.check_in = check_in;
        this.check_out = check_out;
        this.customer_id = customer_id;
        this.price = price;
        this.roomID = roomID;
    }

    public SimpleDateFormat getCheck_in() {
        return check_in;
    }

    public SimpleDateFormat getCheck_out() {
        return check_out;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomID() {
        return roomID;
    }

    public static boolean isAvailable(int roomID, Date check_in, Date check_out){
        String query = "SELECT * FROM reservation WHERE roomID = {roomID}";
        query = query.replace("{roomID}", String.valueOf(roomID));

        try{
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){

                if( rs.getDate("date_in").after( check_in ) && rs.getDate("date_out").after(check_out) ){
                    return false;
                }
                if(rs.getDate("date_in").before( check_in ) && rs.getDate("date_out").before(check_out) ){
                    return false;
                }
                if(rs.getDate("date_in").before( check_in ) && rs.getDate("date_out").after(check_out) ){
                    return false;
                }if(rs.getDate("date_in").after( check_in ) && rs.getDate("date_out").before(check_out) ){
                    return false;
                }

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return true;
    }
}
