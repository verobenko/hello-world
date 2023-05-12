//Crear una clase CadenaServicio en el paquete servicios que implemente 
//los siguientes métodos:
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
//que tiene la frase ingresada.
    public void mostrarVocales(Cadena frase) {
        int i = 0;
        for (int j = 0; j < frase.getLongitud() - 1; j++) {
            switch (frase.getFrase().substring(j, j + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    i++;
                    break;
            }    
        }
        System.out.println("La frase tiene " + i + " vocales.");
    }
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(Cadena frase) {
        StringBuilder fr = new StringBuilder(frase.getFrase());
        fr.reverse();
        String fi = fr.toString();
        System.out.println("La frase invertida es: " + fi);

    }

//Método vecesRepetido(String letra), recibirá un carácter ingresado por 
//el usuario y contabilizar cuántas veces se repite el carácter en la frase, 
//por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
    public void vecesRepetido(Cadena frase, String letra) {
        System.out.println("Ingrese un caracter: ");
        letra = leer.nextLine();
        int i = 0;
        for (int j = 0; j < frase.getLongitud(); j++) {
            if (frase.getFrase().substring(j, j + 1).equalsIgnoreCase(letra)) {
                i++;
            }
        }
        System.out.println("El caracter se repite: " + i + " veces.");
    }

//Método compararLongitud(String frase), deberá comparar la longitud de la 
//frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena frase, String frase2) {
        if (frase.getLongitud() == frase2.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen distinta longitud" + ""
                    + "n/La frase 1 tiene " + frase.getLongitud() + "" + "n/La frase 2 tiene "
                    + frase2.length());
        }
    }

//Método unirFrases(String frase), deberá unir la frase contenida en la clase
//Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
    public void unirFrases(Cadena frase, String frase2) {
        System.out.println("Las frases unidas resultan asi: " + frase.getFrase().concat(frase2));

    }

//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que 
//se encuentren en la frase, por algún otro carácter seleccionado por el usuario
//y mostrar la frase resultante.
    public void reemplazar(Cadena frase) {
        System.out.println("Ingrese un caracter para reemplazar la letra 'a'");
        char letra = leer.next().charAt(0);
        System.out.println(frase.getFrase().toLowerCase().replace('a', letra));
    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra 
//que ingresa el usuario y devuelve verdadero si la contiene y falso si no.  
    public boolean contiene(Cadena frase) {
        System.out.println("Ingrese una letra a buscar en la frase: ");
        String letra = leer.next();
        return frase.getFrase().contains(letra);

    }
}
