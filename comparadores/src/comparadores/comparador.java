/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;
import java.util.Comparator;
/**
 *
 * @author Usuario
 */
public class comparador implements Comparator{

     int compararNombre;
    provincias provincia1, provincia2;
    @Override
    public int compare(Object pro1, Object pro2) {
        provincia1 = (provincias)pro1;
        provincia2 = (provincias)pro2;
        compararNombre = (provincia1.getNombreProvincia()
                .compareToIgnoreCase(provincia2.getNombreProvincia()));
        return compararNombre;
    }
    
}