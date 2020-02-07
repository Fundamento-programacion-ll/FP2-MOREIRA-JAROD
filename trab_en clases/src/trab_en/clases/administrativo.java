/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab_en.clases;

/**
 *
 * @author Usuario
 */
public class administrativo extends persona{


private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public administrativo(String area, String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
        this.area = area;
    }

    public administrativo(String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
    }



    @Override
    public int calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
