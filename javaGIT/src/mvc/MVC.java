/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Modelo.persona;
import vista.usuario;

/**
 *
 * @author Usuario
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       usuario inicio =new usuario();
       
       
       persona pepi= new persona("pepi", "ortiz", "la 30", "1725332769", "0988914649", 0,'m', true);
       persona pepe= new persona("pepe", "perez", "la 30", "1725332769", "0988914649", 0,'m', true);
       persona pepo= new persona("pepo", "ortiz", "la 30", "1725332769", "0988914649", 0,'m', true);
       
       
        System.err.println("pepi");
        
        inicio.menu();
    }
    
}
