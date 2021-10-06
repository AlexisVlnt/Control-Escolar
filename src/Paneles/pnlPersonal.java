
package Paneles;

import Clases.conexion;
import control_escolar_form.Prncipal;
import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pnlPersonal extends javax.swing.JPanel {
 
    public pnlPersonal() {
        initComponents();

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        txtRuta1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRuta2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRuta3 = new javax.swing.JTextField();
        ayuda = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 248, 253));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuevo Personal");

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel.setOpaque(false);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel6.setText("Nombre Usuario:");

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("Agregar");
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtRuta1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtRuta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 2, true));
        txtRuta1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuta1ActionPerformed(evt);
            }
        });
        txtRuta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRuta1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuta1KeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel8.setText("Contraseña:");

        txtRuta2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtRuta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 2, true));
        txtRuta2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRuta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuta2ActionPerformed(evt);
            }
        });
        txtRuta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRuta2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuta2KeyTyped(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel9.setText("Repita Contraseña:");

        txtRuta3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtRuta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 2, true));
        txtRuta3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRuta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuta3ActionPerformed(evt);
            }
        });
        txtRuta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRuta3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuta3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton7)
                .addGap(36, 36, 36))
        );

        ayuda.setBackground(new java.awt.Color(255, 255, 255));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayuda.setToolTipText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (txtRuta1.getText().length() >= 5 && txtRuta2.getText().length() == 4 && txtRuta3.getText().length() == 4) {
            if (txtRuta2.getText().equals(txtRuta3.getText().toString())==true) {
                try {
                  conexion conexion = new conexion();
                  PreparedStatement query = conexion.getConnection().prepareStatement("insert into usuario values (?,?,?)");
            
                  query.setString(1, txtRuta1.getText());
                  query.setString(2, txtRuta2.getText());
                  query.setString(3, "final");
            
                  int agregar = query.executeUpdate();
            
                  if (agregar > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario Agregado a manera correcta");
                    txtRuta1.setText("");
                    txtRuta2.setText("");
                    txtRuta3.setText("");
                    jButton7.setEnabled(false);   

                }else{
                    JOptionPane.showMessageDialog(null, "El personal que desea agregar ya existe");
                }
                query.close();
                conexion.desconectar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al agregar al personal");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
                      
        }else{
            JOptionPane.showMessageDialog(null, "Acomplete los campos de manera correcta");
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtRuta1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta1KeyReleased

    private void txtRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta1ActionPerformed

    private void txtRuta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta2ActionPerformed

    private void txtRuta2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta2KeyReleased

    private void txtRuta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta3ActionPerformed

    private void txtRuta3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta3KeyReleased

    private void txtRuta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta1KeyTyped
        char letra = evt.getKeyChar();
        //Función para que la caja de texto solo acepte letras
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z')){
            evt.consume();
            
        }
        
        if(txtRuta1.getText().length() >= 15){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRuta1KeyTyped

    private void txtRuta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta2KeyTyped
        char numero = evt.getKeyChar();
        //Función para que la caja de texto solo acepte números
        if(numero < '0' || numero > '9'){
            evt.consume();
            
        }
        if(txtRuta2.getText().length() >= 4 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRuta2KeyTyped

    private void txtRuta3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta3KeyTyped
        char numero = evt.getKeyChar();
        //Función para que la caja de texto solo acepte números
        if(numero < '0' || numero > '9'){
            evt.consume();
            
        }
        if(txtRuta3.getText().length() >= 4 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRuta3KeyTyped

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Users\\PC\\Documents\\Tema 1.- Prácticas de Laboratorio.pdf#page=3");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField txtRuta1;
    private javax.swing.JTextField txtRuta2;
    private javax.swing.JTextField txtRuta3;
    // End of variables declaration//GEN-END:variables
}
