//N.A 601
package poo601;


import javax.swing.JOptionPane;



public class Exception1Array {
    public static void main(String[] args){
        int[] miArray={1,2,3,4,5,6,7,8,9,10};
        int x;
        try {
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la posición del dato dentro del array que desea visualizar:", "Solicito datos",3));
            JOptionPane.showMessageDialog(null, "La posición "+x+" contiene el valor: "+miArray[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posición "+e.getMessage()+" es incorrecta");
        
        }
        }
}
