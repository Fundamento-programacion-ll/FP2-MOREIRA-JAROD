/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class persona {
    String nombre;
    String apellido;
    String dirreccion;
    int cedula;
    int telefono;
    int edad;
    char genero;
    boolean estado_civil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(boolean estado_civil) {
        this.estado_civil = estado_civil;
    }

    public persona(String nombre, String apellido, String dirreccion, int cedula, int telefono, int edad, char genero, boolean estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirreccion = dirreccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.estado_civil = estado_civil;
    }

    @Override
    public String toString() {
        return 
                "nombre" + this.getNombre();
    }

    
    
     
    
    
    
}
