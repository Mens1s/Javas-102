package A_FinalHomework.Model;

import A_FinalHomework.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private String hotelLoc;
    private boolean freeOto;
    private boolean freeWIFI;
    private boolean swimmingPool;
    private boolean fitnessCenter;
    private boolean hotelConcierge;
    private boolean SPA;
    private boolean alwRoomService;

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelLoc() {
        return hotelLoc;
    }

    public boolean isFreeOto() {
        return freeOto;
    }

    public boolean isFreeWIFI() {
        return freeWIFI;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public boolean isFitnessCenter() {
        return fitnessCenter;
    }

    public boolean isHotelConcierge() {
        return hotelConcierge;
    }

    public boolean isSPA() {
        return SPA;
    }

    public boolean isAlwRoomService() {
        return alwRoomService;
    }

    public Hotel(String hotelName, String hotelLoc, boolean freeOto, boolean freeWIFI, boolean swimmingPool, boolean fitnessCenter, boolean hotelConcierge, boolean SPA, boolean alwRoomService) {
        this.hotelName = hotelName;
        this.hotelLoc = hotelLoc;
        this.freeOto = freeOto;
        this.freeWIFI = freeWIFI;
        this.swimmingPool = swimmingPool;
        this.fitnessCenter = fitnessCenter;
        this.hotelConcierge = hotelConcierge;
        this.SPA = SPA;
        this.alwRoomService = alwRoomService;

    }

    public boolean addHotel(){
        String query = "INSERT INTO hotel (freeOto, freeWIFI, swimmingPool, fitnessCenter, hotelConcierge, SPA, alwRoomService, hotelName, hotelLoc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            // prset
            pr.setBoolean(1, freeOto);
            pr.setBoolean(2, freeWIFI);
            pr.setBoolean(3, swimmingPool);
            pr.setBoolean(4, fitnessCenter);
            pr.setBoolean(5, hotelConcierge);
            pr.setBoolean(6, SPA);
            pr.setBoolean(7, alwRoomService);
            pr.setString(8, hotelName);
            pr.setString(9, hotelLoc);
            return pr.executeUpdate() != -1;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<Hotel> getHotelList(String hotelName, String hotelLoc){
        ArrayList<Hotel> resultList = new ArrayList<>();
        String query = "SELECT * FROM hotel WHERE hotelName LIKE '%{hotelName}%' AND hotelLoc LIKE '%{hotelLoc}%' ORDER BY hotelID";
        query = query.replace("{hotelName}", hotelName);
        query = query.replace("{hotelLoc}", hotelLoc);

        try{
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);


            while (rs.next()){

                Hotel temp = new Hotel(rs.getString("hotelName"), rs.getString("hotelLoc"), rs.getBoolean("freeOto"), rs.getBoolean("freeWIFI"),
                        rs.getBoolean("swimmingPool"), rs.getBoolean("fitnessCenter"), rs.getBoolean("hotelConcierge"), rs.getBoolean("SPA"),
                        rs.getBoolean("alwRoomService"));

                resultList.add(temp);
            }
            st.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultList;
    }

    public static int itemToID(String hotelName){
        String query = "SELECT * FROM hotel WHERE hotelName LIKE '{hotelName}'";
        int id = -1;
        try{
            query = query.replace("{hotelName}", hotelName);
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
                id = rs.getInt("hotelID");
            st.close();
        }catch (SQLException e){
            return -1;
        }
        return id;
    }

    public static String IDtoName(int id){
        String query = "SELECT * FROM hotel WHERE hotelID = {id}";
        String hotelName= "";
        try{
            query =query.replace("{id}", String.valueOf(id) );

            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
                hotelName = rs.getString("hotelName");
            return hotelName;
        }catch (SQLException e){
            return "";
        }
    }

}
