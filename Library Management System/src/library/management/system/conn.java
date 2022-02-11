package library.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;  //two interfaces connection and statement
    public conn() { //constructor
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //importing mysql drivers
            c = DriverManager.getConnection("jdbc:mysql:///project1", "root","");  //eshtablishing connection with the database ""->no password
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
