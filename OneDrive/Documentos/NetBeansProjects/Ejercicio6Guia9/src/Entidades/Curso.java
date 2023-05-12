//Un profesor particular está dando cursos para grupos de cinco alumnos
//y necesita un programa para organizar la información de cada curso.
//Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
//serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
//turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
//arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los
//siguientes métodos:
package Entidades;

/**
 *
 * @author Veronica
 */
public class Curso {
    
    private String nombreCurso;
    private double cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private boolean turno;
    private double precioPorHora;
    public String [] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, boolean turno, double precioPorHora, String [] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
