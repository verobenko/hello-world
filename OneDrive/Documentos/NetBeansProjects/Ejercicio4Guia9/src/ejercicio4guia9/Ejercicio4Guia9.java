//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
//FechaService, en paquete Servicios, que tenga los siguientes métodos:
//a) Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
//b) Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
//El método debe retornar el objeto Date.
//c) Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion
//Oracle
package ejercicio4guia9;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Veronica
 */
public class Ejercicio4Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
        
        FechaService fs = new FechaService();
        
        Date fecha1 = fs.fechaNacimiento();
        System.out.println("Su fecha de nacimiento es: "+ fecha1);
        Date fechaActual = fs.fechaActual();
        System.out.println("La fecha actual es: "+fs.fechaActual());
        
        System.out.println("La edad actual es " + fs.diferencia(fecha1, fechaActual));
      
        
    }
    
}
