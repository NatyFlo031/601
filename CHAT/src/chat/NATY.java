
package chat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class NATY extends javax.swing.JFrame implements Observer{

    manejardatos cn=new manejardatos ();
    Connection con=cn.conexion();
    Statement st;
    ResultSet rs;
    String Autor="NATY";
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaA = fechaActual.format(formatoFecha);
    
    public NATY() {
        initComponents();
        this.getRootPane().setDefaultButton(this.enviar);
        this.setTitle("NATY");
        SERVIDOR servidor = new SERVIDOR (5000);
        servidor.addObserver(this);
        Thread hilo = new Thread(servidor);
        hilo.start();
        mostrarmensaje("");
    }
    void mostrarmensaje (String valor){
        try {
        String consulta = "SELECT Autor, Mensaje, fecha FROM datos";
        StringBuilder listaMensajes = new StringBuilder();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
           String autor = rs.getString("Autor");
            String mensaje = rs.getString("Mensaje");
            String fecha = rs.getString("fecha");
            listaMensajes.append(">").append(fecha).append("-").append(autor).append(": ").append(mensaje).append("\n");
         }
        rs.close();
        st.close();
        mostrarmensajesN.setText(listaMensajes.toString());

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarmensajesN = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        Deshacer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Naty");

        mensaje.setText("Escribe un mensaje");
        mensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mensajeMouseClicked(evt);
            }
        });

        enviar.setBackground(new java.awt.Color(255, 0, 102));
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("ENVIAR");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        mostrarmensajesN.setEditable(false);
        mostrarmensajesN.setColumns(20);
        mostrarmensajesN.setRows(5);
        jScrollPane1.setViewportView(mostrarmensajesN);

        jLabel2.setText("BUSCAR MENSAJE POR FECHA:");

        buscar.setBackground(new java.awt.Color(255, 0, 102));
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Deshacer.setBackground(new java.awt.Color(255, 255, 255));
        Deshacer.setForeground(new java.awt.Color(255, 0, 102));
        Deshacer.setText("DESHACER BUSQUEDA");
        Deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshacerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Deshacer)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(Deshacer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajeMouseClicked
        mensaje.setText("");
    }//GEN-LAST:event_mensajeMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
   try {
       String fechaB=fecha.getText();
        String consulta1 = "SELECT Autor, Mensaje, fecha FROM datos WHERE fecha='"+fechaB+"';";
        StringBuilder listaMensajesB = new StringBuilder();
        st = con.createStatement();
        rs = st.executeQuery(consulta1);
        while (rs.next()) {
            String autor = rs.getString("Autor");
            String mensaje = rs.getString("Mensaje");
            String fecha = rs.getString("fecha");
            listaMensajesB.append(">").append(fecha).append("-").append(autor).append(": ").append(mensaje).append("\n");
         }
        rs.close();
        st.close();
        mostrarmensajesN.setText(listaMensajesB.toString());

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_buscarActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        String mensaje = "> "+fechaA+"-"+Autor+":"+this.mensaje.getText()+"\n";
        this.mostrarmensajesN.append(mensaje);
        CLIENTE cliente =new CLIENTE (6000, mensaje);
        Thread hilo = new Thread (cliente);
        hilo.start();
        
         try {
            String aux=this.mensaje.getText();
            String guardar="INSERT INTO datos (Mensaje, Autor, fecha) VALUES (?, ?, ?); ";
            PreparedStatement ps=con.prepareStatement(guardar);
            ps.setString(1, aux);
            ps.setString(2,Autor);
            ps.setString(3,fechaA);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensaje enviado");
            
        } catch (SQLException e) {
            System.err.println("Error al guardar..."+e);
            JOptionPane.showMessageDialog(null,"Error al guardar"+e);
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void DeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshacerActionPerformed
     mostrarmensaje("");
    }//GEN-LAST:event_DeshacerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NATY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NATY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NATY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NATY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NATY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deshacer;
    private javax.swing.JButton buscar;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextArea mostrarmensajesN;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        mostrarmensajesN.append((String) arg);
        }



    
}
