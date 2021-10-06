package Paneles;

import Clases.CambiaPanel;
import Clases.Consultas;
import Clases.conexion;
import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class pnlGrup extends javax.swing.JPanel {
    
    static String [] todo = new String[2];
    static String curp = "",nombre,appat,apmat, no_lista, curp_boleta;
    int contador = 2;
    boolean A = true,B = true,C = true,D = true,E = true,F = true,G = true,H = true,I = true,J = true,K = true,L = true;
    
    public pnlGrup() {
        initComponents();    
        PanelBus.setVisible(false);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        grupo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        grado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCap = new javax.swing.JTextField();
        calificaciones = new javax.swing.JButton();
        listas = new javax.swing.JButton();
        baja = new javax.swing.JButton();
        registrar_alumno = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlm = new rojerusan.RSTableMetro();
        PanelBus = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Bus_alum = new javax.swing.JTextField();
        baja1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 248, 253));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Grupos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        grupo.setBackground(new java.awt.Color(204, 204, 255));
        grupo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "A", "B" }));
        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setText("Grupo");

        grado.setBackground(new java.awt.Color(204, 204, 255));
        grado.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "1", "2", "3", "4", "5", "6" }));
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("Grado");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione Alumno:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setText("Estado del Grupo: ");

        txtCap.setEditable(false);
        txtCap.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        txtCap.setText("0/30");
        txtCap.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCap.setEnabled(false);

        calificaciones.setBackground(new java.awt.Color(130, 206, 130));
        calificaciones.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        calificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_exam_30px.png"))); // NOI18N
        calificaciones.setText("Consultar Calificaciones");
        calificaciones.setBorderPainted(false);
        calificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calificaciones.setFocusPainted(false);
        calificaciones.setFocusable(false);
        calificaciones.setRequestFocusEnabled(false);
        calificaciones.setRolloverEnabled(false);
        calificaciones.setVerifyInputWhenFocusTarget(false);
        calificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calificacionesActionPerformed(evt);
            }
        });

        listas.setBackground(new java.awt.Color(130, 206, 130));
        listas.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        listas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_search_property_30px.png"))); // NOI18N
        listas.setText("Generar Lista del Grupo");
        listas.setBorderPainted(false);
        listas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listas.setFocusPainted(false);
        listas.setFocusable(false);
        listas.setRequestFocusEnabled(false);
        listas.setRolloverEnabled(false);
        listas.setVerifyInputWhenFocusTarget(false);
        listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listasActionPerformed(evt);
            }
        });

        baja.setBackground(new java.awt.Color(255, 102, 102));
        baja.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_remove_user_male_30px.png"))); // NOI18N
        baja.setText("Dar de Baja");
        baja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        registrar_alumno.setBackground(new java.awt.Color(130, 206, 130));
        registrar_alumno.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        registrar_alumno.setForeground(new java.awt.Color(51, 51, 51));
        registrar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_add_user_male_30px.png"))); // NOI18N
        registrar_alumno.setBorderPainted(false);
        registrar_alumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrar_alumno.setFocusPainted(false);
        registrar_alumno.setFocusable(false);
        registrar_alumno.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        registrar_alumno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registrar_alumno.setLabel("Añadir Alumno");
        registrar_alumno.setRequestFocusEnabled(false);
        registrar_alumno.setRolloverEnabled(false);
        registrar_alumno.setVerifyInputWhenFocusTarget(false);
        registrar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_alumnoActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(130, 206, 130));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButton5.setText("Ver Datos del Alumno");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.setRolloverEnabled(false);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 204, 102));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_search_30px.png"))); // NOI18N
        buscar.setBorderPainted(false);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.setFocusPainted(false);
        buscar.setFocusable(false);
        buscar.setRequestFocusEnabled(false);
        buscar.setRolloverEnabled(false);
        buscar.setVerifyInputWhenFocusTarget(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        tablaAlm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No Lista", "Curp", "Apellido Paterno", "Apellido Materno", "Nombre"
            }
        ));
        tablaAlm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAlm);

        PanelBus.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setText("Ingrese Nombre completo:");

        Bus_alum.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Bus_alum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        Bus_alum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bus_alumKeyReleased(evt);
            }
        });

        baja1.setBackground(new java.awt.Color(255, 102, 102));
        baja1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        baja1.setText("Cancelar");
        baja1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baja1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBusLayout = new javax.swing.GroupLayout(PanelBus);
        PanelBus.setLayout(PanelBusLayout);
        PanelBusLayout.setHorizontalGroup(
            PanelBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(Bus_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(baja1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        PanelBusLayout.setVerticalGroup(
            PanelBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bus_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baja1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jButton2.setText("Buscar Por Nombre");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(62, 38));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(registrar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(calificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(listas)
                                .addGap(72, 72, 72)
                                .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(PanelBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_class_64px_1.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //MANDA A LLAMAR EL FORMULARIO DE CALIFICACIONES
    private void calificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calificacionesActionPerformed
       if(grupo.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..") || curp.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione Grado y Grupo. \n Sino es el caso seleccione un alumno en la tabla mostrada", "INFO", JOptionPane.INFORMATION_MESSAGE);
       }else{
            Consultas consul = new Consultas();            
            consul.Alumno_Calficaciones(curp);
            new CambiaPanel(panelCentralx, new Paneles.pnlCalif());
            curp = "";            
       }   
    }//GEN-LAST:event_calificacionesActionPerformed

    private void listasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listasActionPerformed
        if(grupo.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..")){
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione Grado y Grupo.", "INFO", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Consultas consul = new Consultas();
            consul.materias(Integer.parseInt(grado.getSelectedItem().toString()));
            listas_pdf();
        }
    }//GEN-LAST:event_listasActionPerformed
    
    //BAJA DEL ALUMNO - MANDA A LLAMAR LA CONSULTA DELETE
    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        //Opcion de Eliminar Alumno
        Consultas consul = new Consultas();
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar al alumno:"+nombre+appat+apmat+"?", "Advertencia",
                JOptionPane.YES_OPTION,JOptionPane.WARNING_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            consul.bajaAlumno(curp);
            curp = "";
        }
        else{
            JOptionPane.showMessageDialog(null, "Operacion Cancelada");
            curp.equals(""); nombre.equals(""); appat.equals(""); apmat.equals("");
            
        }
    }//GEN-LAST:event_bajaActionPerformed

    //LLAMA EL FORMULARIO DE AGREGAR ALUMNO
    private void registrar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_alumnoActionPerformed
        if (grupo.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..")) {
             JOptionPane.showMessageDialog(null, "Por favor Seleccione Grado y Grupo", "INFO", JOptionPane.INFORMATION_MESSAGE);
           
        }else{
            new CambiaPanel(panelCentralx, new Paneles.pnlAddAlum());
        }
        
    }//GEN-LAST:event_registrar_alumnoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          if(grupo.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..") || curp.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione Grado y Grupo. \n Sino es el caso seleccione un alumno en la tabla mostrada", "INFO", JOptionPane.INFORMATION_MESSAGE);
        }else{
             Consultas consul = new Consultas();            
             consul.buscarDatosAlumno(curp); 
             new CambiaPanel(panelCentralx, new Paneles.pnlEditAlum());
             curp = ""; 
        }            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        //Al selecionar una opcion se guarda en la posicion 0 del arreglo todo 
        todo[0] = grado.getSelectedItem().toString();
    }//GEN-LAST:event_gradoActionPerformed

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
        //Al selecionar una opcion se guarda en la posicion 1 del arreglo todo
        todo[1] = grupo.getSelectedItem().toString();
    }//GEN-LAST:event_grupoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       Consultas consul = new Consultas();
        if (grado.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..")) {
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione Grado y Grupo", "INFO", JOptionPane.INFORMATION_MESSAGE);
        }else{ 
            consul.tabla_alumnos(Integer.parseInt(grado.getSelectedItem().toString()), grupo.getSelectedItem().toString());
            this.tablaAlm.setModel(consul.alum);
            txtCap.setText(Consultas.NO_lista+"/30");            
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void tablaAlmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmMouseClicked
        //Opcion para copiar datos    
        //obtiene el numero de fila, que se ha seleccionado
        int Fila = tablaAlm.getSelectedRow();        
        //obtiene el valor de la columna 0, de la fila seleccionada
        no_lista = tablaAlm.getValueAt(Fila, 0).toString();
        curp = tablaAlm.getValueAt(Fila, 1).toString();
        curp_boleta = tablaAlm.getValueAt(Fila, 1).toString();
        nombre = tablaAlm.getValueAt(Fila, 2).toString();
        appat = tablaAlm.getValueAt(Fila, 3).toString();
        apmat = tablaAlm.getValueAt(Fila, 4).toString();        
    }//GEN-LAST:event_tablaAlmMouseClicked

    private void Bus_alumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bus_alumKeyReleased
         Consultas consul = new Consultas();
          if (grupo.getSelectedItem().toString().equalsIgnoreCase("..") || grupo.getSelectedItem().toString().equalsIgnoreCase("..")) {
             JOptionPane.showMessageDialog(null, "Por favor Seleccione Grado y Grupo", "INFO", JOptionPane.INFORMATION_MESSAGE);
           
        }else{       
            consul.BuscarAlumnoNombre(Integer.parseInt(grado.getSelectedItem().toString()), grupo.getSelectedItem().toString(),Bus_alum.getText());
            this.tablaAlm.setModel(consul.alum);
          }
    }//GEN-LAST:event_Bus_alumKeyReleased

    private void baja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baja1ActionPerformed
        PanelBus.setVisible(false);
    }//GEN-LAST:event_baja1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PanelBus.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Manual Tecnico.pdf#page=47");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed

    public void listas_pdf(){
        try{
            //Método de conexion
            conexion conexion = new conexion();  
            Consultas consul = new Consultas();  //Objeto para llamar las diferentes consultas
            String valor_mes = "", tipo_consulta = "";           
            
            switch(grado.getSelectedItem().toString()+grupo.getSelectedItem().toString()){
                case "1A":if (A) {
                            valor_mes = "Septiembre";
                            A = false;
                            tipo_consulta = "insert";
                           }else{
                                System.out.println(A + valor_mes + "dnjdksbfjks");
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "1B":if (B) {
                            valor_mes = "Septiembre";
                            B = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "2A":if (C) {
                            valor_mes = "Septiembre";
                            C = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "2B":if (D) {
                            valor_mes = "Septiembre";
                            D = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "3A":if (E) {
                            valor_mes = "Septiembre";
                            E = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "3B":if (F) {
                            valor_mes = "Septiembre";
                            F = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "4A":if (G) {
                            valor_mes = "Septiembre";
                            G = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;    
                
                case "4B":if (H) {
                            valor_mes = "Septiembre";
                            H = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "5A":if (I) {
                            valor_mes = "Septiembre";
                            I = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "5B":if (J) {
                            valor_mes = "Septiembre";
                            J = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "6A":if (K) {
                            valor_mes = "Septiembre";
                            K = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
                    
                case "6B":if (L) {
                            valor_mes = "Septiembre";
                            L = false;
                            tipo_consulta = "insert";
                           }else{
                                valor_mes = lista_mes();
                                tipo_consulta = "update";
                            }
                    break;
            }
            //Se guardan en un arreglo el nombre de los text field para las materias que apareceran en los reportes  
            String [] materias = {"mat1", "mat2", "mat3", "mat4", "mat5", "mat6", "mat7", "mat8", "mat9", "mat10", "mat11"};
            //Inicializamos el archivo en null
            JasperReport reporte = null;
            //Colocamos la ruta en donde se almacena la plantilla del archivo
            String path = "src\\PaqueteReportesPrueba\\listas_grupo.jasper";
            //Leemos el archivo
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Creamos un parámetro, para poder ingresar datos al archivo
            Map parametro = new HashMap<String, Object>();
            //Introducción de los datos al archivo; recibe dos parámetros (nombre del parámetro creado en Jaspert contenido)
            ///Datos del alumno
            parametro.put("grad", Integer.parseInt(grado.getSelectedItem().toString()));
            parametro.put("grup", grupo.getSelectedItem().toString());
            parametro.put("mes", valor_mes);
            
            for (int i = 0; i < materias.length; i++) { //6
                if (i >= Consultas.claves.size()) {
                    parametro.put(materias[i], "");
                    System.out.println(2);
                }else{
                    parametro.put(materias[i], Consultas.claves.get(i));
                    System.out.println(1);
                }           
            }

            // Se plasman los datos en el archivo base, se mandan 3 parámetros (lectura del archivo, los parámetros,
            // la conexion de la base de datos)
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conexion.getConnection());

            //Creación de Método para visualizar la boleta     
            JasperViewer view = new JasperViewer(jprint, false);

            //al presionar sobre la X, se cierra
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            // se muestra en visualizador con la boleta
            view.setVisible(true);
            // función para exportar jaspert a pdf              //se establece una ruta y un nombre al PDF                  
            String direccion = "C:\\Users\\AngelAlexis\\Documents\\boleta\\Lista_"+grado.getSelectedItem().toString()+grupo.getSelectedItem().toString()+"_"+valor_mes+".pdf";
           
            JasperExportManager.exportReportToPdfFile(jprint, direccion);      
            
            if (tipo_consulta.equalsIgnoreCase("insert")) {
                System.out.println("dmabsvkjsbdkjvs");
                consul.guardar_listas(grado.getSelectedItem().toString()+grupo.getSelectedItem().toString(), valor_mes, direccion, tipo_consulta);
            }else{            
                consul.guardar_listas(grado.getSelectedItem().toString()+grupo.getSelectedItem().toString(), valor_mes, direccion, tipo_consulta);                
            }
            conexion.desconectar();
        }catch(HeadlessException | JRException e) {
            JOptionPane.showMessageDialog(null, "Error en la generacion de la Boleta" + e);            
        }   
    }
    
    public String lista_mes(){
        Consultas consul = new Consultas();
        String mes_para_lista = "";            
        consul.verificar_mes(grado.getSelectedItem().toString()+grupo.getSelectedItem().toString(), "", "listas");                                  
        for (int i = 0; i < Consultas.gen.length; i++) {           
            if (Consultas.array.get(0).equalsIgnoreCase("Junio")) {
                    JOptionPane.showMessageDialog(null, "Se generaron todas las listas disponibles para los meses de evaluacion.", "INFO", JOptionPane.WARNING_MESSAGE);              
                    break;
            }else if(Consultas.gen[i].equalsIgnoreCase(Consultas.array.get(0))){
                int num = i + 1;
                mes_para_lista = Consultas.gen[num];
                break;            
            }
        }        
        return mes_para_lista;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bus_alum;
    private javax.swing.JPanel PanelBus;
    private javax.swing.JButton ayuda;
    private javax.swing.JButton baja;
    private javax.swing.JButton baja1;
    private javax.swing.JButton buscar;
    private javax.swing.JButton calificaciones;
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JComboBox<String> grupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listas;
    private javax.swing.JButton registrar_alumno;
    public rojerusan.RSTableMetro tablaAlm;
    private javax.swing.JTextField txtCap;
    // End of variables declaration//GEN-END:variables
}
