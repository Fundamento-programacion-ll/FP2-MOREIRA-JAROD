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
public class limpieza extends persona{
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public limpieza(String turno, String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
        this.turno = turno;
    }

    public limpieza(String nombre, String apellido, String genero, int edad, int ci) {
        super(nombre, apellido, genero, edad, ci);
    }

    
    
    
    
    @Override
    public int calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
