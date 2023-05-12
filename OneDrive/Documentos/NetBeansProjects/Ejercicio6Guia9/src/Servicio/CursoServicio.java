


package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class CursoServicio {
    
    Scanner leer = new Scanner(System.in);
    
//Método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos de
//almacenar esta información en un arreglo e iterar con un bucle,
//solicitando //en cada repetición que se ingrese el nombre de cada
//alumno.
    public String[] cargarAlumnos() {
       String [] alumnos = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + i + 1);
            alumnos[i]=leer.nextLine();   
        }
        return alumnos;
    }
    
 //e) Método crearCurso(): el método crear curso, le pide los valores de
//los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Curso. En este método invocamos al
//método cargarAlumnos() para asignarle valor al atributo alumnos
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia del curso: ");
        double cantidadHorasPorDia = leer.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana del curso: ");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno '0' para mañana o '1' para tarde: ");
        boolean turno = leer.nextBoolean();
        System.out.println("Ingrese el precio por hora del curso: ");
        double precioPorHora = leer.nextDouble();
        System.out.println("Ingrese el nombre de los alumnos del curso: ");
        String[] alumnos = cargarAlumnos();
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);    
    }
    
//f) Método calcularGananciaSemanal(): este método se encarga de
//calcular la ganancia en una semana por curso. Para ello, se deben
//multiplicar la cantidad de horas por día, el precio por hora, la
//cantidad de alumnos y la cantidad de días a la semana que se repite
//el encuentro

    public void  calcularGananciaSemanal(){
        
        
    }   
}
