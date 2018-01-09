/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Basanta
 */

public class DBConnection{
public static Statement statementObject() {
//driver load code
//database connection code
try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded");
            }
            catch(Exception e){
                System.out.println("Driver not loaded");
            }
            Connection con = null;
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basantainstitute","root","");
            System.out.println("Database connected");
        }
        catch(Exception e){
            System.out.println("database not connected");
        }
            Statement st = null;
            try{
                st = con.createStatement();
                System.out.println("success");
                
            }
    catch(Exception e){
        System.out.println("error");
    }
            return st;
    }
}
