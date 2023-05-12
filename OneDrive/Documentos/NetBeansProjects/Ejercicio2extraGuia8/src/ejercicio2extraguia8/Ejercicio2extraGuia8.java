/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extraguia8;

import Entidades.NIF;
import Servicio.NIFService;

/**
 *
 * @author Veronica
 */
public class Ejercicio2extraGuia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF numdni = new NIF();
        NIFService nifss= new NIFService();
        
        nifss.crearNif(numdni);
        nifss.mostrarNif(numdni);
    
    }
    
}
