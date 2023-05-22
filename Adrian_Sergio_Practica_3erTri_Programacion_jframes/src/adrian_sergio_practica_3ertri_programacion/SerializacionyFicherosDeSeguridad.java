package adrian_sergio_practica_3ertri_programacion;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SerializacionyFicherosDeSeguridad extends javax.swing.JFrame {

    public SerializacionyFicherosDeSeguridad() {
        initComponents();

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        textoInfo.setText("SERIALIZAR LA BBDD A FICHERO --> Serializas los datos de la BD y lo conviertes en fichero(EL NUEVO FICHERO BORRARA EL ANTERIOR)\nVOLCAR FICHERO SERIALIZADOA BBDD --> Vuelcas el fichero serializado en la BD (SE BORRARAN LOS DATOS DE LA BD)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGA = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        serializarAFichero = new javax.swing.JButton();
        volcarFicheroABBDD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGA.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel5.setBackground(new java.awt.Color(4, 3, 12));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("COPIAS DE SEGURIDAD");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        serializarAFichero.setBackground(new java.awt.Color(4, 3, 12));
        serializarAFichero.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        serializarAFichero.setForeground(new java.awt.Color(244, 237, 113));
        serializarAFichero.setText("SERIALIZAR LA BBDD A FICHERO");
        serializarAFichero.setActionCommand("NUEVO REGISTRO");
        serializarAFichero.setPreferredSize(new java.awt.Dimension(140, 80));
        serializarAFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serializarAFicheroActionPerformed(evt);
            }
        });

        volcarFicheroABBDD.setBackground(new java.awt.Color(4, 3, 12));
        volcarFicheroABBDD.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        volcarFicheroABBDD.setForeground(new java.awt.Color(244, 237, 113));
        volcarFicheroABBDD.setText("VOLCAR FICHERO SERIALIZADOA BBDD");
        volcarFicheroABBDD.setActionCommand("<html><p>BORRAR</p><p> ALUMNO</p></html>");
        volcarFicheroABBDD.setPreferredSize(new java.awt.Dimension(140, 80));
        volcarFicheroABBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volcarFicheroABBDDActionPerformed(evt);
            }
        });

        textoInfo.setEditable(false);
        textoInfo.setBackground(new java.awt.Color(0, 0, 0));
        textoInfo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoInfo.setForeground(new java.awt.Color(255, 255, 255));
        textoInfo.setEnabled(false);
        jScrollPane1.setViewportView(textoInfo);

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volcarFicheroABBDD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serializarAFichero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelEleccionLayout.setVerticalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serializarAFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volcarFicheroABBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGALayout = new javax.swing.GroupLayout(panelGA);
        panelGA.setLayout(panelGALayout);
        panelGALayout.setHorizontalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGALayout.setVerticalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGA, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volcarFicheroABBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volcarFicheroABBDDActionPerformed
        //boton para sobreescribir la base de datos con los ficheros serializados de cursos , alumnos e inscripciones
        GestionesDeBD bd = new GestionesDeBD();

        if (bd.existeFicheros("Ficheros/listaCursos.ser") && bd.existeFicheros("Ficheros/listaAlumnos.ser") && bd.existeFicheros("Ficheros/listaInscripciones.ser")) {

            ArrayList<Curso> listaCursosS;
            int n = JOptionPane.showConfirmDialog(
                    this,
                    "Al volcar el fichero, se borraran los datos actuales en la BD y se introduciran los serializados.\n¿Estas seguro de querer volcarlos?",
                    "Confirmación de borrado",
                    JOptionPane.YES_NO_OPTION);
            // SI SE CONFIRMA
            if (n == JOptionPane.OK_OPTION) {
                //PRIMERO SE BORRAN LAS INSCRIPCIONES YA QUE TIENEN RELACION CON CURSO Y ALUMNOS
                bd.borrarInscripciones("TODO", "TODO");
                //AQUI IRIAN LOS CURSOS
                bd.borrarCurso("TODO");
                bd.borrarAlumno("TODO");

                listaCursosS = bd.deserializarCursos();
                bd.insertarCS(listaCursosS);
                //Se introducen en la base de datos los alumnos

                bd.deserializarAlumnos();

                //Por ultimo se introducen las inscripciones, despues de los cursos y alumnos
                bd.deserializarInscripciones();
            }
        }else{
            int n = JOptionPane.showConfirmDialog(
                    this,
                    "No se han encontrado los ficheros o estan vacios",
                    "No ficheros o no validos",
                    JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_volcarFicheroABBDDActionPerformed

    private void serializarAFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serializarAFicheroActionPerformed
//boton serializar la base de datos al fichero (copia de seguridad ) , se serializa cada objeto en un fichero diferente
        GestionesDeBD bd = new GestionesDeBD();
        ArrayList<Curso> listaCursos = new ArrayList();
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        ArrayList<Inscripcion> listaInscripciones = new ArrayList();
        // PANEL DE CONFIRMACION
        int n = JOptionPane.showConfirmDialog(
                this,
                "Al serializar, si hay un fichero serializado se sobreescribira.\n¿Estas seguro de querer serializar?",
                "Confirmación de borrado",
                JOptionPane.YES_NO_OPTION);
        // SI SE CONFIRMA
        if (n == JOptionPane.OK_OPTION) {
            try {
                listaCursos = bd.obtenerCursos();//se obtienen los cursos de la base de datos para serializarlos mas tarde

            } catch (Exception ex) {
                Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(Level.SEVERE, null, ex);
            }
            bd.serializarCursos(listaCursos);//Se serializan los cursos en el fichero

            try {
                listaAlumnos = bd.obtenerAlumnos();//se obtienen los Alumnos de la base de datos para serializarlos mas tarde 

            } catch (Exception ex) {
                Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(Level.SEVERE, null, ex);
            }
            bd.serializarAlumnos(listaAlumnos);//Se serializan los alumnos
            try {
                listaInscripciones = bd.obtenerInscripciones();//se obtienen las Inscripciones de la base de datos para serializarlas mas tarde

            } catch (Exception ex) {
                Logger.getLogger(SerializacionyFicherosDeSeguridad.class.getName()).log(Level.SEVERE, null, ex);
            }
            bd.serializarInscripciones(listaInscripciones);//se serializan las inscripciones
        }
    }//GEN-LAST:event_serializarAFicheroActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        PrincipalJFrame volver = new PrincipalJFrame();//para volver al jframe anterior que es PrincipalJFrame
        volver.setVisible(true);
        this.dispose();// esta ventana se cierra
    }//GEN-LAST:event_volverActionPerformed

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

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEleccion;
    private javax.swing.JPanel panelGA;
    private javax.swing.JButton serializarAFichero;
    private javax.swing.JTextPane textoInfo;
    private javax.swing.JButton volcarFicheroABBDD;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
