/*.
 */
package ejercicio1guia9;

import Entidades.Cadena;
import Servicio.CadenaServicio;

/**
 * @author Veronica
 */
public class Ejercicio1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena cd = new Cadena("Hola Luna");
        CadenaServicio cs = new CadenaServicio();
       
        cs.mostrarVocales(cd);
        cs.invertirFrase(cd);
        cs.reemplazar(cd);
        
    }
    
}
