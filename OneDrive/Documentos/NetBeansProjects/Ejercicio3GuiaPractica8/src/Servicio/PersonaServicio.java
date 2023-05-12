//En el paquete Servicios crear PersonaServicio con los siguientes 3
//métodos:
//a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
//función devuelve un booleano.
//b) Metodo crearPersona(): el método crear persona, le pide los valores
//de los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Persona. Además, comprueba que el
//sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
//deberá mostrar un mensaje
//3
//c) Método calcularIMC(): calculara si la persona está en su peso ideal
//(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
//valor menor que 20, significa que la persona está por debajo de su
//peso ideal y la función devuelve un -1. Si la fórmula da por resultado
//un número entre 20 y 25 (incluidos), significa que la persona está en
//su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene
//sobrepeso, y la función devuelve un 1.
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public boolean mayorEdad(Persona p1) {
        boolean mayorEdad = true;
        System.out.println("Ingrese la edad de la persona: ");
        p1.setEdad(leer.nextInt());
        if (p1.getEdad() < 18) {
            System.out.println("La persona es menor de edad.");
            p1.equals(false);
        } else {
            System.out.println("La persona es mayor de edad.");
            p1.equals(true);
        }

        return mayorEdad;

    }

    public void crearPersona (Persona p1){
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo: H/M/O ");
        p1.setSexo(leer.nextLine());
        System.out.println("Ingrese el peso: ");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        p1.setAltura(leer.nextDouble());
          
    }
    
}
