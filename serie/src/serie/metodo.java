/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

/**
 *
 * @author Usuario
 */
public class metodo {
    
    public int ejercicio(int num){
        
        series s=new series (num);
        int resp=0;
        int suma=1;
        
        for (int i=0 ; i <s.getNum(); i++){
            
           
            suma=suma *2;
            
        }
        return suma;
    }
    
}
