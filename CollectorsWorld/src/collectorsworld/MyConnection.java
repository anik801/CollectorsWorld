/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsworld;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author John
 */
public class MyConnection {
    public static Connection ConnectDB() {
       try{
           // TODO code application logic here    
           Class.forName("oracle.jdbc.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","john","Qwerty1234");
           return con;
           
       }catch( Exception e ){
           e.printStackTrace();
       }
       return null;
       
    }
}
