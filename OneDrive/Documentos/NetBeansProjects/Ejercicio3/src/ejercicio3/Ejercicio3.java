/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Veronica
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion Calculadora = new Operacion();
        
        Calculadora.crearOperacion();
        System.out.println("La suma del numero1 y numero2 es: " + Calculadora.Sumar());
        System.out.println("La resta de los numero1 y numero2 es: " + Calculadora.Restar());
        System.out.println("El producto de los numeros es: " + Calculadora.Multiplicacion());
        System.out.println("El cociente de los numeros es: " + Calculadora.Division());
        
        
    
    }
    
}
