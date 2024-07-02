package org.spring.BeanLifeCycle;

import java.sql.*;

public class StudentDAO {
    private String driver ="org.postgresql.Driver";
    private String url="jdbc:postgresql://localhost:5432/esnew" ;
    private String userName="postgres";
    private String password="1234";

    public void selectAllRows() throws ClassNotFoundException, SQLException {
       //load driver
       Class.forName(driver);

       //get  connection
      Connection con= DriverManager.getConnection(url,userName,password);

        //execute query
       Statement stmt= con.createStatement();

      ResultSet rs= stmt.executeQuery("SELECT * FROM HotelStudentInfo;");

      while (rs.next()) {
          int studentId = rs.getInt(1);
         String studentName= rs.getString(2);
         double hotelFees =rs.getDouble(3);
       String foodType=  rs.getString(4);

       System.out.println(studentId+ " "+ studentName + " " +hotelFees +" " +foodType);
      }
    }

}
