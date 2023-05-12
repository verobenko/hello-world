/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;

/**
 *
 * @author Veronica
 */
public class servicioPersona {
    
    Persona p1 = new Persona();
    
    public void mostrarPersona() {
        p1.setNombre("Juan");
        p1.setApellido("Gonzalez");
        p1.setDocumento(27500600);
        p1.setNacionalidad("Argentina");
        
       
        System.out.println(p1.getNombre()+" "+p1.getApellido()+" "+p1.getDocumento()+" "+p1.getNacionalidad());
        
    
}
    
   
    
    
}
