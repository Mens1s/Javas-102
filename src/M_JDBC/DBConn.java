package M_JDBC;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String stSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";

        try{
            connect = DriverManager.getConnection(DB_URL , DB_USER, DB_PASSWORD);
//            st = connect.createStatement();


//            st.executeUpdate(insertSql);
//            ResultSet data = st.executeQuery(sql);
//            while(data.next()){
//                System.out.println("ID : " + data.getInt("student_id"));
//                System.out.println("Name : " + data.getString("student_name"));
//                System.out.println("Class : " + data.getInt("student_class"));
//                System.out.println("#############");
//            }
// ADD element
//            String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('DAMLA',4)";
//            String prSql = "INSERT INTO student (student_name, student_class) VALUES (?,?)";
//            PreparedStatement prSt = connect.prepareStatement(prSql);
//            prSt.setString(1, "Ahmet Yiğit");
//            prSt.setInt(2, 5);
//            prSt.executeUpdate();
//
//            prSt.close();
//            Update
//            String stSql = "UPDATE student SET student_name = 'MENS1S' WHERE student_id=1";
//            String uptSql = "UPDATE student SET student_name = ? WHERE student_id=?";
//            st = connect.createStatement();
//            st.executeUpdate(stSql);
//            st.close();
//
//            PreparedStatement ust = connect.prepareStatement(uptSql);
//            ust.setString(1,"Mens1s");
//            ust.setInt(2,1);
//            ust.executeUpdate();
//            ust.close();
//            Delete
//            st = connect.createStatement();
//            st.execute(stSql);
//            st.close();
//
//            PreparedStatement pst = connect.prepareStatement(prSql);
//            pst.setInt(1, 4);
//            pst.executeUpdate();
//            pst.close();
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?,?)");

            connect.setAutoCommit(false); // hata alma ihtimaline göre kontrol hepsini aynı anda yollar commit leyince line 70

            pr.setInt(2,4);
            pr.setString(1,"John");

            pr.execute();

            pr.close();

            connect.commit();
            connect.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
