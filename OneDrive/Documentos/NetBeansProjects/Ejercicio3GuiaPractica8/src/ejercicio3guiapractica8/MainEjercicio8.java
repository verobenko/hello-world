/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guiapractica8;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Veronica
 */
public class MainEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio pss = new PersonaServicio();
        Persona pers = new Persona();
        
        pss.mayorEdad(pers);
        
        
        
        
    }
    
}
