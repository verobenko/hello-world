//Crear una clase llamada Operacion que tenga como atributos privados
//numero1 y numero2. A continuación, se deben crear los siguientes
//métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Método constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos
//números y los guarda en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el
//resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el
//resultado al main
//g) Método multiplicar(): primero valida que no se haga una
//multiplicación por cero, si fuera a multiplicar por cero, el método
//devuelve 0 y se le informa al usuario el error. Si no, se hace la
//multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero,
//si fuera a pasar una división por cero, el método devuelve 0 y se le
//informa al usuario el error se le informa al usuario. Si no, se hace la
//división y se devuelve el resultado al main
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Operacion {

    private Double numero1;
    private Double numero2;

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1 = leer.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextDouble();

    }

    public double Sumar() {
        return numero1 + numero2;

    }

    public double Restar() {
        return numero1 - numero2;
    }

    //g) Método multiplicar(): primero valida que no se haga una
//multiplicación por cero, si fuera a multiplicar por cero, el método
//devuelve 0 y se le informa al usuario el error. Si no, se hace la
//multiplicación y se devuelve el resultado al main
    public double Multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error");
            return 0.0;

        } else {
            return numero1 * numero2;

        }
    }

    public double Division() {
        if (numero2 == 0) {
            System.out.println("Error");
            return 0.0;

        } else {
            return numero1 / numero2;
        }

    }
}
