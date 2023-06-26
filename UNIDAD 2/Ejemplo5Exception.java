//N.A 601
package poo601;

public class Ejemplo5Exception {
    public static int miMetodo2(int a, int b) throws ArithmeticException{
    if (b==0){
        throw new ArithmeticException();
    }
    int c=a/b;
    return c;
}
    public static void main(String[] args){
        try {
            int division = miMetodo2(10,0);
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética arrojada: ");
            e.printStackTrace();
        }
    }
}
