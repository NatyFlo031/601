//N.A 601
package poo601;

import javax.swing.JOptionPane;

public class Ejemplo1Exception {
    public static void main(String[] args){
        int x, y;
        try {
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1:", "Solicito datos",3));
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+" No es un número ENTERO");
        }
        
        
    }
}
