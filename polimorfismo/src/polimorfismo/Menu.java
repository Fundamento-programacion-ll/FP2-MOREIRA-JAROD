/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        SolicitudSaldo a=new SolicitudSaldo(300, 1546233164);
        System.out.println(a);
        
        Retiros b=new Retiros(100, 1546233164);
        System.out.println(b);
        
        Deposito c=new  Deposito(400, 1546233164);
        System.out.println(c);
        
        totalsaldo();
    }
    
    
    
    
    
    public static void totalsaldo (){        
        double total;
        total=400+500-100;
        System.out.println("El saldo total que tiene es de: "+total);
        
    }
    
}
