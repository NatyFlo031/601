//N.A 601
package poo601;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception6FileNot {
     public static void main(String[] args) {
        try {
            FileReader leerArchivo = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }
    }
}
