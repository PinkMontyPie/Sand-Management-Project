package config_DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pai
 */
public class ConfigDB {
    Connection con = null;  
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:user.db");
            System.out.println("Connection Database Succesful");
            return con;
            
        }catch(Exception b){
            System.out.println("Connection Failed"+b);
            return null;
        }   
    }
    public static void main(String[] args) {
        connectDB();
    }
}
