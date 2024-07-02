package org.spring.BeanLifeCycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.sql.*;

public class StudentDAO {
    private String driver ;
    private String url ;
    private String userName;
    private String password;

    //connection obj
    Connection con;

    //@PostConstruct
    public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
        System.out.println("creating connection for studentDB");

        //load driver
        Class.forName(driver);

        //get  connection
          con= DriverManager.getConnection(url,userName,password);

    }

   // @PreDestroy
    public void closeConnection() throws SQLException {
        //clothing the connection
        System.out.println("inside destroy method");
        con.close();
    }



    public void selectAllRows() throws  SQLException {

        System.out.println("Retriving all Students data");

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


    public void deleteStudentRecord(int studentId) throws  SQLException {


        //execute query
        Statement stmt= con.createStatement();

         stmt.executeUpdate("DELETE  FROM HotelStudentInfo WHERE student_id= " +studentId);

         System.out.println("Record deleted successfully with the id "+studentId);



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
