//N.A 601
package poo601;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception5IO {
     public static void main(String[] args) {
        try {
            CargarArchivo("archivo.txt");
        } catch (IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
    
    public static void CargarArchivo(String nombre) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombre));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new IOException("El archivo no se encuentra", e);
        } catch (IOException e) {
            throw e;
        }
    }
}
