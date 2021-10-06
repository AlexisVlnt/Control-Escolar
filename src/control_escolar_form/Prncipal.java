package control_escolar_form;

import Clases.Consultas;
import Clases.CambiaPanel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alexx
 */
public class Prncipal extends javax.swing.JFrame {

    Consultas BD = new Consultas();
    Login login = new Login();

    public Prncipal() {

        this.setExtendedState(MAXIMIZED_BOTH);

        initComponents();
        //Fecha Y HORA
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");//formato Hora
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");//FORMATO FECHA

        Runnable runnable = new Runnable() {
            @Override

            public void run() {

                while (true) {
                    try {
                        Thread.sleep(500);
                        lbh.setText(formateador.format(LocalDateTime.now()));

                        lbh1.setText(format.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
        new CambiaPanel(panelCentralx, new Paneles.pnlHome());
        Cerrar();
        jLabel16.setVisible(true);
        jLabel3.setVisible(true);
        lbUser.setText(Login.Usuario);
        lbPersonal.setVisible(false);
        lbPersonal1.setVisible(false);
        mostrarPersonal();
    }

    public void mostrarPersonal() {
        if (Login.tipo_usuario.equals("administrador")) {
            lbPersonal.setVisible(true);
            lbPersonal1.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbPersonal1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbPersonal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbh1 = new javax.swing.JLabel();
        lbh = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Control Escolar");

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lgg (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -10, -1, 110));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel10.setText("Instituto Hispanoamericano – Mexicano ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 640, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAA.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jpMenu.setBackground(new java.awt.Color(0, 170, 228));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reportes");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, -1));

        lbPersonal1.setBackground(new java.awt.Color(255, 255, 255));
        lbPersonal1.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        lbPersonal1.setForeground(new java.awt.Color(255, 255, 255));
        lbPersonal1.setText("Personal");
        lbPersonal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPersonal1MouseClicked(evt);
            }
        });
        jpMenu.add(lbPersonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 80, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grupos");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, -1));

        lbPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_user_account_64px.png"))); // NOI18N
        lbPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPersonalMouseClicked(evt);
            }
        });
        jpMenu.add(lbPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 70, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_class_64px_1.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_paste_64px.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_drag_list_down_96px.png"))); // NOI18N
        jpMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Respaldar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 90, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_data_protection_64px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 70, 70));

        jScrollPane1.setBorder(null);

        panelCentralx.setBackground(new java.awt.Color(240, 248, 253));
        panelCentralx.setLayout(new javax.swing.BoxLayout(panelCentralx, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(panelCentralx);

        jPanel1.setBackground(new java.awt.Color(91, 181, 232));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buen Día");

        lbUser.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("nombre Usuario");

        lbh1.setBackground(new java.awt.Color(51, 51, 255));
        lbh1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbh1.setForeground(new java.awt.Color(240, 248, 253));
        lbh1.setText("Fecha");

        lbh.setBackground(new java.awt.Color(51, 51, 255));
        lbh.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbh.setForeground(new java.awt.Color(240, 248, 253));
        lbh.setText("hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbh1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lbh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbh1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    ConfirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ConfirmarSalida() {
        int salir = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (salir == JOptionPane.YES_OPTION) {

            LocalTime hora = LocalTime.now();
            String Hora_Salida = hora.toString();
            Hora_Salida = Hora_Salida.substring(0, 8);
            BD.Salida(Hora_Salida);
            JOptionPane.showMessageDialog(null, "Saliendo del Sistema", "Salida", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
    }
    private void lbPersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPersonal1MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlPersonal());

    }//GEN-LAST:event_lbPersonal1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlRep());

    }//GEN-LAST:event_jLabel3MouseClicked

    private void lbPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPersonalMouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlPersonal());

    }//GEN-LAST:event_lbPersonalMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlRep());
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlGrup());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlGrup());
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
          new CambiaPanel(panelCentralx, new Paneles.pnlRes());
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new CambiaPanel(panelCentralx, new Paneles.pnlRes());
    }//GEN-LAST:event_jLabel15MouseClicked

//    public static void main(String args[]) {
//   
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Prncipal().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lbPersonal;
    private javax.swing.JLabel lbPersonal1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbh;
    private javax.swing.JLabel lbh1;
    public static final javax.swing.JPanel panelCentralx = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables
}
