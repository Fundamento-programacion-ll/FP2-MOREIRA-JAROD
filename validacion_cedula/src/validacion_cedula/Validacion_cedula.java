/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion_cedula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Validacion_cedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cedula");
        String cedula=lec.next();
        int c, suma=0, acum, resta=0;
        
        for (int i = 0; i < cedula.length()-1; i++) {
            c=Integer.parseInt(cedula.charAt(i)+"");
            if(i%2==0){
                c=c*2;
                if(c>9){
                    c=c-9;
                }
            }
            
            suma=suma+c;
        }
        
        if (suma%10 !=0) {
            acum=((suma/10)+1)*10;
            resta=acum-suma;
        }
        
        int ultimo=Integer.parseInt(cedula.charAt(9)+"");
        
        if (ultimo==resta) {
            System.out.println("la cedula ingresa es correcta");
        }else{
            System.out.println("la cedula es incorrecta");
        }
     
    }
    
}
