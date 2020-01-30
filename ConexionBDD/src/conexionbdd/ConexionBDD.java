/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;




/**
 *
 * @author usuario
 */
public class ConexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PreparedStatement ps = null;
        Connection accesoDB = Conexion.getConnection();
        Conexion stringConexion = new Conexion();
       // stringConexion.getConnection();
        
    }
    
}
