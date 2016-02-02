/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsworld;
import java.sql.*;
/**
 *
 * @author John
 */
public class ConnectOracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyConnection con = new MyConnection();
       if(con.ConnectDB()!=null){
           System.out.println("Connection Established.");
       }else{
           System.out.println("Connection Failed, please consult with system administrator.");
       }
    }
    
}
