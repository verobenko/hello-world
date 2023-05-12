//Imagina que tienes una lista de empleados en una pequeña empresa, y deseas 
//calcular su salario promedio y saber cuáles empleados tienen un salario 
//superior al promedio. 
//Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán 
//el nombre y el salario (que representa el salario mensual del empleado). La 
//empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6 
//objetos Empleado con sus respectivos salarios.
//Una vez creados los empleados, deberás guardarlos en un arreglo de objetos 
//tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que 
//te piden: 
//1. Calcular y mostrar el salario promedio de todos los empleados. 
//2. Retornar otro arreglo con los nombres de los empleados que tienen un 
//salario mayor al promedio. 
//Finalmente, debes mostrar todos los empleados con un salario superior al 
//promedio. 
//Recuerda que para crear un vector de objetos, la definición es la siguiente: 
//Objeto nombreVector[] = new Objeto[]
package integradoryoutubejere;

import Entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado[] empleados = new Empleado[6];

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = leer.next();
            System.out.println("Ingrese el salario del empleado: ");
            double salario = leer.nextDouble();
            empleados[i] = new Empleado(nombre, salario);
        }

        double sumaSalarios = 0;
        for (int i = 0; i < empleados.length; i++) {
            sumaSalarios += empleados[i].getSalario();
        }

        double promedioSalarios = sumaSalarios / empleados.length;
        System.out.println("El promedio de los salarios es: " + promedioSalarios);

        int contador = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > promedioSalarios) {
                contador++;
            }
        }
        //ahora hacemos un vector solo para recorrer el nombre, es un vector solo 
        //de strings.
        //el otro vector era de un objeto y recorria atributos

        String[] nombreEmpleados = new String[contador];
        contador = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > promedioSalarios) {
                nombreEmpleados[contador] = empleados[i].getNombre();
                contador++;
            }
        }
        for (int i = 0; i < nombreEmpleados.length; i++) {
            System.out.println("El empleado "+nombreEmpleados[i]+" supera el promedio de salarios.");
        }

    }
}
