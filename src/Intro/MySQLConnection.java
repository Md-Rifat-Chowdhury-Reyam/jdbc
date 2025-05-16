package Intro;

import java.sql.*;

public class MySQLConnection {

    public static void main(String[] args) {


        try {
           Connection c = DriverManager.getConnection(
                   "jdbc:mysql://127.0.0.1:3306/login_schema",
                   "root",
                   "5400"
           );
           Statement stmnt = c.createStatement();
           ResultSet resultst = stmnt.executeQuery("SELECT * FROM login_schema.users");

//            String query
//                    = "INSERT INTO users (userid, username, userpassword) VALUES ('1', 'Rifat', '123')";
//            int count = stmnt.executeUpdate(query);

           while(resultst.next())
           {
               System.out.println(resultst.getString("userid"));
               System.out.println(resultst.getString("username"));
               System.out.println(resultst.getString("userpassword"));

           }


       }
       catch (SQLException e)
       {
           e.printStackTrace();
           System.out.println("Error catch : " + e.getMessage());

       }
    }

}
