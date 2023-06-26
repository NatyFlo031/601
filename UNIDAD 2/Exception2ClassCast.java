//N.A 601
package poo601;


import javax.swing.JOptionPane;

public class Exception2ClassCast {
    
    public static void main(String[] args) {
        try {
            int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero", "Solicito datos",3));
            Object objeto = x;
            String str = (String) objeto; // Tratar de convertir el objeto causará el error
        } catch (ClassCastException e) {
            System.out.println("El tipo String no es una subclase de integer " + e.getMessage());
        }catch (NumberFormatException n) {
            System.out.println("No introdujo un numero ENTERO: " + n.getMessage());
        }
    }
}

