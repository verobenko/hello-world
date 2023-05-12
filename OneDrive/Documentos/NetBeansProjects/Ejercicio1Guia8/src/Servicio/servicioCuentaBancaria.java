/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class servicioCuentaBancaria {
    
    Scanner leer = new Scanner(System.in);
    
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su numero de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI:");
        long dniCliente = leer.nextLong();
        double saldoActual = 30000;
        System.out.println("Su saldo actual es:" + saldoActual);
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        
    }
    
    public double ingresar(double saldoActual) {
        System.out.println("Escriba el monto a ingresar: ");
        double ingreso = leer.nextDouble();
        saldoActual = saldoActual + ingreso;

        return saldoActual;

    }

    public double retirar(double saldoActual) {
        System.out.println("Escriba el monto a retirar: ");
        double retirar = leer.nextDouble();

        if (saldoActual <= retirar) {
            System.out.println("No tiene fondos suficientes, puede retirar: " + saldoActual);
            System.out.println("¿Desea continuar con la operacion? S/N");
            String opcion = leer.nextLine();

            if (opcion == "S") {
                saldoActual = 0;

            } else {
                System.out.println("Gracias su operacion ha finalizado.");
                return saldoActual;

            }

        } else {
            System.out.println("Su operacion se realizo con exito.");
            saldoActual = saldoActual - retirar;

        }
        return saldoActual;
    }
    
    public double extraccionRapida(double saldoActual){
        double saldoRapido = saldoActual*0.20;
        System.out.println("La extraccion rapida tiene un importe de: " + saldoRapido);
        System.out.println("Cuanto desea retirar");
        double importeRetirar = leer.nextDouble();
        if (importeRetirar<=saldoRapido) {
            System.out.println("Su operacion su realizada con exito.");
            saldoActual=saldoActual-importeRetirar;
            
        } else{
            System.out.println("El monto a retirar no es valido.");
        }
        return saldoActual;
    }
    
    public void consultarSaldo(double saldoActual) {
        System.out.println("Su saldo actual es de: " + saldoActual);
        
    }
    
    public void consultarDatos(int numeroCuenta, long dniCliente, double saldoActual){
        System.out.println("Numero de cuenta: " + numeroCuenta); 
        System.out.println("DNI: " + dniCliente );
        System.out.println("Saldo actual: " + saldoActual);
        
    }
}
