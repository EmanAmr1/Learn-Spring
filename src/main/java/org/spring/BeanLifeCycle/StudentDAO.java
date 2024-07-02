package org.spring.BeanLifeCycle;

import java.sql.*;

public class StudentDAO {
    private String driver ;
    private String url ;
    private String userName;
    private String password;

    public void selectAllRows() throws ClassNotFoundException, SQLException {

        System.out.println("Retriving all Students data");
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

        //clothing the connection
      con.close();
    }


    public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
        //load driver
        Class.forName(driver);

        //get  connection
        Connection con= DriverManager.getConnection(url,userName,password);

        //execute query
        Statement stmt= con.createStatement();

         stmt.executeUpdate("DELETE  FROM HotelStudentInfo WHERE student_id= " +studentId);

         System.out.println("Record deleted successfully with the id "+studentId);

         //clothing the connection
         con.close();

    }


    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
