/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Consultas;
import Clases.conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class pnlBitacora extends javax.swing.JPanel {

    public DefaultTableModel modelo;
    public String [] datosBitacora = new String[4];
    
    public pnlBitacora() {
        initComponents();
        DefaultTableModel modelo = mostrarDatos();
        tablaMetro.setModel(modelo);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayuda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMetro = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));

        ayuda.setBackground(new java.awt.Color(255, 255, 255));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayuda.setToolTipText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bitacora Del Personal");

        tablaMetro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaMetro.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaMetro.setColorFilasForeground1(new java.awt.Color(102, 51, 255));
        tablaMetro.setColorFilasForeground2(new java.awt.Color(102, 51, 255));
        jScrollPane2.setViewportView(tablaMetro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        if (Desktop.isDesktopSupported()) {
             try {                   
                    File manual = new File("C:\\Manual Tecnico.pdf#page=108");
                     
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe " + manual);
                    //Desktop.getDesktop().open(manual);
            } catch (IOException e) {
                        System.out.println(e);
                }
            }
    }//GEN-LAST:event_ayudaActionPerformed

    public DefaultTableModel mostrarDatos(){
        String[] Columnas = {"Fecha De Acceso", "Usuario", "Hora De Entrada", "Hora De Salida"};
        modelo = new DefaultTableModel(null,Columnas);
        try {
             conexion conexion = new conexion();
             PreparedStatement consulta = conexion.getConnection().prepareStatement("select fecha_acceso, id_usuario, "
                     + "hora_entrada, hora_salida from reporte; ");
             ResultSet resultado = consulta.executeQuery();
             
             while (resultado.next()) {
                datosBitacora[0] = resultado.getString("fecha_acceso");
                datosBitacora[1] = resultado.getString("id_usuario");
                datosBitacora[2] = resultado.getString("hora_entrada");
                datosBitacora[3] = resultado.getString("hora_salida");
                modelo.addRow(datosBitacora);
             }
             /*if (resultado.next()) {
                 JOptionPane.showMessageDialog(null, "Registro de Bitacora Encontrado!!!");
             }else{
                 JOptionPane.showMessageDialog(null,"Registro de Bitacora no Encontrado!!!!");
             }*/
             
             consulta.close();
             conexion.desconectar();
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al consultar los registros de los accesos a la base de datos");
             System.out.println(e);
         }
        
        return modelo;
     }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro tablaMetro;
    // End of variables declaration//GEN-END:variables
}
