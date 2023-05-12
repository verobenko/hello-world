/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Veronica
 */
public class ArregloService {
    
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
    public void inicializarA(double [] vectorA){
        Arrays.setAll(vectorA, i-> (double)(Math.random()*10));
        
    }
 //2) Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
    public void mostrar(double [] vector){
        System.out.println(Arrays.toString(vector));
        
    }
    
//3) Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
    public void ordenar (double [] vector){
        Arrays.sort(vector,0,49);
        
    }
    
//4) Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB(double [] vectorB, double [] vectorA){
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        Arrays.fill(vectorB, 10, 20, 0.5);
        
    }
    
}
