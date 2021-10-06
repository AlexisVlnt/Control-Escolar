
package control_escolar_form;

import Clases.Consultas;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    Consultas BD = new Consultas();
    public static String Usuario, tipo_usuario;
    int intento;
   
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
    LocalTime formatohora = LocalTime.now();
  
    public Login() {
        initComponents();
        setLocationRelativeTo(null); 
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));       
        jUsuario.setFocusable(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 23)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login/lggg (2).png"))); // NOI18N
        jLabel12.setFocusable(false);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 430));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setText("HISPANOAMERICANO ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 230, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel14.setText("MEXICANO ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 120, 30));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel13.setText("INSTITUTO");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setVerifyInputWhenFocusTarget(false);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 110, -1));

        jUsuario.setBackground(new java.awt.Color(7, 104, 159));
        jUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jUsuario.setBorder(null);
        jUsuario.setCaretColor(new java.awt.Color(73, 181, 172));
        jUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login/icons8_user_24px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 40));

        jButtonAcceder.setBackground(new java.awt.Color(102, 102, 255));
        jButtonAcceder.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login/icons8_login_rounded_right_48px.png"))); // NOI18N
        jButtonAcceder.setText("Iniciar");
        jButtonAcceder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAcceder.setFocusPainted(false);
        jButtonAcceder.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 110, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login/icons8_password_26px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 260, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 160, 10));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Recuperar Contraseña");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, 26));

        jPassword.setBackground(new java.awt.Color(7, 104, 159));
        jPassword.setFont(jUsuario.getFont());
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.setBorder(null);
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 80, 40));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 120, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel6.setText("De ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 50, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel8.setText(" Control Escolar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel7.setText("Sistema  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 50, 130, 40));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 260, 10));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar Sesión");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 23)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login/fondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 620, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
    
        //Si las cajas de textos estan vacíos
        if(jUsuario.getText().equals("") || jPassword.getText().equals("")) {
            //manda un mensaje 
            JOptionPane.showMessageDialog(null, "El campo de Usuario y/o Contraseña esta vacio!!!", "Acceso Denegado", 0);
            intento++;//se suma 1, el número de intentos fallidos de acceder
            jUsuario.setFocusable(true); 
        //Si las cajas de textos no están vacíos    
        }else if(jUsuario.getText().length() > 0 && jPassword.getText().length() > 0){
            
            try{
                boolean encontrado;//variable auxiliar, para obtener true o false
                //si el valor que nos devolvió el método es verdadero (true), entonces...
                if(encontrado = BD.BuscarUsuario(jUsuario.getText(), jPassword.getText()) == true){
                    //Obtenemos la hora del sistema
                    String tiempo = formatohora.toString();
                    String hora = tiempo.substring(0, 8);
                    //obtenemos la fecha del sistema
                    LocalDate fecha = LocalDate.now();
                    String fecha_acceso = fecha.toString();
                    
                    //mandamos la hora y fecha del sistema al método, para que se almacene en la base
                    BD.Bitacora(jUsuario.getText(),hora, fecha_acceso);
                    Usuario = jUsuario.getText();
                    Prncipal ventana = new Prncipal();
                    ventana.setVisible(true); 
                    this.dispose();
                                       
                }else{//Sino se encontró registro del usuario
                    intento++;//se suma 1, el número de intentos fallidos de acceder
                    jUsuario.setText(""); jPassword.setText(""); jUsuario.setFocusable(true);
                }
                                              
            }catch(Exception e){
                System.err.println(e);
            }               
        }  
            //Si son más de 3 intentos fallidos, y el usuario no accede
            if(intento == 3){
                //manda un mensaje
                JOptionPane.showMessageDialog(null,"Demasiados Intentos, Espere 30 segundos" , "Aviso", 0);
                //Se inhabilitan las cajas de texto
                jUsuario.setEnabled(false); jPassword.setEnabled(false); jButtonAcceder.setEnabled(false);
                jUsuario.setText(""); jPassword.setText("");
                
                intento = 0;// se vuelve cero el número de intentos
                //Esta clase nos va permitir mantener inhabilitados las cajas de texto por 30 segundos
                Timer timer = new Timer();// se declara un objeto de la clase Timer
                //Esta clase nos va a permitir establecer que tarea deseamos retardar
                TimerTask inhabilitado = new TimerTask(){// se declara un objeto de la clase TimerTask
                @Override
                //En este método colocamos las tareas o acciones que vamos a retardar
                    public void run() {
                        //Inhabilitadas las cajas texto y el boton de Acceder
                        jUsuario.setEnabled(true); jPassword.setEnabled(true); jButtonAcceder.setEnabled(true);
                        jUsuario.setFocusable(true);
                    }   
                };  //la función schedule solo maneja milisegundos                  
                    timer.schedule(inhabilitado, 30000);//Se mantiene inhabilitado por 30 segundos                   
            }              //esketduol 
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
           
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyTyped
         char letra = evt.getKeyChar();
        //Función para que la caja de texto solo acepte letras
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z')){
            evt.consume();
            
        }
        
        if(jUsuario.getText().length() >= 15){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jUsuarioKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        char numero = evt.getKeyChar();
        //Función para que la caja de texto solo acepte números
        if(numero < '0' || numero > '9'){
            evt.consume();
            
        }
        if(jPassword.getText().length() >= 4 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jPasswordKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        frmRecuperar ven =new frmRecuperar();
        ven.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {   
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton jButton2 = new javax.swing.JButton();
    public static final javax.swing.JButton jButtonAcceder = new javax.swing.JButton();
    public static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    public static final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    public static final javax.swing.JPasswordField jPassword = new javax.swing.JPasswordField();
    public static final javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
    public static final javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
    public static final javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
    public static final javax.swing.JTextField jUsuario = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
