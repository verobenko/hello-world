//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 
//estudiantes con sus respectivas notas.
//Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo 
//de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos 
//tareas que nos ha pedido la escuela.
//Calcular y mostrar el promedio de notas de todo el curso
//Retornar otro arreglo con los nombre de los alumnos que recibieron una nota
//mayor al promedio del curso
//Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
package ejerciciointegrador;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Estudiante[] estudiantes = new Estudiante[8];

        //{"Juan","Pedro","Lina","Clara","Dana","Leo";"Sara","Fer"};
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = leer.next();
            System.out.println("Ingrese la nota del estudiante: ");
            double nota = leer.nextDouble();
            estudiantes[i] = new Estudiante(nombre, nota);
        }

        double sumaNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            sumaNotas += estudiantes[i].getNota();
        }
        double promedioNotas = sumaNotas / estudiantes.length;
        System.out.println("El promedio de notas de los estudiantes es: " + promedioNotas);

        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
                contador++;
            }
        }
        String[] nombreEstudiante = new String[contador];
        contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota()>promedioNotas) {
                nombreEstudiante[contador] = estudiantes[i].getNombre();
                contador++; 
            }   
        }
        for (int i = 0; i < nombreEstudiante.length; i++) {
            System.out.println("El estudiante " + nombreEstudiante[i] + " supera la nota promedio.");
            
        }

    }
}
