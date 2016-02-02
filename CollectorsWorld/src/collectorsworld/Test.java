/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsworld;

import com.onbarcode.barcode.Code128;

/**
 *
 * @author John
 */
public class Test {       
    
    public static void main(String args[]){    
        try{
        // Select a barcode type to create a Java barcode object 
        Code128 barcode = new Code128(); 
        // Set barcode data text to encode
        barcode.setData("1101"); 
        // Set barcode data text to encode
        barcode.setX(2); 
        
        // Generate barcode & encode into GIF format
        //barcode.drawBarcode("C://barcode-code128.gif"); 
        // Generate barcode & encode into JPEG format
        barcode.drawBarcode("C://test//test.jpg"); 
        // Generate barcode & encode into EPS format
        //barcode.drawBarcode2EPS("C://barcode-code128.eps"); 
        // Generate barcode & print into Graphics2D object
        //barcode.drawBarcode("Java Graphics2D object"); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
