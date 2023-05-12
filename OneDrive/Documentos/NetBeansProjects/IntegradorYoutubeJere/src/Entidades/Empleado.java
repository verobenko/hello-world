//Imagina que tienes una lista de empleados en una pequeña empresa, y deseas 
//calcular su salario promedio y saber cuáles empleados tienen un salario 
//superior al promedio. 
//Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán 
//el nombre y el salario (que representa el salario mensual del empleado). La 
//empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6 
//objetos Empleado con sus respectivos salarios.
package Entidades;

/**
 *
 * @author Veronica
 */
public class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
