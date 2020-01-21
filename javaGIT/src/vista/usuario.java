/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class usuario {
    User metodos = new User();
                
    public void menu(){
        
        int opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU \n"+ "agregar persona \n", this)) ;
        
        switch (opcion){
            case 1 :
                metodos.agregarPersona("pepi");
                break;
                
            case 2:
                metodos.ListarPersona();
            break;
            default:
                break;
        }
    }
    
}
