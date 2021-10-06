package Paneles;

import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pnlRes extends javax.swing.JPanel {

    public pnlRes() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        restaurar = new javax.swing.JButton();
        txtRuta2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtRuta1 = new javax.swing.JTextField();
        ayuda = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 248, 253));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Respaldar Y Restaurar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Restaurar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione El Archivo Para Restaurar:");

        restaurar.setBackground(new java.awt.Color(204, 204, 255));
        restaurar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        restaurar.setForeground(new java.awt.Color(0, 153, 153));
        restaurar.setText("Restaurar");
        restaurar.setBorderPainted(false);
        restaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });

        txtRuta2.setEditable(false);
        txtRuta2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
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
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jButton2.setText("Elegir Archivo");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(62, 38));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setText("Este proceso puede tardar varios minutos.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restaurar)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRuta2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15)
                .addComponent(restaurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Respaldar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel.setOpaque(false);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione Donde desea Guardar El Archivo:");

        guardar.setBackground(new java.awt.Color(204, 204, 255));
        guardar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(0, 153, 153));
        guardar.setText("Guardar");
        guardar.setBorderPainted(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jButton1.setText("Elegir Carpeta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(62, 38));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtRuta1.setEditable(false);
        txtRuta1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
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
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtRuta1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(164, 164, 164))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuta1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(guardar)
                .addGap(21, 21, 21))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(197, Short.MAX_VALUE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(446, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        String ruta = txtRuta2.getText();
       
        if (ruta.trim().length() != 0) {
            try {
                /* Comando a ejecutar, note que se utiliza un array, ya que una sola
                linea causaria un bloqueo de búfer*/
                String command[] = new String[]{"bin/mysql", "control_escolar", "-u" + "root", "-p"
                    + "123456", "-e", " source " + ruta};

                /*Se crea un proceso que ejecuta el comando dado*/
                Process bck = Runtime.getRuntime().exec(command);

                /* Obtiene el flujo de datos del proceso, esto se hace para obtener 
                el texto del proceso*/
                InputStream stdout = bck.getErrorStream();

                /* Se obtiene el resultado de finalizacion del proceso*/
                int resultado = bck.waitFor();

                String line;

                /* Se crea un buffer de lectura con el flujo de datos outstd y ese mismo
            sera leido e impreso, esto mostrara el texto que muestre el programa
            mysqldump, de esta forma sabra cual es el error en su comando*/
                BufferedReader brCleanUp
                        = new BufferedReader(new InputStreamReader(stdout));
                while ((line = brCleanUp.readLine()) != null) {
                    System.out.println(line);
                }
                brCleanUp.close();

                if (resultado == 0) {
                    JOptionPane.showMessageDialog(null, "Restauración exitosa");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al restaurar");
                }
            } catch (IOException | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
        }
    }//GEN-LAST:event_restaurarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");//FORMATO FECHA
        
        String ruta = txtRuta1.getText();
        String fecha = format.format(LocalDateTime.now());
        String name = "\\Backup-"+fecha+"-ControlEscolar.sql";

        try {
            String dbName = "control_escolar";
            String dbUser = "root";
            String dbPass = "123456";

            /* La linea de comando completa que ejecutara el programa*/
            String command = "bin/mysqldump --opt -u " + dbUser
                    + " -p" + dbPass + " " + dbName + " -r " + ruta+name;

            /*Se crea un proceso que ejecuta el comando dado*/
            Process bck = Runtime.getRuntime().exec(command);

            /* Obtiene el flujo de datos del proceso, esto se hace para obtener 
            el texto del proceso*/
            InputStream stdout = bck.getErrorStream();

            /* Se obtiene el resultado de finalizacion del proceso*/
            int resultado = bck.waitFor();

            String line;

            /* Se crea un buffer de lectura este sirvira para vizualizar los errores 
            ya que el inputStream no los vizualiza*/
            BufferedReader brCleanUp
                    = new BufferedReader(new InputStreamReader(stdout));
            while ((line = brCleanUp.readLine()) != null) {
                System.out.println(line);
            }
            brCleanUp.close();

            if (resultado == 0) {
                JOptionPane.showMessageDialog(null, "Respaldo exitosa");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "ERROR Respaldo");
            }
        } catch (IOException | InterruptedException ex) {
            
            JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void txtRuta2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta2KeyReleased

    }//GEN-LAST:event_txtRuta2KeyReleased

    private void txtRuta1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuta1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser ch = new JFileChooser();
        ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int se = ch.showSaveDialog(null);
        if (se == JFileChooser.APPROVE_OPTION) {
            String ruta = ch.getSelectedFile().getPath();
            txtRuta1.setText(ruta);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRuta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser ch = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("SQL", "sql");
        ch.setFileFilter(fil);
        int se = ch.showSaveDialog(null);
        if (se == JFileChooser.APPROVE_OPTION) {
            String ruta = ch.getSelectedFile().getPath();
            txtRuta2.setText(ruta);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuta1ActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Imagenes-Reportes\\Manual-Usuario.pdf#page=59");
                     
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
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton restaurar;
    private javax.swing.JTextField txtRuta1;
    private javax.swing.JTextField txtRuta2;
    // End of variables declaration//GEN-END:variables
}
