/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaitanya
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnecting {
    Connection con;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Chaitanya\\Documents\\NetBeansProjects\\Taxi Booking Service\\TaxiNew.sqlite");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static Connection ConnectUserDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Chaitanya\\Documents\\NetBeansProjects\\Taxi Booking Service\\TaxiDataBase.sqlite");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static Connection ConnectAdminDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Chaitanya\\Documents\\NetBeansProjects\\Taxi Booking Service\\TaxiAdmin.sqlite");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
