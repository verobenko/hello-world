//b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según
//c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469-F).

package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class NIFService {
    Scanner leer = new Scanner(System.in);
    
    String[]asigLetras = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
            
    
    public void crearNif(NIF numero){
        System.out.println("Ingrese el DNI: ");
        numero.setDNI(leer.nextLong());
        int resultado = (int) numero.getDNI()%23;
        numero.setLetra(asigLetras [resultado]);
    }
    
    public void mostrarNif(NIF numero){
        System.out.println(numero.getDNI()+"-"+numero.getLetra());
    }
    
}
