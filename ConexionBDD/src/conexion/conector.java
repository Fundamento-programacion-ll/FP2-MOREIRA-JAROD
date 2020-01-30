/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class conector {
    
   
   public static Connection conn;
     private static final String USER= "userPrueba";
    private static final String PASSWORD= "clavePrueba";
    private static final String URL= "jdbc:mysql://localhost:3306/prueba";
    private static final String CLASS_DRIVER= "com.mysql.cj.jbdc.Driver";
   
    
    public conector(){
        
        try{
        Class.forName(CLASS_DRIVER).newInstance();
        conn= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        
    }catch (Exception ex){
        System.out.println(conector.class.getName() + "Error al abrir la conexion ");
        ex.printStackTrace();
    }
}    
    
}
