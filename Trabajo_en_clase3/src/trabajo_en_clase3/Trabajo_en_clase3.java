/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase3;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.awt.im.InputMethodJFrame;

/**
 *
 * @author antho
 */
public class Trabajo_en_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        punto p = new punto(0, 0);
        JFrame ventana = new JFrame();
        
        String opc =JOptionPane.showInputDialog(null,"Ingrese la opcion \n Punto \n Circulo");
        switch (opc){
        
            case "Punto": 
                System.out.println("Escogio Punto");
                break;
            case "Circulo": 
                System.out.println("Escogio Circulo");
                break;
        
        }
        ventana.add(p);
        ventana.setSize(700,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
