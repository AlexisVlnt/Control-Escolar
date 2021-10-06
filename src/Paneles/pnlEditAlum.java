package Paneles;

import Clases.CambiaPanel;
import Clases.Consultas;
import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JTextField;

public class pnlEditAlum extends javax.swing.JPanel {

    pnlGrup grupos = new pnlGrup();
    Consultas consulta = new Consultas();
    static int eda;

    public pnlEditAlum() {
        initComponents();
        llenarDatos();
    }

    public long numero(JTextField campo) {
        return Long.parseLong(campo.getText());
    }

    public String campos(JTextField c) {
        String x = "";
        if (c.getText().equalsIgnoreCase("")) {
            x = null;
            return x;
        } else {
            return c.getText();
        }

    }

    public void llenarDatos() {

        JTextField[] txt = {curp, nom_alumno, appat_alumno, apmat_alumno, genero,
            edad, grado, grupo, nom_tutor, appat_tutor, apmat_tutor, tel, email};
        for (int i = 0; i < txt.length; i++) {
            txt[i].setText(Consultas.array.get(i));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        nom_alumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        appat_alumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        apmat_alumno = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nom_tutor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        appat_tutor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        apmat_tutor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        grupo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        edita = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        edad = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        ayuda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Alumnos");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/icons8_children_64px_1.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(102, 153, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Del Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel.setForeground(new java.awt.Color(51, 51, 51));
        jPanel.setName("asda"); // NOI18N
        jPanel.setOpaque(false);

        nom_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nom_alumno.setToolTipText("");
        nom_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        nom_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nom_alumno.setEnabled(false);
        nom_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_alumnoKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre(s)");

        appat_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        appat_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        appat_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        appat_alumno.setEnabled(false);
        appat_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                appat_alumnoKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido Paterno:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Apellido Materno");

        apmat_alumno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        apmat_alumno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        apmat_alumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        apmat_alumno.setEnabled(false);
        apmat_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apmat_alumnoKeyTyped(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(130, 206, 130));
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

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Grupo:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("CURP");

        curp.setEditable(false);
        curp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        curp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        curp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        curp.setEnabled(false);
        curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curpKeyTyped(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Datos del tutor");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Nombre(s)");

        nom_tutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nom_tutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        nom_tutor.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        nom_tutor.setEnabled(false);
        nom_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_tutorKeyTyped(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Apellido Paterno");

        appat_tutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        appat_tutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        appat_tutor.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        appat_tutor.setEnabled(false);
        appat_tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appat_tutorActionPerformed(evt);
            }
        });
        appat_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                appat_tutorKeyTyped(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Apellido Materno");

        apmat_tutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        apmat_tutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        apmat_tutor.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        apmat_tutor.setEnabled(false);
        apmat_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apmat_tutorKeyTyped(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Teléfeno");

        tel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        tel.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tel.setEnabled(false);
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Sexo");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Correo Electrónico");

        email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        email.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        email.setEnabled(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Grado:");

        grado.setEditable(false);
        grado.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        grado.setText("--");
        grado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        grado.setEnabled(false);

        grupo.setEditable(false);
        grupo.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        grupo.setText("--");
        grupo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        grupo.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Edad: ");

        jButton3.setBackground(new java.awt.Color(130, 206, 130));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_undo_40px.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        edita.setBackground(new java.awt.Color(130, 206, 130));
        edita.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        edita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo/icons8_edit_file_40px.png"))); // NOI18N
        edita.setText("Editar");
        edita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        edad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        edad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        edad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        edad.setEnabled(false);
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });

        genero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        genero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        genero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        genero.setEnabled(false);
        genero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                generoKeyTyped(evt);
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
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appat_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar)
                        .addContainerGap())
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(143, 143, 143))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apmat_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(11, 11, 11)
                                .addComponent(nom_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)
                                .addComponent(appat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27)
                                .addComponent(curp, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grupo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(apmat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel19)
                                .addGap(28, 28, 28)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 55, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addGap(23, 23, 23)
                .addComponent(edita)
                .addGap(23, 23, 23)
                .addComponent(cancelar)
                .addGap(18, 18, 18)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nom_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(appat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(apmat_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel4))
                                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addComponent(jLabel13)
                .addGap(15, 15, 15)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nom_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appat_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(apmat_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(36, 36, 36)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ayuda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

    }//GEN-LAST:event_jLabel21MouseClicked

    private void nom_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_alumnoKeyTyped
        char x = evt.getKeyChar();
        if (nom_alumno.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_nom_alumnoKeyTyped

    private void appat_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appat_alumnoKeyTyped
        char x = evt.getKeyChar();
        if (appat_alumno.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_appat_alumnoKeyTyped

    private void apmat_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apmat_alumnoKeyTyped
        char x = evt.getKeyChar();
        if (apmat_alumno.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_apmat_alumnoKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        long p = numero(grado);
        long s = numero(tel);
        int edadd = Integer.parseInt(edad.getText());
        //SE VERIFICA SI HAY UN ALUMNO REGISTRADO CON EL MISMO NOMBRE
            //MANADA A LLAMAR EL METODOD PARA LA MODIFICACION DE LOS DATOS Y SE ENVIAN LOS PARAMETROS
            consulta.ModifiAlum(campos(nom_alumno), campos(appat_alumno), campos(apmat_alumno), campos(curp), p,
                    grupo.getText(), genero.getText(), edadd, campos(nom_tutor), campos(appat_tutor), campos(apmat_tutor), s, campos(email));
            
            guardar.setEnabled(false);
            nom_alumno.setEnabled(false);
            apmat_tutor.setEnabled(false);
            appat_alumno.setEnabled(false);
            curp.setEnabled(false);
            apmat_alumno.setEnabled(false);

            nom_tutor.setEnabled(false);
            appat_tutor.setEnabled(false);
            apmat_tutor.setEnabled(false);
            tel.setEnabled(false);
            email.setEnabled(false);        
    }//GEN-LAST:event_guardarActionPerformed

    private void curpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curpKeyTyped
        char x = evt.getKeyChar();
        if (curp.getText().length() <= 17) {
            if (((x < 'A' || x > 'Z')) && ((x < '0' || x > '9'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_curpKeyTyped

    private void nom_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_tutorKeyTyped
        char x = evt.getKeyChar();
        if (nom_tutor.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nom_tutorKeyTyped

    private void appat_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appat_tutorKeyTyped
        char x = evt.getKeyChar();
        if (appat_tutor.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z')) && ((x != 'ñ' || x != 'Ñ'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_appat_tutorKeyTyped

    private void apmat_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apmat_tutorKeyTyped
        char x = evt.getKeyChar();
        if (apmat_tutor.getText().length() <= 14) {
            if (((x < 'A' || x > 'Z') && x != ' ') && ((x < 'a' || x > 'z')) && ((x != 'ñ' || x != 'Ñ'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_apmat_tutorKeyTyped

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        char x = evt.getKeyChar();
        if (tel.getText().length() < 10) {
            if (((x < '0' || x > '9'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_telKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        char x = evt.getKeyChar();
        if (email.getText().length() <= 29) {
            if (((x < 'A' || x > 'Z')) && ((x < 'a' || x > 'z')) && ((x < '0' || x > '9')) && ((x != '@')) && ((x != '.')) && ((x != 'ñ' || x != 'Ñ'))) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_emailKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CambiaPanel(panelCentralx, new Paneles.pnlGrup());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void editaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaActionPerformed
        guardar.setEnabled(true);

        apmat_alumno.setEnabled(true);
        nom_alumno.setEnabled(true);
        apmat_tutor.setEnabled(true);
        appat_alumno.setEnabled(true);
        curp.setEnabled(true);

        nom_tutor.setEnabled(true);
        appat_tutor.setEnabled(true);
        apmat_tutor.setEnabled(true);
        tel.setEnabled(true);
        email.setEnabled(true);


    }//GEN-LAST:event_editaActionPerformed

    private void appat_tutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appat_tutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appat_tutorActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        guardar.setEnabled(false);
        nom_alumno.setEnabled(false);
        apmat_tutor.setEnabled(false);
        appat_alumno.setEnabled(false);
        curp.setEnabled(false);
        apmat_alumno.setEnabled(false);

        nom_tutor.setEnabled(false);
        appat_tutor.setEnabled(false);
        apmat_tutor.setEnabled(false);
        tel.setEnabled(false);
        email.setEnabled(false);


    }//GEN-LAST:event_cancelarActionPerformed

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_edadKeyTyped

    private void generoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_generoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_generoKeyTyped

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Imagenes-Reportes\\Manual-Usuario.pdf#page=25");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apmat_alumno;
    private javax.swing.JTextField apmat_tutor;
    private javax.swing.JTextField appat_alumno;
    private javax.swing.JTextField appat_tutor;
    private javax.swing.JButton ayuda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField edad;
    private javax.swing.JButton edita;
    private javax.swing.JTextField email;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField grado;
    private javax.swing.JTextField grupo;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField nom_alumno;
    private javax.swing.JTextField nom_tutor;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
