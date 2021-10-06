package Paneles;

import Clases.CambiaPanel;
import Clases.Consultas;
import Clases.conexion;
import Clases.procesoMail;
import Clases.validacionMail;
import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class pnlCalif extends javax.swing.JPanel {

    pnlGrup grupito = new pnlGrup();
    Consultas consul = new Consultas();

    public static String curpO;
    public static String mesO;
    public static ArrayList<String> meses;
    //String mes_boleta = String.valueOf(mes.getSelectedItem().toString());
    String mes_boleta = "";

    ArrayList<Double> arrayPromediosXmateria = new ArrayList<Double>();
    ArrayList<Double> promedioMensual = new ArrayList<Double>();
    ArrayList<Double> promedioTrimestral = new ArrayList<Double>();
    int PrimerPeriodoInasistencia, SegundoPeriodoInasistencia, TercerPeriodoInasistencia,
            PromedioFinalInasistencia, Total_Asistencias, PorcentajeAsistencias;
    
    int[]arreglo = new int[10];

    double promedioSEP = 0, promedioComple = 0;
    boolean mostrarBoleta, modificacion;

    public static String getCurpO() {
        return curpO;
    }

    public static String getMesO() {
        return mesO;
    }

    public pnlCalif() {
        initComponents();

        if (Consultas.bandera) {
            //Se obtiene el valor de la variable curp desde la clase pnlGroup, el cual el valor fue asignado al seleccionar un alumno en la tabla
            curp_txt.setText(grupito.curp);
            nom_alumno.setText(grupito.nombre);
            appat_alumno.setText(grupito.appat);
            apmat_alumno.setText(grupito.apmat);
            grado.setText(grupito.todo[0]);
            grupo.setText(grupito.todo[1]);
        }
        etiquetas();     //Metodo que rellena las etiquetas con las materias
        
        agregarmes();
        mat12.setEnabled(false);
        modificar.setEnabled(true);
        modificacion = false;
        EnviarBoleta.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nom_alumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        appat_alumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        apmat_alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        grupo = new javax.swing.JTextField();
        curp = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        m4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        mat1 = new javax.swing.JTextField();
        mat2 = new javax.swing.JTextField();
        mat3 = new javax.swing.JTextField();
        mat4 = new javax.swing.JTextField();
        m9 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        m8 = new javax.swing.JLabel();
        mat5 = new javax.swing.JTextField();
        mat6 = new javax.swing.JTextField();
        mat7 = new javax.swing.JTextField();
        mat8 = new javax.swing.JTextField();
        m5 = new javax.swing.JLabel();
        mat9 = new javax.swing.JTextField();
        m10 = new javax.swing.JLabel();
        mat10 = new javax.swing.JTextField();
        m11 = new javax.swing.JLabel();
        mat11 = new javax.swing.JTextField();
        nuevaCalif = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        m12 = new javax.swing.JLabel();
        mat12 = new javax.swing.JTextField();
        visualizarBoleta = new javax.swing.JButton();
        EnviarBoleta = new javax.swing.JButton();
        btnObserv = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 248, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Calificaciones");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 11, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_exam_64px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 0, -1, -1));
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 636, -1, 100));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Del Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setName("asda"); // NOI18N
        jPanel1.setOpaque(false);

        nom_alumno.setEditable(false);
        nom_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nom_alumno.setToolTipText("");
        nom_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        nom_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre(s):");

        appat_alumno.setEditable(false);
        appat_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        appat_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        appat_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido Paterno:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Apellido Materno:");

        apmat_alumno.setEditable(false);
        apmat_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        apmat_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        apmat_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Grupo:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Grado:");

        grado.setEditable(false);
        grado.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        grado.setText("--");

        grupo.setEditable(false);
        grupo.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        grupo.setText("--");

        curp.setBackground(new java.awt.Color(0, 0, 0));
        curp.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        curp.setForeground(new java.awt.Color(51, 51, 51));
        curp.setText("CURP:");

        curp_txt.setEditable(false);
        curp_txt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        curp_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        curp_txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(curp)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nom_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(appat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apmat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(curp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curp)
                    .addComponent(curp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nom_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(appat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(apmat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, -1));

        regresar.setBackground(new java.awt.Color(154, 206, 244));
        regresar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_undo_40px.png"))); // NOI18N
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, -1, 40));

        guardar.setBackground(new java.awt.Color(154, 206, 244));
        guardar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_save_40px.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, 160, 50));

        m4.setBackground(new java.awt.Color(0, 0, 0));
        m4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m4.setForeground(new java.awt.Color(51, 51, 51));
        m4.setText("Materias");
        add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 324, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Materias");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 286, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Seleccione Mes a Consultar:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 288, -1, 30));

        m1.setBackground(new java.awt.Color(0, 0, 0));
        m1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(51, 51, 51));
        m1.setText("Materias");
        add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 324, -1));

        m2.setBackground(new java.awt.Color(0, 0, 0));
        m2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(51, 51, 51));
        m2.setText("Materias");
        add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 284, -1));

        m3.setBackground(new java.awt.Color(0, 0, 0));
        m3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m3.setForeground(new java.awt.Color(51, 51, 51));
        m3.setText("Materias");
        add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 482, 324, -1));

        mat1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat1.setToolTipText("");
        mat1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat1KeyTyped(evt);
            }
        });
        add(mat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 383, 70, -1));

        mat2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat2.setToolTipText("");
        mat2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat2KeyTyped(evt);
            }
        });
        add(mat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 433, 70, -1));

        mat3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat3.setToolTipText("");
        mat3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat3KeyTyped(evt);
            }
        });
        add(mat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 478, 70, -1));

        mat4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat4.setToolTipText("");
        mat4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat4KeyTyped(evt);
            }
        });
        add(mat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 70, -1));

        m9.setBackground(new java.awt.Color(0, 0, 0));
        m9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m9.setForeground(new java.awt.Color(51, 51, 51));
        m9.setText("Materias");
        m9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 270, -1));

        m6.setBackground(new java.awt.Color(0, 0, 0));
        m6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m6.setForeground(new java.awt.Color(51, 51, 51));
        m6.setText("Materias");
        m6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 382, 260, -1));

        m7.setBackground(new java.awt.Color(0, 0, 0));
        m7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m7.setForeground(new java.awt.Color(51, 51, 51));
        m7.setText("Materias");
        m7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 432, 260, -1));

        m8.setBackground(new java.awt.Color(0, 0, 0));
        m8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m8.setForeground(new java.awt.Color(51, 51, 51));
        m8.setText("Materias");
        m8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 482, 260, -1));

        mat5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat5.setToolTipText("");
        mat5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat5KeyTyped(evt);
            }
        });
        add(mat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 605, 70, -1));

        mat6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat6.setToolTipText("");
        mat6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat6KeyTyped(evt);
            }
        });
        add(mat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 70, -1));

        mat7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat7.setToolTipText("");
        mat7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat7KeyTyped(evt);
            }
        });
        add(mat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 70, -1));

        mat8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat8.setToolTipText("");
        mat8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat8KeyTyped(evt);
            }
        });
        add(mat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 70, -1));

        m5.setBackground(new java.awt.Color(0, 0, 0));
        m5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m5.setForeground(new java.awt.Color(51, 51, 51));
        m5.setText("Materias");
        add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 599, 242, -1));

        mat9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat9.setToolTipText("");
        mat9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat9KeyTyped(evt);
            }
        });
        add(mat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 70, -1));

        m10.setBackground(new java.awt.Color(0, 0, 0));
        m10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m10.setForeground(new java.awt.Color(51, 51, 51));
        m10.setText("Materias");
        m10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 260, -1));

        mat10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat10.setToolTipText("");
        mat10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat10KeyTyped(evt);
            }
        });
        add(mat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 70, -1));

        m11.setBackground(new java.awt.Color(0, 0, 0));
        m11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m11.setForeground(new java.awt.Color(51, 51, 51));
        m11.setText("Materias");
        add(m11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 260, -1));

        mat11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat11.setToolTipText("");
        mat11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat11.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat11KeyTyped(evt);
            }
        });
        add(mat11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, 70, -1));

        nuevaCalif.setBackground(new java.awt.Color(154, 206, 244));
        nuevaCalif.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        nuevaCalif.setText("Nueva Calificación");
        nuevaCalif.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevaCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCalifActionPerformed(evt);
            }
        });
        add(nuevaCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 160, 50));

        Buscar.setBackground(new java.awt.Color(255, 204, 102));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_search_30px.png"))); // NOI18N
        Buscar.setBorderPainted(false);
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Buscar.setFocusPainted(false);
        Buscar.setFocusable(false);
        Buscar.setRequestFocusEnabled(false);
        Buscar.setRolloverEnabled(false);
        Buscar.setVerifyInputWhenFocusTarget(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 292, 70, 30));

        mes.setBackground(new java.awt.Color(204, 204, 255));
        mes.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 292, 116, 30));

        m12.setBackground(new java.awt.Color(0, 0, 0));
        m12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        m12.setForeground(new java.awt.Color(51, 51, 51));
        m12.setText("Inasistencias");
        m12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(m12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 203, 45));

        mat12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mat12.setToolTipText("");
        mat12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        mat12.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mat12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat12KeyTyped(evt);
            }
        });
        add(mat12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 70, -1));

        visualizarBoleta.setBackground(new java.awt.Color(154, 206, 244));
        visualizarBoleta.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        visualizarBoleta.setText("Visualizar Boleta");
        visualizarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBoletaActionPerformed(evt);
            }
        });
        add(visualizarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 680, 160, 35));

        EnviarBoleta.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        EnviarBoleta.setText("Enviar Boleta");
        EnviarBoleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 206, 244)));
        EnviarBoleta.setBorderPainted(false);
        EnviarBoleta.setEnabled(false);
        EnviarBoleta.setFocusable(false);
        EnviarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBoletaActionPerformed(evt);
            }
        });
        add(EnviarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 740, 160, 30));

        btnObserv.setBackground(new java.awt.Color(255, 204, 102));
        btnObserv.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnObserv.setText("<html>Observación  Del Alumno Trimestral</html>");
        btnObserv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnObserv.setEnabled(false);
        btnObserv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnObserv.setPreferredSize(new java.awt.Dimension(62, 38));
        btnObserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObservActionPerformed(evt);
            }
        });
        add(btnObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 160, 50));

        ayuda.setBackground(new java.awt.Color(255, 255, 255));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayuda.setToolTipText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 30, 30));

        modificar.setBackground(new java.awt.Color(154, 206, 244));
        modificar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8-editar-archivo-50.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modificar.setEnabled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        JTextField[] txt = {mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, mat11, mat12};
        try {
            if (modificacion == false) {
              // Llama al metodo "verificar_mes" con los valores de la curp y el mes seleccionado para verificar si esta registrado la calificaciones
              consul.verificar_mes(curp_txt.getText(), mes.getSelectedItem().toString(), "calif_mensual");
            }
            
            if (consul.bandera || modificacion) {

                if (mes.getSelectedItem().equals("......")) {
                    JOptionPane.showMessageDialog(null,
                            "Seleccione el Mes de la evaluación.", "Informacion",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // La varibale flag hace que valide si es true cuando todas las calificaciones esten correctas o false cuando no lo esten 
                    // y no llamen el metodo para las altas de las calificaciones
                    boolean flag = true;
                    for (int i = 0; i < consul.claves.size(); i++) {
                        try {
                            // 10.0
                            if ((txt[i].getText().equalsIgnoreCase("10.")) || (txt[i].getText().charAt(1) != '.' && txt[i].getText().charAt(1) != '0')
                                    || (txt[i].getText().charAt(2) != '.' && txt[i].getText().charAt(2) < '0' && txt[i].getText().charAt(2) > '9')) {
                                System.out.println(Consultas.materias.get(i));
                                JOptionPane.showMessageDialog(null,
                                        "Hay un caracter invalido. En " + Consultas.materias.get(i), "Informacion",
                                        JOptionPane.INFORMATION_MESSAGE);
                                flag = false;
                                modificacion = false;
                            }

                        } catch (IndexOutOfBoundsException e) {

                            JOptionPane.showMessageDialog(null,
                                    "Esta vacio la posicion despues del punto. En el campo " + Consultas.materias.get(i), "Informacion",
                                    JOptionPane.ERROR_MESSAGE);
                            flag = false;
                            modificacion = false;
                        }
                    }
                   
                    for (int i = 0; i < consul.claves.size() ; i++) {
                        //Obtengo el valor del arreglo de la caja de texto con la calificaion ingresada
                         
                        double num = Double.parseDouble(txt[i].getText());
                        
                        if (modificacion) {
                            consul.setModificacionCalif(num, curp_txt.getText(), mes.getSelectedItem().toString()
                                    , consul.claves.get(i));
                            
                           
                        }else{
                            
                            if (flag) { //Si es false no entra porque hay un campo no validado
                            //Para hacer el registro de calificaciones se piden los valores del mes, la clave de la materia, la calificacion y la CURP del alumno
                           
                            int id_cal = consul.llave_num("id_calif", "calif_mensual");
                            consul.alta_calif(id_cal, mes.getSelectedItem().toString(), consul.claves.get(i), num, curp_txt.getText());
                            
                            }
                        }          

                    }
                    mes_boleta = mes.getSelectedItem().toString();
                    
                    if(modificacion){
                        if (mes.getSelectedItem().equals("Septiembre") || mes.getSelectedItem().equals("Octubre")
                                || mes.getSelectedItem().equals("Nov/Dic")) {
                            updateTrimestre("Nov/Dic",1);
                        }else if (mes.getSelectedItem().equals("Enero") || mes.getSelectedItem().equals("Febrero")
                                || mes.getSelectedItem().equals("Marzo")) {
                            updateTrimestre("Marzo",2);
                        }else if (mes.getSelectedItem().equals("Abril") || mes.getSelectedItem().equals("Mayo")
                                || mes.getSelectedItem().equals("Junio")) {
                            updateTrimestre("Junio",3);
                        }
                         
                         //flag = false;
                    }
                   
                    if (flag) {
                        setInasistencias();
                        switch (mes.getSelectedItem().toString()) {
                            case "Nov/Dic":
                                trimestre("Nov/Dic", 1);
                                break;

                            case "Marzo":
                                trimestre("Marzo", 2);
                                break;

                            case "Junio":
                                trimestre("Junio", 3);

                                break;
                            default:
                                btnObserv.setEnabled(false);
                                break;
                        }
                        
                        JOptionPane.showMessageDialog(null,
                                "Se ha registrado Exitosamente", "Información",
                                JOptionPane.INFORMATION_MESSAGE);

                        //LIMPIA LA CAJA DE TEXTO
                        for (JTextField txt1 : txt) {
                            txt1.setText("");
                            txt1.setEnabled(false);
                            // EnviarBoletaCorreo();
                        }

                        if (flag) {
                            
                            agregarmes(); //Llama al metodo para actualizar mes de evaluacion
                        }
                        Visualizarboletas();
                        guardar.setEnabled(false);  modificacion = false;
                        modificar.setEnabled(true); mat12.setEnabled(false);
                    }
                }   
            }                

        } catch (HeadlessException | NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,
                    "Ingrese Los datos Correctamente" + e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_guardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        new CambiaPanel(panelCentralx, new Paneles.pnlGrup());
        consul.arrayInasistencia.clear();
        promedioTrimestral.clear();
        promedioMensual.clear();

    }//GEN-LAST:event_regresarActionPerformed

    //VALIDACIONES DEL INGRESO DE CALIFICACIONES   
    private void mat1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat1KeyTyped
        char x = evt.getKeyChar();
        if (mat1.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                //La libreria TextAutoCompleter nos ayuda autocompletar los campos con los numeros que estan en el arreglo dinamico
                TextAutoCompleter text = new TextAutoCompleter(mat1);//Declaracion de la instacia de la clase "TextAutoCompleter" agregandose al TextField
                completar(Character.getNumericValue(x), text);       //Llamada a la funcion "completar" con los valores del caracter tecleado y
            }                                                        // de la variable que hace el proceso de autocompletar
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat1KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat2KeyTyped
        char x = evt.getKeyChar();
        if (mat2.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text2 = new TextAutoCompleter(mat2);//Declaracion de la instacia de la clase "TextAutoCompleter" agregandose al TextField
                completar(Character.getNumericValue(x), text2);       //Llamada a la funcion "completar" con los valores del caracter tecleado y  
            }                                                         // de la variable que hace el proceso de autocompletar
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat2KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat3KeyTyped
        char x = evt.getKeyChar();
        if (mat3.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text3 = new TextAutoCompleter(mat3);
                completar(Character.getNumericValue(x), text3);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat3KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat4KeyTyped
        char x = evt.getKeyChar();
        if (mat4.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text4 = new TextAutoCompleter(mat4);
                completar(Character.getNumericValue(x), text4);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat4KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat5KeyTyped
        char x = evt.getKeyChar();
        if (mat5.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text5 = new TextAutoCompleter(mat5);

                completar(Character.getNumericValue(x), text5);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat5KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat6KeyTyped
        char x = evt.getKeyChar();
        if (mat6.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text6 = new TextAutoCompleter(mat6);
                completar(Character.getNumericValue(x), text6);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat6KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat7KeyTyped
        char x = evt.getKeyChar();
        if (mat7.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text7 = new TextAutoCompleter(mat7);
                completar(Character.getNumericValue(x), text7);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat7KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat8KeyTyped
        char x = evt.getKeyChar();
        if (mat8.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text8 = new TextAutoCompleter(mat8);
                completar(Character.getNumericValue(x), text8);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat8KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES 
    private void mat9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat9KeyTyped
        char x = evt.getKeyChar();
        if (mat9.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text9 = new TextAutoCompleter(mat9);  //Declaracion de la instacia de la clase "TextAutoCompleter" agregandose al TextField       
                completar(Character.getNumericValue(x), text9);          //Llamada a la funcion "completar" con los valores del caracter tecleado y  
            }                                                           // de la variable que hace el proceso de autocompletar
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat9KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat10KeyTyped
        char x = evt.getKeyChar();
        if (mat10.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text10 = new TextAutoCompleter(mat10);
                completar(Character.getNumericValue(x), text10);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat10KeyTyped
    //VALIDACIONES DEL INGRESO DE CALIFICACIONES
    private void mat11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat11KeyTyped
        char x = evt.getKeyChar();
        if (mat11.getText().length() < 1) {
            if (((x < '5' || x > '9') && x != '1')) {
                evt.consume();
            } else {
                TextAutoCompleter text11 = new TextAutoCompleter(mat11);
                completar(Character.getNumericValue(x), text11);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat11KeyTyped

    private void nuevaCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaCalifActionPerformed
        try {
            //AGREGA EL MES SIGUIENTE a CAPTURAR
            consul.ValidacionMensual(curp_txt.getText()); //consuta los meses que ya ha sido evaluado
            mes.removeAllItems();
            for (int i = 0; i <= Consultas.array.size() + 1; i++) { //LE SUMA UNA POSICION  MAS PARA AGREGAR EL MES SIGUIENTE

                mes.addItem(Consultas.gen[i]);
            }

            mes.setSelectedIndex(Consultas.array.size() + 1);//SELECCIONA EL MES A CAPTURAR 

            //HABILITA LAS CAJAS DE TEXTO
            JTextField[] txt = {mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, mat11, mat12};
            for (int i = 0; i < txt.length; i++) {
                txt[i].setText("");
                txt[i].setEnabled(true);
            }
            
            guardar.setVisible(true);
            guardar.setEnabled(true);
            mat12.setVisible(true); m12.setVisible(true); modificacion = false;
        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_nuevaCalifActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String mesBus = mes.getSelectedItem().toString();//obtiene el mes a consultas

        //CONSUTA LAS CALIFICACIONES DEL ALUMNO
        consul.buscarCalif(curp_txt.getText(), mesBus);

        if (mes.getSelectedItem().equals("......")) {
            JOptionPane.showMessageDialog(null,
                    "Seleccione el Mes de la evaluación.", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        JTextField[] txt = {mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, mat11};
        for (int i = 0; i < Consultas.calif.size(); i++) {
            //MUESTRA LAS CALIFICACIONES     EN LAS CAJAS DE TEXTO
            txt[i].setEnabled(false);
            txt[i].setText(Consultas.calif.get(i));

        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        try {
            switch (mes.getSelectedItem().toString()) {
                case "Nov/Dic":
                                btnObserv.setEnabled(true);
                                break;

                case "Marzo":

                                btnObserv.setEnabled(true);
                                break;

                case "Junio":

                                btnObserv.setEnabled(true);
                                //EnviarBoleta.setEnabled(true);
                                break;
                default:
                                btnObserv.setEnabled(false);
                                break;
            }
        } catch (Exception e) {
            System.out.println("N");
        }


    }//GEN-LAST:event_mesActionPerformed

    private void mat12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat12KeyTyped
        char x = evt.getKeyChar();
        if (mat12.getText().length() < 1) {
            if (((x < '0' || x > '9'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mat12KeyTyped

    private void visualizarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBoletaActionPerformed
        ObtenerInasistencias();
        ObtenerPromediosMensuales();
        ObtenerPromediosTrimestre();
        //mostrarBoleta = true;// si es true la boleta interna no se envia por correo
        
        
        BoletaInterna();

    }//GEN-LAST:event_visualizarBoletaActionPerformed

    private void EnviarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBoletaActionPerformed
    
        /*NOTA:ESTE BOTON SOLO SE TIENE QUE HABILITAR AL FINAL DEL CICLO ESCOLAR*/
        String ruta = null;
        String nomArchivo = null;
        //ABRIR EXPLORADOR DE ARCHIVOS
        JFileChooser dlg = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("pdf", "PDF");
        dlg.setFileFilter(fil);

        int option = dlg.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            ruta = dlg.getSelectedFile().getPath();
            nomArchivo = dlg.getSelectedFile().getName();

            int respuesta = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que Desea enviar Este Archivo?", "Información",
                    JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                System.out.println(ruta);
                System.out.println(nomArchivo);

                //INCIA LA CONEXION AL CORREO INSTITUCIONAL
                validacionMail objeto = new validacionMail();
                objeto.start();

                //ESTABLECE LOS DATOS PARA ENVIAR EL CORREO
                String asunto = "Boleta del alumno " + nom_alumno.getText();

                String curpA = curp_txt.getText();

                procesoMail proces = new procesoMail(nomArchivo, asunto, ruta, curpA);
                //ENVIA EL CORREO
                proces.start();
            }

        }

    }//GEN-LAST:event_EnviarBoletaActionPerformed

    private void btnObservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservActionPerformed
        curpO = curp_txt.getText();
        mesO = mes.getSelectedItem().toString();
        //instaciamos la clase para poder mostrar la ventana de observaciones
        frmObserv ven = new frmObserv();
        ven.setVisible(true);


    }//GEN-LAST:event_btnObservActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Imagenes-Reportes\\Manual-Usuario.pdf#page=29");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        String calificacion; 
        if (mes.getSelectedItem().equals("......")) {
            JOptionPane.showMessageDialog(null, 
                    "Seleccione Mes");
        }else{
           
            JTextField[] txt = {mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, mat11, mat12};
            for (int i = 0; i < txt.length; i++) {
                txt[i].setText("");
            }
            
            consul.getCalifMensuales(curp_txt.getText(), mes.getSelectedItem().toString());
            if (consul.arregloCalifMensuales.size() > 0) {
                 modificacion = true; modificar.setEnabled(false); guardar.setEnabled(true);
             guardar.setVisible(true);  m12.setVisible(false); mat12.setVisible(false); 
             mat12.setText("0");
             for (int i = 0; i < consul.arregloCalifMensuales.size(); i++) {              
                txt[i].setEnabled(true);
                calificacion = String.valueOf(consul.arregloCalifMensuales.get(i));
                txt[i].setText(calificacion);            
                }
            }else{
                JOptionPane.showMessageDialog(null, "Calificaciones del Mes "+mes.getSelectedItem().toString()
                        +" no Capturadas");
            }
            consul.arregloCalifMensuales.clear();           
        } 
    }//GEN-LAST:event_modificarActionPerformed

   

    public void Visualizarboletas() {
        mostrarBoleta = false;// si es false la boleta se envia por correo, boleta interna
        ObtenerInasistencias();
        ObtenerPromediosMensuales();
        ObtenerPromediosTrimestre();
        if (mes_boleta.equalsIgnoreCase("Nov/Dic") == true || mes_boleta.equalsIgnoreCase("Marzo") == true) {
            BoletaSEP();
        } else if (consul.BuscarUltimoTrimestre(curp_txt.getText(),3)) {
            if (consul.BuscarPromedioFinal(curp_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Promedios ya registrados");
            } else {
                getArregloCalifTrimestre(grado.getText());
            }
            mostrarBoleta = true;
            BoletaSEP();
        } else {
            BoletaInterna();
        }

    }

    public void EnviarBoletaCorreo(String tipoBoleta, String rutaBoleta) {
//        if (mes.getSelectedItem().equals("......")) {
//            JOptionPane.showMessageDialog(null,
//                    "Seleccione el Mes de la evaluación.", "Informacion",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }else{
        /*   String tri = " ";
        String perio = mes.getSelectedItem().toString();
        switch (mes.getSelectedItem().toString()) {
            case "Nov/Dic":
            tri = "1" ;
            break;

            case "Marzo":
            tri = "2" ;
            break;

            case "Junio":
            tri = "3" ;
            break;
      }*/

//        //INCIA LA CONEXION AL CORREO INSTITUCIONAL
//        validacionMail objeto = new validacionMail();
//        objeto.start();
//
//        //ESTABLECE LOS DATOS PARA ENVIAR EL CORREO
//        String nom = curp_txt.getText() + tipoBoleta + ".pdf";
//        String asunto = "Boleta del Mes de " + mes_boleta + " del alumno " + apmat_alumno.getText();
//        String ruta = rutaBoleta +/*"C:\\Users\\marco\\OneDrive\\Documentos\\Boletas\\Boletas Interna\\"*/ nom;
//        String curpA = curp_txt.getText();
//
//        procesoMail proces = new procesoMail(nom, asunto, ruta, curpA);
//        //ENVIA EL CORREO
//        proces.start();
//         }
    }
// Obtener Promedios mensuales por medio de una consulta; Materias SEP

    public void ObtenerPromediosMensuales() {

        int periodo = 0;
        String mes = "";
        double promedioFinal;
        do {
            if (periodo == 0) {
                mes = "Diagnostico";
            } else if (periodo == 1) {
                mes = "Septiembre";
            } else if (periodo == 2) {
                mes = "Octubre";
            } else if (periodo == 3) {
                mes = "Nov/Dic";
            } else if (periodo == 4) {
                mes = "Enero";
            } else if (periodo == 5) {
                mes = "Febrero";
            } else if (periodo == 6) {
                mes = "Marzo";
            } else if (periodo == 7) {
                mes = "Abril";
            } else if (periodo == 8) {
                mes = "Mayo";
            } else if (periodo == 9) {
                mes = "Junio";
            } else if (periodo == 10) {
                break;
            }
            promedioFinal = consul.getPromediosMensuales(pnlGrup.curp_boleta.toString(), pnlGrup.todo[0], mes);
            promedioMensual.add(promedioFinal);
            periodo++;
        } while (periodo != 10);

    }

    // Obtener las calificaciones de los 3 trimestres de la BD y Guardar sobre arreglos dinámicos
    // Interna y SEP
    public void getArregloCalifTrimestre(String grado) {
        //  JOptionPane.showMessageDialog(null, "obteniendo promedios trimestres");
        int trimestre = 0, id;
        double promedio;
        // String promedio_final_materia;        
        do {
            trimestre++;
            // JOptionPane.showMessageDialog(null, "do - while"+trimestre);
            consul.getPromediosTrimestre(trimestre, pnlGrup.curp_boleta);
        } while (trimestre != 3);
        // arraypromedio_final_materia = new String[consul.PrimerTrimestre.size()];
        for (int i = 0; i < consul.PrimerTrimestre.size(); i++) {
            promedio = consul.PrimerTrimestre.get(i) + consul.SegundoTrimestre.get(i) + consul.TercerTrimestre.get(i);
            promedio = promedio / 3;
            //promedio = Math.round(promedio);
            promedio = ((double) Math.round(promedio * 10d) / 10);
            
            if (modificacion) {
                consul.update_promedios_finales(promedio, curp_txt.getText(), consul.claves.get(i));
            }else{
                id = consul.llave_num("idpromedios", "promedios");
                consul.setPromedios(id, promedio, consul.claves.get(i), pnlGrup.curp_boleta);
            }
  
        }
        consul.PrimerTrimestre.clear();
        consul.SegundoTrimestre.clear();
        consul.TercerTrimestre.clear();
    }
    
    //Obtener promedios trimestrales por medio de una consulta; Materias SEP
    public void ObtenerPromediosTrimestre() {
        int trimestre = 0;
        double promedioFinal;
        do {
            trimestre++;
            promedioFinal = consul.getPromediosTrimestre(pnlGrup.curp_boleta, pnlGrup.todo[0], trimestre);
            promedioTrimestral.add(promedioFinal);
        } while (trimestre != 3);

    }

    //Método por obtener las inasistencias de la BD
    public void ObtenerInasistencias() {
        consul.ObtenerInasistencias(curp_txt.getText());
        GenerarPeriodoInasistencia();
    }

    //Método para generar el total de inasistencia por trimestre y el total de inasistencia del ciclo escolar
    //porcentaje de asistencias
    public void GenerarPeriodoInasistencia() {
        for (int i = 0; i < consul.arrayInasistencia.size(); i++) {
            arreglo[i] = consul.arrayInasistencia.get(i);
        }
        for (int i = 0; i<arreglo.length; i++) {
            if (i>=1 && i<=3) {
                PrimerPeriodoInasistencia += arreglo[i];
            }else if(i>3 && i<=6){
                SegundoPeriodoInasistencia += arreglo[i];
            }else if(i>6 && i<=9){
                TercerPeriodoInasistencia += arreglo[i];
            }       
        }
        PromedioFinalInasistencia = PrimerPeriodoInasistencia + 
                SegundoPeriodoInasistencia + TercerPeriodoInasistencia;
        Total_Asistencias = 190 - PromedioFinalInasistencia;
        PorcentajeAsistencias = (Total_Asistencias * 100) / 190;
    }
    
    public void LimpiarResultados(){
        consul.arrayInasistencia.clear(); PrimerPeriodoInasistencia = 0; PromedioFinalInasistencia = 0;
        promedioTrimestral.clear(); SegundoPeriodoInasistencia = 0; Total_Asistencias = 0;
        promedioMensual.clear(); TercerPeriodoInasistencia = 0; PorcentajeAsistencias = 0;
    }

    //Obtener Inasistencia por mes Boleta Interna
    public int Inasistencia_X_Mes(int index) {
        int num_inasistencia = 0;
//        num_inasistencia = consul.arrayInasistencia.get(index);
        num_inasistencia = arreglo[index];
       // JOptionPane.showMessageDialog(null, num_inasistencia);
        return num_inasistencia;
    }
    
    //Boleta Interna
    public double PromediosMensuales(int index) {
        double promedio = 0;
        promedio = promedioMensual.get(index);
        return promedio;
    }

    //Método para visualizar Boleta interna 
    public void BoletaInterna() {

        int num_lista = Integer.parseInt(pnlGrup.no_lista);
        int grado_alumno = Integer.parseInt(grado.getText());
        String nombre_completo = apmat_alumno.getText()+" "+ nom_alumno.getText() + " "
                +appat_alumno.getText();
        nombre_completo = nombre_completo.toUpperCase();
        double promedioFinal = consul.getPromedioFinalSep(curp_txt.getText(), grado.getText());
        promedioFinal = ((double) Math.round(promedioFinal * 10d) / 10);

        try {
            //Método de conexion
            conexion conexion = new conexion();
            //Inicializamos el archivo en null
            JasperReport reporte = null;
            //Colocamos la ruta en donde se almacena la plantilla del archivo
            String path = "src\\PaqueteReportesPrueba\\boletaInterna.jasper";

            //Leemos el archivo
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Creamos un parámetro, para poder ingresar datos al archivo
            Map parametro = new HashMap<String, Object>();
            //introducción de los datos al archivo; recibe dos parámetros (nombre del parámetro creado en Jaspert
            //, contenido)

            //Datos del alumno
            parametro.put("grado", grado_alumno);
            parametro.put("grado_grupo", grado.getText()+ " º " + grupo.getText());
            parametro.put("nolista", num_lista);
            parametro.put("nombre", nombre_completo);
            parametro.put("curp", curp_txt.getText());
            parametro.put("clave_infrob", "infrob00" + grado.getText());
            parametro.put("clave_edusoc", "edusoc00" + grado.getText());
   
            // Inasistencias por mes
            parametro.put("D", Inasistencia_X_Mes(0));
            parametro.put("S", Inasistencia_X_Mes(1));
            parametro.put("O", Inasistencia_X_Mes(2));
            parametro.put("N", Inasistencia_X_Mes(3));
            parametro.put("E", Inasistencia_X_Mes(4));
            parametro.put("F", Inasistencia_X_Mes(5));
            parametro.put("M", Inasistencia_X_Mes(6));
            parametro.put("A", Inasistencia_X_Mes(7));
            parametro.put("MY", Inasistencia_X_Mes(8));
            parametro.put("J", Inasistencia_X_Mes(9));

            parametro.put("promedioFinalSep", promedioFinal);
            parametro.put("promedioFinalComple", promedioFinal);

            //total de inasistencias por trimestre
            parametro.put("t_i_p", PrimerPeriodoInasistencia);
            parametro.put("t_i_s", SegundoPeriodoInasistencia);
            parametro.put("t_i_t", TercerPeriodoInasistencia);
            parametro.put("f_i", PromedioFinalInasistencia);

            // Promedios mensuales
            parametro.put("proDi", PromediosMensuales(0));
            parametro.put("proSe", PromediosMensuales(1));
            parametro.put("proOc", PromediosMensuales(2));
            parametro.put("proNov", PromediosMensuales(3));
            parametro.put("proEne", PromediosMensuales(4));
            parametro.put("proFeb", PromediosMensuales(5));
            parametro.put("proMar", PromediosMensuales(6));
            parametro.put("proAbr", PromediosMensuales(7));
            parametro.put("proMay", PromediosMensuales(8));
            parametro.put("proJun", PromediosMensuales(9));

            //promedio de cada trimestre
            parametro.put("pro_t_1", promedioTrimestral.get(0));
            parametro.put("pro_t_2", promedioTrimestral.get(1));
            parametro.put("pro_t_3", promedioTrimestral.get(2));
            
            // se plasman los datos en el archivo base, se mandan 3 parámetros (lectura del archivo, los parámetros,
            // la conexion de la base de datos )
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion.getConnection());
            //Creación de Método para visualizar la boleta     
            JasperViewer view = new JasperViewer(jprint, false);
            //al presionar sobre la X, se cierra
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            // se muestra en visualizador con la boleta
            view.setVisible(true);

            // función para exportar jaspert a pdf              //se establece una ruta y un nombre al PDF  
//           JasperExportManager.exportReportToPdfFile(jprint, "C:/Users/AngelAlexis/Documents/boleta/interna/"
//                    + pnlGrup.curp_boleta.toString() + "BoletaInterna.pdf");
            if (mostrarBoleta == false) {
//                EnviarBoletaCorreo("BoletaInterna", "C:\\Users\\marco\\OneDrive\\Documentos\\Boletas\\Boletas Interna\\");
            } else {
              //  JOptionPane.showMessageDialog(null, "Mostrar boleta");
            }

        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error en la generacion de la Boleta Interna");
            JOptionPane.showMessageDialog(null, e);
        }
        LimpiarResultados();

    }

    //Método para visualizar la Boleta SEP
    public void BoletaSEP() {
        int grado_alumno = Integer.parseInt(grado.getText());
        String porcentaje = String.valueOf(PorcentajeAsistencias);
        double promedioFinal;
        if (mes_boleta.equals("Junio") || modificacion) {
            promedioFinal = consul.getPromedioFinalSep(curp_txt.getText(), grado.getText());
            promedioFinal = ((double) Math.round(promedioFinal * 10d) / 10);
        }else{
            promedioFinal = 0.0;
        }
        

        try {
            //Método de conexion
            conexion conexion = new conexion();
            //Inicializamos el archivo en null
            JasperReport reporte = null;
            //Colocamos la ruta en donde se almacena la plantilla del archivo
            String path = "src\\PaqueteReportesPrueba\\Boleta_SEP.jasper";
            //Leemos el archivo
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Creamos un parámetro, para poder ingresar datos al archivo
            Map parametro = new HashMap<String, Object>();
            //introducción de los datos al archivo; recibe dos parámetros (nombre del parámetro creado en Jaspert contenido)
            ///Datos del alumno
            parametro.put("appat", nom_alumno.getText().toUpperCase());
            parametro.put("apmat", appat_alumno.getText().toUpperCase());
            parametro.put("nombre", apmat_alumno.getText().toUpperCase());
            parametro.put("grado", grado_alumno);
            parametro.put("curp", curp_txt.getText());
            parametro.put("grupo", grupo.getText());
            parametro.put("claveInfrob", "infrob00" + grado.getText());
            parametro.put("claveEdusoc", "edusoc00" + grado.getText());

            //Numero de asistencias
            parametro.put("asistencias", Total_Asistencias);
            //Porcentaje de asistencias
            parametro.put("porcentajeAsistencias", porcentaje + "%");
            //Promedio Final / ciclo escolar
            parametro.put("promedioFinal", promedioFinal);

            // se plasman los datos en el archivo base, se mandan 3 parámetros (lectura del archivo, los parámetros,
            // la conexion de la base de datos )
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion.getConnection());

            //Creación de Método para visualizar la boleta     
            JasperViewer view = new JasperViewer(jprint, false);

            //al presionar sobre la X, se cierra
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            // se muestra en visualizador con la boleta
            view.setVisible(true);
//            if(mostrarBoleta == true){//cuando la variable mostrarBoleta es igual a True, la Boleta Sep se enviará
//                JOptionPane.showMessageDialog(null, "Enviando Boleta");
//             función para exportar jaspert a pdf              //se establece una ruta y un nombre al PDF                  
//           JasperExportManager.exportReportToPdfFile(jprint, "C:/Users/marco/OneDrive/Documentos"
//                   + "/Boletas/Boletas SEP/" + pnlGrup.curp_boleta.toString() + "BoletaSEP.pdf");
//           EnviarBoletaCorreo("BoletaSEP", "C:\\Users\\marco\\OneDrive\\Documentos\\Boletas\\Boletas SEP\\");
//            }
           

        } catch (JRException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la generacion de la Boleta Sep" + e);
        }
        LimpiarResultados();

    }

    //INHABILITAR CAJAS DE TEXTO
    public void editar() {
        curp_txt.setEditable(false);
        nom_alumno.setEditable(false);
        appat_alumno.setEditable(false);
        apmat_alumno.setEditable(false);
        grado.setEditable(false);
        grupo.setEditable(false);

    }

    //RELLENAR MATERIAS
    public void etiquetas() {
        JLabel[] h = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11};
        JTextField[] txt = {mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, mat11};
        for (int i = 0; i < txt.length; i++) {         //Se hacen "invisibles" las etiquetas y los campos de texto
            txt[i].setVisible(false);
            h[i].setVisible(false);
        }
        for (int i = 0; i < Consultas.materias.size(); i++) {//De acuerdo con la longitud del arreglo de la cantidad de las materias con la que se va a evaluar al alumno
            h[i].setVisible(true);                     //Se haran visibles de nuevo las etiquetas y los campos de texto 
            txt[i].setEnabled(false);                    //Se desabilita las caja de texto  
            txt[i].setVisible(true);
            h[i].setText(Consultas.materias.get(i));         //Se coloca el nombre de las materias de acuerdo al orden en que fueron ingresadas
            m12.setVisible(true);
            mat12.setVisible(true);
        }

    }

    ///Busqueda del ID para guardar la inasistencia
    public void setInasistencias() {
       // JOptionPane.showMessageDialog(null, mes_boleta);
        boolean busqueda  = consul.ValidacionInasistencia(curp_txt.getText(), mes_boleta);
        if (busqueda == true) {
            JOptionPane.showMessageDialog(null, "Numero de Inasistencias ya registradas");
        }else{
            String dias = mat12.getText();
            int dias_inasistencias = Integer.parseInt(dias);
            int id = consul.llave_num("id_ina", "inasistencia");
            if (id > 0) {
                consul.IngresarInasistencia(id, curp_txt.getText().toString(), mes.getSelectedItem().toString(), dias_inasistencias);
            } 
        }       
    }

    //Auto-Acompletar calificaciones
    public void completar(int a, TextAutoCompleter auxiliar) {
        double b = a;                           //Se le asigna la variable "a" al double "b" para despues sumarle 0.1 y asi poder hacer el arreglo  
        ArrayList<Object> num = new ArrayList();//Arreglo dinamico que ayudara para ingresar los numeros decimales

        for (int i = 0; i < 10; i++) {
            String val = String.format("%.1f", b);
            num.add(val.replace(',', '.'));
            b += 0.1;
        }

        switch (a) {
            case 1:
                auxiliar.removeAllItems();
                auxiliar.addItem(10.0);
                break;

            case 5:
                auxiliar.removeAllItems();
                auxiliar.addItem(5.0);
                break;

            case 6:
                auxiliar.removeAllItems();
                auxiliar.addItems(num);
                break;

            case 7:
                auxiliar.removeAllItems();
                auxiliar.addItems(num);
                break;

            case 8:
                auxiliar.removeAllItems();
                auxiliar.addItems(num);
                break;

            case 9:
                auxiliar.removeAllItems();
                auxiliar.addItems(num);
                break;
        }
    }

    public void agregarmes() {
        mes.removeAllItems();
        consul.ValidacionMensual(curp_txt.getText()); //Se añaden los meses de acuerdo a la evaluacion que ha llevado
        System.out.println(Consultas.array);
       
        for (int i = 0; i <= Consultas.array.size(); i++) {
            System.out.println("MESSSSS    " + Consultas.gen[i]);
            mes.addItem(Consultas.gen[i]);        
        }
    }
    
    public void updateTrimestre(String mes, int trimestre){
        for (int i = 0; i < consul.claves.size(); i++) {
            double promediar = consul.promedio(mes, curp_txt.getText(), consul.claves.get(i));
            //JOptionPane.showMessageDialog(null, promediar);
            consul.promedios_trimestral_update(consul.claves.get(i), promediar, curp_txt.getText(), trimestre);
        }
      //  JOptionPane.showMessageDialog(null, "Trimestre Modificado de Manera Correcta");
        if (consul.BuscarPromedioFinal(curp_txt.getText())) {
             getArregloCalifTrimestre(grado.getText());
        }
       
    }

    public void trimestre(String mes, int tri) {         //Metodo para calcular y registrar los promedios de las materias durante un trimestre
        if (consul.BuscarUltimoTrimestre(curp_txt.getText(), tri) == false) {
            for (int i = 0; i < consul.claves.size(); i++) {
            String llave = consul.llave_primaria();
            System.out.println("La llave primaria de trimestre es" + llave);

            double promediar = consul.promedio(mes, curp_txt.getText(), consul.claves.get(i));
            consul.promedios_trimestral(llave, consul.claves.get(i), promediar, curp_txt.getText(), tri);
            }
                JOptionPane.showMessageDialog(null,
                "Trimestre " + tri + " registrado correctamente", "Informacion",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton EnviarBoleta;
    private javax.swing.JTextField apmat_alumno;
    private javax.swing.JTextField appat_alumno;
    private javax.swing.JButton ayuda;
    private javax.swing.JButton btnObserv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel curp;
    public static final javax.swing.JTextField curp_txt = new javax.swing.JTextField();
    private javax.swing.JTextField grado;
    private javax.swing.JTextField grupo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m10;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JLabel m8;
    private javax.swing.JLabel m9;
    private javax.swing.JTextField mat1;
    private javax.swing.JTextField mat10;
    private javax.swing.JTextField mat11;
    private javax.swing.JTextField mat12;
    private javax.swing.JTextField mat2;
    private javax.swing.JTextField mat3;
    private javax.swing.JTextField mat4;
    private javax.swing.JTextField mat5;
    private javax.swing.JTextField mat6;
    private javax.swing.JTextField mat7;
    private javax.swing.JTextField mat8;
    private javax.swing.JTextField mat9;
    public static final javax.swing.JComboBox<String> mes = new javax.swing.JComboBox<>();
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nom_alumno;
    private javax.swing.JButton nuevaCalif;
    private javax.swing.JButton regresar;
    private javax.swing.JButton visualizarBoleta;
    // End of variables declaration//GEN-END:variables

}
