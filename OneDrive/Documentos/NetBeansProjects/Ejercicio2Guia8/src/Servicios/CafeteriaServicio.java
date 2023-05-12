/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class CafeteriaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera (Cafetera cafetera1){
        System.out.println("La cantidad actual de la cafetera es:" + cafetera1.getCantidadActual());
        cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());
        System.out.println("Llenando cafetera...");
        System.out.println("La cafetera esta en un nivel de: " + cafetera1.getCantidadActual());
        
    }
    
    public void servirTaza(Cafetera cafetera1) {
        System.out.println("Ingrese el tamaño de la taza: ");
        int tamañoTaza = leer.nextInt();
        if (tamañoTaza > cafetera1.getCantidadActual()) {
            double tazaActual = cafetera1.getCantidadActual();
            cafetera1.setCantidadActual(0);
            System.out.println("La taza no se llenó, quedó en:" + tazaActual);
        } else {
            System.out.println("La taza se llenó por completo");
            cafetera1.setCantidadActual(cafetera1.getCantidadActual() - tamañoTaza);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera1){
        System.out.println("Ingrese la cantidad con la que desea llenar la cafetera: ");
        double rellenadoCafe = leer.nextDouble();
        if (rellenadoCafe+cafetera1.getCantidadActual()>cafetera1.getCapacidadMaxima()) {
            System.out.println("La cantidad que desea ingresar supera la capcidad maxima");
        } else {
          cafetera1.setCantidadActual(cafetera1.getCantidadActual() + rellenadoCafe);
            System.out.println("La cafetera esta en un nivel de: " + cafetera1.getCantidadActual());
        }
        
        
        
    }
}
