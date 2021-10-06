package Paneles;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import Clases.Consultas;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class frmObserv extends javax.swing.JFrame {

    Consultas consul = new Consultas();



    public frmObserv() {
        initComponents();
        Cerrar();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtTri.setText(pnlCalif.mes.getSelectedItem().toString());
        consul.VerificarObserv(pnlCalif.curp_txt.getText()); //VERFICAMOS SI YA HAY OBSERVACION REGISTRADAS
        verificarMes(pnlCalif.mes.getSelectedItem().toString(),pnlCalif.curp_txt.getText());                //VERFICAMOS EL MES QUE DESEA CONSULTAR O REGISTRAR
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTri = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Observaciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 20))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Trimestre:");

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArea.setRows(5);
        txtArea.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtArea);

        txtTri.setEditable(false);
        txtTri.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTri.setToolTipText("");
        txtTri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        txtTri.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Observaciones");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_view_file_64px.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        ayuda.setBackground(new java.awt.Color(255, 255, 255));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayuda.setToolTipText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7)
                    .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Manual Tecnico.pdf#page=100");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String obser = txtArea.getText();
    String curp = pnlCalif.curp_txt.getText();
    String mes = pnlCalif.mes.getSelectedItem().toString();
        
    
        if (obser.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "No puede dejar La observacion Vacia", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
             String repetido = consul.textObserv(curp, mes);
             if (repetido.isEmpty()) {
                consul.nuevaObserv(curp, mes, obser); 
            }
            System.out.println("repetido    "+ curp); 
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void Cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {

                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verificarMes(String mes, String curp) {
        
        System.out.println("OBSERVACIONES "+Consultas.tieneObser);
        /*la variable tieneObserv sirve para llevar un control de cuantas observaciones tiene registrada 
        Dependiendo el caso se registrara una observacion o solo se consultara*/
        switch (Consultas.tieneObser) {
            case 0:
                if (mes.equals("Nov/Dic")) {
                    
                      txtArea.setText("");
                    txtArea.setEnabled(true);
                    btnGuardar.setEnabled(true);
                    
                } else {
                            JOptionPane.showMessageDialog(null, "Tiene Que Registrar El primer Timestre Correspondiente: NOV/DIC",
                                    "Atención", JOptionPane.WARNING_MESSAGE);
                    btnGuardar.setEnabled(true);
                    
                  
                    txtArea.setEnabled(false);
                    txtArea.setText("");
                }

                break;
            case 1:
                if (mes.equals("Nov/Dic")) {
                    String text = consul.textObserv(curp, mes);
                    txtArea.setText(text);
                    btnGuardar.setEnabled(false);
                    txtArea.setEnabled(false);
                } else if (mes.equals("Marzo")) {
                    txtArea.setText("");
                    txtArea.setEnabled(true);
                    btnGuardar.setEnabled(true);
                    
                }else if (mes.equals("Junio")) {
                    JOptionPane.showMessageDialog(null, "Es necesario registrar calificación en el  trmestre Correspondiente: Junio",
                            "Atención", JOptionPane.WARNING_MESSAGE);
                    btnGuardar.setEnabled(false);
                    txtArea.setEnabled(false);
                    txtArea.setText("");
                    
                }

                break;
            case 2:
                if (mes.equals("Nov/Dic") || mes.equals("Marzo")) {
                    String text = consul.textObserv(curp, mes);
                    txtArea.setText(text);
                    btnGuardar.setEnabled(false);
                    txtArea.setEnabled(false);
                    
                    

                } else if (mes.equals("Junio")) {
                    btnGuardar.setEnabled(true);
                     txtArea.setText("");
                    txtArea.setEnabled(true);
                    
                }
                break;
            case 3:
                String text = consul.textObserv(curp, mes);
                txtArea.setText(text);
                txtArea.setEnabled(false);
                btnGuardar.setEnabled(false);

                break;
                default:
                    JOptionPane.showMessageDialog(null, "Cargando Informacion..Regrese e intente de nuevo");
                    
        }

    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    public static final javax.swing.JButton btnGuardar = new javax.swing.JButton();
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTextArea txtArea = new javax.swing.JTextArea();
    private javax.swing.JTextField txtTri;
    // End of variables declaration//GEN-END:variables
}
