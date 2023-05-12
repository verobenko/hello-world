/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Veronica
 */
public class Persona {
    
    public Persona(String nombre, int edad, String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        
    }
    
     
    
    public String nombre;
    public int edad;
    public String nacionalidad;

    public Persona() {
    }
    
}
