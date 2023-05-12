/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Circunferencia;

/**
 *
 * @author Veronica
 */
public class Circunferencia {
    private Double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(Double radio) {
     this.radio = radio;
     
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        this.radio = radio;
        
    }
    
    public void area(){
        Double area;
        area = Math.pow((radio*(Math.PI)),2);
        
    } 
    
    public void perimetro() {
        Double perimetro;
        perimetro = 2*(Math.PI)*radio;
        
    }
}
