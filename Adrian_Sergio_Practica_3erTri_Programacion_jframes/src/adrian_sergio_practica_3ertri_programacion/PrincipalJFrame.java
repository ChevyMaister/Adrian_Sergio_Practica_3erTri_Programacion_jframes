
package adrian_sergio_practica_3ertri_programacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PrincipalJFrame extends javax.swing.JFrame {


    Main main = new Main();
    static boolean mensajeReadme = false;

    public PrincipalJFrame() {
        initComponents();
        if (mensajeReadme == false) {
            JOptionPane.showMessageDialog(this, "ANTES DE USAR LA APLICACION, SE RECOMIENDA LEER EL ARCHIVO README\nSITUADO EN \\Adrian_Sergio_Practica_3erTri_Programacion_jframes\\Ficheros");
        }
        mensajeReadme = true;
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonMat = new javax.swing.JButton();
        BotonGesC = new javax.swing.JButton();
        BotonGesA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonFicherosyBBDD = new javax.swing.JButton();
        botonFicherosyBBDD1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 3, 12));

        botonSalir.setBackground(new java.awt.Color(56, 49, 64));
        botonSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(244, 237, 113));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonMat.setBackground(new java.awt.Color(138, 134, 4));
        botonMat.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        botonMat.setForeground(new java.awt.Color(56, 49, 64));
        botonMat.setText("MATRICULAS Y BUSQUEDAS");
        botonMat.setPreferredSize(new java.awt.Dimension(1, 1));
        botonMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatActionPerformed(evt);
            }
        });

        BotonGesC.setBackground(new java.awt.Color(138, 134, 4));
        BotonGesC.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonGesC.setForeground(new java.awt.Color(244, 237, 113));
        BotonGesC.setText("GESTION CURSOS");
        BotonGesC.setPreferredSize(new java.awt.Dimension(150, 80));
        BotonGesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGesCActionPerformed(evt);
            }
        });

        BotonGesA.setBackground(new java.awt.Color(138, 134, 4));
        BotonGesA.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        BotonGesA.setForeground(new java.awt.Color(56, 49, 64));
        BotonGesA.setText("GESTION ALUMNOS");
        BotonGesA.setPreferredSize(new java.awt.Dimension(150, 80));
        BotonGesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGesAActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgCentroEstudios.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        botonFicherosyBBDD.setBackground(new java.awt.Color(138, 134, 4));
        botonFicherosyBBDD.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botonFicherosyBBDD.setForeground(new java.awt.Color(56, 49, 64));
        botonFicherosyBBDD.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;GESTION FICHEROS</p><p>COPIAS SEGURIDAD BBDD</p></html>");
        botonFicherosyBBDD.setPreferredSize(new java.awt.Dimension(1, 1));
        botonFicherosyBBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFicherosyBBDDActionPerformed(evt);
            }
        });

        botonFicherosyBBDD1.setBackground(new java.awt.Color(138, 134, 4));
        botonFicherosyBBDD1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botonFicherosyBBDD1.setForeground(new java.awt.Color(56, 49, 64));
        botonFicherosyBBDD1.setText("<html><p>CREAR INFORMES DE ALUMNOS</p><p>&nbsp;&nbsp;&nbsp;&nbsp;CURSOS Y CALIFICACIONES</p></html>");
        botonFicherosyBBDD1.setToolTipText("");
        botonFicherosyBBDD1.setActionCommand("<html><p>cCREAR INFORME DE ALUMNOS</p><p>CURSOS Y CALIFICACIONES</p></html>");
        botonFicherosyBBDD1.setPreferredSize(new java.awt.Dimension(1, 1));
        botonFicherosyBBDD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFicherosyBBDD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonGesA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonGesC, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(botonMat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(botonFicherosyBBDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(botonFicherosyBBDD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)))
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonGesA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonGesC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonFicherosyBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonFicherosyBBDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGesAActionPerformed
        // TODO add your handling code here:
        GestionAlumnos gesA = new GestionAlumnos();
        gesA.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BotonGesAActionPerformed


    private void BotonGesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGesCActionPerformed
        GestionCursos gesC = new GestionCursos();
        gesC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonGesCActionPerformed

    private void botonMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatActionPerformed
        // TODO add your handling code here:
        MatriculasBusquedas gesMB = new MatriculasBusquedas();
        gesMB.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMatActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonFicherosyBBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFicherosyBBDDActionPerformed
        SerializacionyFicherosDeSeguridad seguridad = new SerializacionyFicherosDeSeguridad();
        seguridad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonFicherosyBBDDActionPerformed

    private void botonFicherosyBBDD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFicherosyBBDD1ActionPerformed
        // TODO add your handling code here:
        GestionesDeBD bd = new GestionesDeBD();
        ArrayList<String> informe = bd.informesAlumnosNotas();
        String archivo = "Ficheros/InformeDeAlumnosCursosyNotas.txt";

        try {
            FileWriter writer = new FileWriter(archivo);

            for (String fila : informe) {
                writer.write(fila);
                writer.write(System.lineSeparator()); // Agrega un salto de línea después de cada cadena
            }

            writer.close();
            System.out.println("Archivo generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo");
        }
        JOptionPane.showMessageDialog(this, "                       INFORME TIPO TXT CREADO EN:            \n\\Adrian_Sergio_Practica_3erTri_Programacion_jframes\\Ficheros");
    }//GEN-LAST:event_botonFicherosyBBDD1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    /* public HashMap<String, Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(HashMap<String, Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }*/

 /*public HashMap<String, Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(HashMap<String, Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGesA;
    private javax.swing.JButton BotonGesC;
    private javax.swing.JButton botonFicherosyBBDD;
    private javax.swing.JButton botonFicherosyBBDD1;
    private javax.swing.JButton botonMat;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
