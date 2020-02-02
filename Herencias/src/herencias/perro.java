/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Usuario
 */
public class perro extends animal {
    
    private float estructura;

    public float getEstructura() {
        return estructura;
    }

    public void setEstructura(float estructura) {
        this.estructura = estructura;
    }

    

    public perro(float estructura) {
        this.estructura = estructura;
    }
    
    public perro(){
        
    }
    public perro(float estructura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estructura = estructura;
    }
    
    public void datos(){
        System.out.println("Nombre: "+ getNombre()+ "Edad :"+ getEdad() + "Genero :" +getGenero());
    }
    
    
}
