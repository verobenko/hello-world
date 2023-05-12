//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
//Luego, crea un método "retirar_dinero" que permita retirar una cantidad
//de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
//negativo después de realizar una transacción de retiro.

package ejercicio4extraguia7;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Cuenta {
    
    public double saldo;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void retirarDinero(){
        
        saldo = 20000;
        double retiro;
        double saldoaux = saldo;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("ingrese monto a retirar");
            retiro = leer.nextDouble();
            saldo-=retiro;
            if (saldo >= 0) {
            System.out.println("usted retiró: " + retiro + " su saldo actual es: " + saldo);
            }
            else {
                
                System.out.println("Fondos insuficientes");
                saldo=saldo+retiro;
                
             
            }
        
            
        } while (saldo>0);
        
        
        
        
        
    }
    
    
}
