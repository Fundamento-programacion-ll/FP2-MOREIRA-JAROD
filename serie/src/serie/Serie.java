/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        
        metodo met =new metodo();
        series S =new series(n);
        
        Scanner Sc= new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        n=Sc.nextInt();
        
        System.out.println("el resultado es:" + met.ejercicio(n));
        
        
    }
    
}
