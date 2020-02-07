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
public class docente extends persona{
    
    private String area;
    private String cargo;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public docente(String area, String cargo, String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
        this.area = area;
        this.cargo = cargo;
    }

    public docente(String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
    }

    
    
    
    
    @Override
    public int calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
