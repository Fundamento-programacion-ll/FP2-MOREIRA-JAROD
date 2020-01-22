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
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU \n"+ "1.-agregar persona \n"+"2.-lista de personas \n"+"3.-Salir\n", this)) ;
        
        
        
        do {
        switch (opcion){
            case 1 :
                String nombre= JOptionPane.showInputDialog(null, "ingrese un nombre");
                metodos.agregarPersona(nombre);
                System.out.println(metodos.ListarPersona());
                break;
                
            case 2:
                
                System.out.println(metodos.ListarPersona());
            break;
            
            case 3:
            opcion =3;
            break;
            
            default:
                opcion =3;
                
                break;
        }
            
            
        }while (opcion !=3); 
                
        
        
    }
    
}
