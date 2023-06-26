//N.A 601
package poo601;
public class Ejemplo4Exception {
    public static void main(String[] args){
        try {
            int division = miMetodo(10,0);
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética arrojada");
        }
    }
    public static int miMetodo(int a, int b) throws ArithmeticException{ //Metodo anexo, con el disparador de la excepción indicando el tipo
        int c=a/b;
        return c;
    }
}
