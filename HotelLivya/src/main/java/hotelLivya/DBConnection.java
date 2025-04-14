package hotelLivya;

import java.sql.*;

public class DBConnection 
{
    public static Connection con;

    public DBConnection() {
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Fixed driver class
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "rohan");

            if (con == null) {
                System.out.println("Connection can't be established");
            } else {
                System.out.println("Connection established successfully");
            }
        } catch (Exception e) {
            e.printStackTrace(); // good for debugging
        }
    }

    public static Connection DBgetConnection() {
        return con;
    }
}
