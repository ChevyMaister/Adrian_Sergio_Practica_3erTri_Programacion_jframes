/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chevy
 */
public class SerializacionyFicherosDeSeguridad extends javax.swing.JFrame {

    /**
     * Creates new form SerializacionyFicherosDeSeguridad
     */
    public SerializacionyFicherosDeSeguridad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGA = new javax.swing.JPanel();
        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aniadir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        borrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        borrarCampos = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGA.setPreferredSize(new java.awt.Dimension(1000, 600));

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("SERIALIZACION Y COPIAS DE SEGURIDAD");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        aniadir.setBackground(new java.awt.Color(4, 3, 12));
        aniadir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        aniadir.setForeground(new java.awt.Color(244, 237, 113));
        aniadir.setText("SERIALIZAR LA BBDD A FICHERO");
        aniadir.setActionCommand("NUEVO REGISTRO");
        aniadir.setPreferredSize(new java.awt.Dimension(140, 80));
        aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(4, 3, 12));
        borrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(244, 237, 113));
        borrar.setText("<html><p>&nbsp;BORRAR</p><p>ALUMNO</p></html>");
        borrar.setActionCommand("<html><p>BORRAR</p><p> ALUMNO</p></html>");
        borrar.setPreferredSize(new java.awt.Dimension(140, 80));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        borrar1.setBackground(new java.awt.Color(4, 3, 12));
        borrar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        borrar1.setForeground(new java.awt.Color(244, 237, 113));
        borrar1.setText("<html><p>&nbsp;BORRAR</p><p>ALUMNO</p></html>");
        borrar1.setActionCommand("<html><p>BORRAR</p><p> ALUMNO</p></html>");
        borrar1.setPreferredSize(new java.awt.Dimension(140, 80));
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });

        textoInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoInfo.setForeground(new java.awt.Color(4, 3, 12));
        textoInfo.setEnabled(false);
        jScrollPane1.setViewportView(textoInfo);

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEleccionLayout.setVerticalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(4, 3, 12));

        aceptar.setBackground(new java.awt.Color(4, 3, 12));
        aceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(244, 237, 113));
        aceptar.setText("HACER GESTION");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        borrarCampos.setBackground(new java.awt.Color(4, 3, 12));
        borrarCampos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        borrarCampos.setForeground(new java.awt.Color(244, 237, 113));
        borrarCampos.setText("BORRAR TODO");
        borrarCampos.setToolTipText("");
        borrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCamposActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(4, 3, 12));
        volver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(244, 237, 113));
        volver.setText("VOLVER ATRAS");
        volver.setToolTipText("");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGALayout = new javax.swing.GroupLayout(panelGA);
        panelGA.setLayout(panelGALayout);
        panelGALayout.setHorizontalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addGroup(panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGALayout.setVerticalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
    Serializacion serial= new Serializacion();
    GestionesDeBD bd = new GestionesDeBD();
    ArrayList <Alumno>listaAlumnos= new ArrayList();
        try {
            listaAlumnos = bd.obtenerAlumnos();
        } catch (Exception ex) {
            Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(Level.SEVERE, null, ex);
        }
    serial.serializarAlumnos(listaAlumnos);
    }//GEN-LAST:event_aniadirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

    }//GEN-LAST:event_borrarActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrar1ActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

    }//GEN-LAST:event_aceptarActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed

    }//GEN-LAST:event_borrarCamposActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

    }//GEN-LAST:event_volverActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerializacionyFicherosDeSeguridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aniadir;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar1;
    private javax.swing.JButton borrarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEleccion;
    public javax.swing.JPanel panelGA;
    private javax.swing.JTextPane textoInfo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}