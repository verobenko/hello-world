/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Puntos {
    
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas: ");
        this.x1= leer.nextDouble();
        this.y1= leer.nextDouble();
        this.x2= leer.nextDouble();
        this.y2= leer.nextDouble();   
        
    }
    
    public double calcularDistncia(){
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
        
        
        
    }
    

  
    
}
