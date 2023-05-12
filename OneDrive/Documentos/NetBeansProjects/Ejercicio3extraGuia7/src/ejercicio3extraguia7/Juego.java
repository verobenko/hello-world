// Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
//a dos jugadores jugar un juego de adivinanza de números. El primer
//jugador elige un número y el segundo jugador intenta adivinarlo. El
//segundo jugador tiene un número limitado de intentos y recibe una pista
//de "más alto" o "más bajo" después de cada intento. El juego termina
//cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el
//número de veces que cada jugador ha ganado
package ejercicio3extraguia7;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Juego {
    
    public String jugador1;
    public String jugador2;
    public int num;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int num) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num = num;
    }
    
    public void iniciarJuego(){
        int numero;
        int intentos = 3;
        int victorias = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1: ");
        jugador1 = leer.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        jugador2 = leer.nextLine();
        
        System.out.println(jugador1 + "Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println(jugador2 + "Adivine el numero: ");
        numero = leer.nextInt();
        
        while (intentos <= 3) {
            if (num == numero) {
                System.out.println("gano!");
                victorias += 1;
                break;
            } else if (num < numero)
                    System.out.println("El numero es menor");
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos");

                
            }
        }     
        
        
    }
    
    
