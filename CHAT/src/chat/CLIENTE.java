
package chat;

import java.io.DataOutputStream;
import java.net.Socket;

public class CLIENTE implements Runnable{
    private int puerto;
    private String mensaje;
    
    public CLIENTE(int puerto, String mensaje){
    this.puerto=puerto;
    this.mensaje=mensaje;
    }
    @Override
    public void run() {
        final String HOST="127.0.0.1";
        DataOutputStream salida;
        try {
            Socket socket=new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF(mensaje);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    
}
