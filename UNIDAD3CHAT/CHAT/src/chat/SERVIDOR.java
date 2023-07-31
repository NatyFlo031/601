
package chat;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class SERVIDOR extends Observable implements Runnable{
    private int puerto;
    public SERVIDOR(int puerto){
        this.puerto=puerto;
    }
    @Override
    public void run() {
        ServerSocket servidor=null;
        Socket socket = null;
        DataInputStream entrada;
        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor funcionando");
            while (true){
                socket = servidor.accept();
                System.out.println("Cliente ha hecho conexión");
                entrada =new DataInputStream(socket.getInputStream());
                String mensaje=entrada.readUTF();
                System.out.println(mensaje);
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                socket.close();
                System.out.println("Cliente ha salido de la conexión");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
