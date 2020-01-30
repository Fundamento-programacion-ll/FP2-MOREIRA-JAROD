/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Conexion {
     public static Connection conn;
 private static final String USER = "user";
 private static final String PASSWORD = "1234";
 private static final String URL = "jdbc:mysql://localhost:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
 private static final String CLASS_DRIVER = "com.mysql.cj.jdbc.Driver";
 public static Connection getConnection(){
 try{
 Class.forName(CLASS_DRIVER).newInstance();
 conn = DriverManager.getConnection(URL, USER, PASSWORD);
 //System.out.println("conexion exitosa");
     //JOptionPane.showMessageDialog(null, "conexion exitosa");
      
 }catch (Exception ex){
     System.out.println(Conexion.class.getName() + "error de conexion");
     ex.printStackTrace();
 }
 return conn;
 }
    
}
