//N.A 601
package poo601;

public class Exception3ClassNot {
    public static void main(String[] args) {
        try {
           Class.forName("ClaseQueNoExiste");
        } catch (ClassNotFoundException e) {
            System.out.println("La clase "+e.getMessage()+" no existe");
        } finally {
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
    }
}
