//Desarrollar una clase Cancion con los siguientes atributos: título y autor.
//Se deberá definir además dos constructores: uno vacío que inicializa el
//título y el autor a cadenas vacías y otro que reciba como parámetros el
//título y el autor de la canción. Se deberán además definir los métodos
//getters y setters correspondientes.

package ejercicio1extraguia7;

/**
 *
 * @author Veronica
 */
public class Ejercicio1extraGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cancion c1= new Cancion();
        
        c1.setAutor("Pedro");
        System.out.println("El autor de la cancion es: " + c1.getAutor());
        
        
    }
    
}
