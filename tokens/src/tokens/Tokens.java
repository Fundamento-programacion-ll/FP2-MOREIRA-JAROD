/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Dimension del Arreglo"));
        
        tokens.Vector v=new tokens.Vector(dimension);
        
        v.esPrimo(dimension);
        
        
        System.out.println(v.listarPrimos());
            
    }
    
}
