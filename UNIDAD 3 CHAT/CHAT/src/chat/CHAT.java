
package chat;

import java.io.IOException;



public class CHAT {

    public static void main(String[] args) throws IOException {
        
        Thread chatAppHilo = new Thread(() -> {
            NATY chatApp = new NATY();
            chatApp.setVisible(true);
        });

        Thread chatApp2Hilo = new Thread(() -> {
            ALEX chatApp2 = new ALEX();
           chatApp2.setVisible(true);
           
        });
        chatAppHilo.start();
        chatApp2Hilo.start();


    }
    
}
