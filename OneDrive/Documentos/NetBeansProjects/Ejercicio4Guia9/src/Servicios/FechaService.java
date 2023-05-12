/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);
    Date fecha1 = new Date();

//a) Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
    public Date fechaNacimiento() {
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = leer.nextInt();

        return new Date(anio - 1900, mes, dia);

    }
//b) Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
//El método debe retornar el objeto Date.
    
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;

    }

 //c) Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion
//Oracle  
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int diferencia = fechaActual.getYear() - fechaNacimiento.getYear();
        return diferencia;

    }
}
