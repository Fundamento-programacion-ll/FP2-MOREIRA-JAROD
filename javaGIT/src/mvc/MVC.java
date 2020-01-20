/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Modelo.persona;

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
       
       persona kevin = new persona("kevin", "jimenez", "la 41", 1725339, 20, 943576774,'m', true);
       persona juan = new persona("juan", "jimenez", "la 42", 1725433, 23, 943576774,'h', true);
       persona pepe = new persona("pepe", "jimenez", "la 43", 1724339, 22, 943576774,'m', true);
    }
    
}
