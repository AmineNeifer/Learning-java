package jdbc;

import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","student","");

        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("select * from country");
        while(rs.next())  {
            System.out.println(rs.getString(1));
        }
        con.close();
    }
}
