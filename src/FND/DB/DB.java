/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FND.DB;

import FND.Global;
import FND.Log.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author M.Faisal1521
 */
public class DB {

    String ConnectString;
    String ConnectUSER;
    String ConnectPassword;
    Connection ApplicationSession = null;
    Connection mssqlConnection = null;
    Connection    CandelaConnection = null;

    public DB() {
    
    }

   
    ///Candela Connection 
     public Connection getCandelaConnection() {
        
         
         
        if (CandelaConnection != null) {

            try {
                if (!CandelaConnection.isClosed()) {
                    return CandelaConnection;
                }
            } catch (SQLException ex) {
                Console.write("SQL server Error ! Connection is not re-opening. " + ex.getMessage());
            }
        }
        
      
       
        try {
             
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection conn = DriverManager.getConnection(Global.CandeladbPath);
            
            if (conn != null) {
               CandelaConnection = conn;
            }
            
            Console.show(" Candela server is connected.");
            
            return conn;
        } catch (SQLException ex) {
            Console.write("Candela server connectivity Error ! " + ex.getMessage());
        }
        
        return CandelaConnection;
    }
}
