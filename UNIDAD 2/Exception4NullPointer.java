//N.A 601
package poo601;

public class Exception4NullPointer {
    public static void main(String[] args) {
        try {
            Integer x = null;
            miMetodo(x);
        } catch (NullPointerException e) {
            System.out.println("Se produjo una NullPointerException: " + e.getMessage());
        }
    }
    
    public static void miMetodo(int x) throws NullPointerException {
        System.out.println("El valor es: "+x);
    }
}
