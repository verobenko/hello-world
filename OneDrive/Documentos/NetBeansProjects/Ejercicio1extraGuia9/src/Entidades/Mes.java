//Crea una clase en Java donde declares una variable de tipo array de
//Strings que contenga los doce meses del año, en minúsculas. A
//continuación, declara una variable mesSecreto de tipo String, y hazla
//igual a un elemento del array (por ejemplo, mesSecreto = mes[9]
package Entidades;

/**
 *
 * @author Veronica
 */
public class Mes {
    
    public String [] mesesDelAnio = new String [12];
    public String mesSecreto;

    public Mes() {
    }

    public Mes(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesesDelAnio() {
        return mesesDelAnio;
    }

    public void setMesesDelAnio(String[] mesesDelAnio) {
        this.mesesDelAnio = mesesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   
   
    
    
    
    
}
