package adrian_sergio_practica_3ertri_programacion;

import java.awt.Component;
import javax.swing.JOptionPane;

public class GestionAlumnos extends javax.swing.JFrame {

    GestionesDeBD bd = new GestionesDeBD(); // Instancia de la clase GestionesDeBD para gestionar la base de datos

    Utiles util = new Utiles(); // Instancia de la clase Utiles para utilizar utilidades adicionales
    private int opcion = 0; // Opción actual seleccionada: 0 para Entrar, 1 para Aniadir, 2 para Borrar, 3 para Modificar

    public GestionAlumnos() {
        initComponents();

        // Deshabilitar todos los componentes dentro del panelDatos
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        textoInfo.setText("Selecciona una opción: NUEVO, BORRAR o MODIFICAR"); // Establecer texto informativo
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelGA = new javax.swing.JPanel();
        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aniadir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        borrarCampos = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        labelDni = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelTlfn = new javax.swing.JLabel();
        textoDni = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        textoTlfn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGA.setPreferredSize(new java.awt.Dimension(1000, 600));

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("GESTION DE ALUMNOS");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        aniadir.setBackground(new java.awt.Color(4, 3, 12));
        aniadir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        aniadir.setForeground(new java.awt.Color(244, 237, 113));
        aniadir.setText("<html><p>&nbsp;&nbsp;NUEVO</p><p>ALUMNO</p></html>");
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

        modificar.setBackground(new java.awt.Color(4, 3, 12));
        modificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(244, 237, 113));
        modificar.setText("MODIFICAR");
        modificar.setPreferredSize(new java.awt.Dimension(140, 80));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEleccionLayout.setVerticalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        panelDatos.setBackground(new java.awt.Color(202, 199, 215));

        labelDni.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelDni.setForeground(new java.awt.Color(4, 3, 12));
        labelDni.setText("DNI:");

        labelNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(4, 3, 12));
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelApellido.setForeground(new java.awt.Color(4, 3, 12));
        labelApellido.setText("Apellido");

        labelCorreo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(4, 3, 12));
        labelCorreo.setText("Correo:");

        labelTlfn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelTlfn.setForeground(new java.awt.Color(4, 3, 12));
        labelTlfn.setText("Tlfn:");
        labelTlfn.setToolTipText("");

        textoDni.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoDni.setForeground(new java.awt.Color(4, 3, 12));
        textoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDniActionPerformed(evt);
            }
        });

        textoNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(4, 3, 12));

        textoApellido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoApellido.setForeground(new java.awt.Color(4, 3, 12));

        textoCorreo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoCorreo.setForeground(new java.awt.Color(4, 3, 12));

        textoTlfn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoTlfn.setForeground(new java.awt.Color(4, 3, 12));

        textoInfo.setEditable(false);
        textoInfo.setBackground(new java.awt.Color(0, 0, 0));
        textoInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoInfo.setForeground(java.awt.Color.black);
        textoInfo.setEnabled(false);
        jScrollPane1.setViewportView(textoInfo);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelTlfn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panelGALayout = new javax.swing.GroupLayout(panelGA);
        panelGA.setLayout(panelGALayout);
        panelGALayout.setHorizontalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGALayout.setVerticalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
        // Habilitar todos los componentes dentro del panelDatos
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(true);
        }
        opcion = 1; // Establecer la opción actual como 1 (Añadir)
        textoInfo.setText("Por favor, rellene todos los campos y dele a HACER GESTION"); // Actualizar texto informativo
        //Limpia todos los campos
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");
    }//GEN-LAST:event_aniadirActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed
        //Limpia todos los campos
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");
    }//GEN-LAST:event_borrarCamposActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        PrincipalJFrame principal = new PrincipalJFrame(); // Crear una instancia del JFrame PrincipalJFrame
        principal.setVisible(true); // Hacer visible el JFrame PrincipalJFrame
        this.dispose(); // Cerrar el JFrame actual (GestionAlumnos)
    }//GEN-LAST:event_volverActionPerformed

    private void textoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDniActionPerformed

    }//GEN-LAST:event_textoDniActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String dni = "0";
        switch (opcion) {
            case 1:
                // Opción Añadir
                if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                    textoInfo.setText("Por favor, introduzca DNI válido, 8 num y 1 letra");
                } else if (bd.buscar(textoDni.getText().toUpperCase().trim(), "Alumnos", "dni")) {
                    textoInfo.setText("DNI registrado, por favor, introduzca uno nuevo");
                } else if (textoNombre.getText().trim().toUpperCase().equals("")) {
                    textoInfo.setText("Por favor, introduzca Nombre válido");
                } else if (textoApellido.getText().trim().toUpperCase().equals("")) {
                    textoInfo.setText("Por favor, introduzca Apellido válido");
                } else if (!util.validarCorreo(textoCorreo.getText().trim().toUpperCase())) {
                    textoInfo.setText("Por favor, introduzca Correo válido, debe tener @");
                } else if (!util.validarTelefono(textoTlfn.getText().trim().toUpperCase())) {
                    textoInfo.setText("Por favor, introduzca Teléfono válido, 9 dígitos");
                } else {
                    // Insertar alumno en la base de datos
                    bd.insertarAlumno(
                            textoDni.getText().trim().toUpperCase(),
                            textoNombre.getText().trim().toUpperCase(),
                            textoApellido.getText().trim().toUpperCase(),
                            textoCorreo.getText().trim().toUpperCase(),
                            textoTlfn.getText().trim().toUpperCase()
                    );
                    textoInfo.setText("Se ha añadido el Alumno Correctamente");

                    // Deshabilitar los componentes del panelDatos
                    for (Component component : panelDatos.getComponents()) {
                        component.setEnabled(false);
                    }

                    opcion = 0; // Establecer la opción actual como 0 (Cuando entras)
                    textoInfo.setText("REGISTRO NUEVO ALUMNO REALIZADO.\nSelecciona una opción, NUEVO, BORRAR O MODIFICAR");
                    // Limpia los campos
                    textoDni.setText("");
                    textoNombre.setText("");
                    textoApellido.setText("");
                    textoCorreo.setText("");
                    textoTlfn.setText("");
                }
                break;
            case 2:
                // Opción Borrar
                textoInfo.setText("Por favor, Introduzca un DNI registrado");
                if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                    textoInfo.setText("Por favor, introduzca DNI válido, 8 num y 1 letra y pulse REALIZAR GESTION");
                } else if (!bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {
                    textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado y pulse REALIZAR GESTION");
                } else {
                    // PANEL DE CONFIRMACION
                    int n = JOptionPane.showConfirmDialog(
                            this,
                            "Se borraran tambien las inscripciones del alumno.\n¿Estas seguro de querer borrar?",
                            "Confirmación de borrado",
                            JOptionPane.YES_NO_OPTION);
                    // SI SE CONFIRMA
                    if (n == JOptionPane.OK_OPTION) {
                        // Borrar alumno de la base de datos
                        bd.borrarInscripciones(textoDni.getText().trim().toUpperCase(), "TODO");
                        bd.borrarAlumno(textoDni.getText().trim().toUpperCase());
                        textoInfo.setText("ELIMINADO " + textoDni.getText().trim().toUpperCase());
                        // Limpia los campos
                        textoDni.setText("");
                        textoNombre.setText("");
                        textoApellido.setText("");
                        textoCorreo.setText("");
                        textoTlfn.setText("");
                        opcion = 0;
                        // SI NO SE CONFIRMA
                    } else {
                        textoInfo.setText("No se ha eliminado ningún alumno, Pulse HACER GESTION para confirmar o seleccione otra opcion");
                    }
                }
                break;
            case 3:
                // Opción Modificar
                if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                    textoInfo.setText("Por favor, introduzca DNI válido, 8 num y 1 letra y pulse REALIZAR GESTION");
                } else if (bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {
                    textoInfo.setText("Alumno encontrado\nRellene los datos que quieras modificar, nada = dejarlo igual\nEntonces pulsa HACER GESTION");

                    // Habilitar los componentes del panelDatos
                    for (Component component : panelDatos.getComponents()) {
                        component.setEnabled(true);
                    }
                    textoDni.setEnabled(false);
                    labelDni.setEnabled(false);

                    opcion = 4; // Establecer la opción actual como 4 (Modificar)
                } else {
                    textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado y pulse REALIZAR GESTION");
                }
                break;
            case 4:
                // PANEL DE CONFIRMACION
                int n = JOptionPane.showConfirmDialog(
                        this,
                        "¿Estas seguro de querer Modificar??",
                        "Confirmación de Modificacion",
                        JOptionPane.YES_NO_OPTION);
                // SI SE CONFIRMA
                if (n == JOptionPane.OK_OPTION) {
                    // Opción Modificar (confirmación)
                    String texto = "Alumno con DNI: " + textoDni.getText().trim().toUpperCase() + "\n";
                    textoInfo.setText("");
                    // Se comprueba cada uno de los campos rellenables, 
                    //1º si está vacío no hace nada 
                    //2ª Si hay algo realiza las comprobaciones, como si el tipo de variable es correcta.
                    //3ª Tambien determina si la clave esta dentro de la BD
                    //Se comprueba Nombre
                    if (!textoNombre.getText().equals("")) {
                        if (bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "DNI")) {
                            bd.modificar(textoDni.getText().trim().toUpperCase(), "dni", "ALUMNOS", "nombre", textoNombre.getText().trim().toUpperCase());
                            texto = texto + "Se ha cambiado el nombre, nuevo nombre: " + textoNombre.getText().trim().toUpperCase() + "\n";
                        } else {
                            textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
                        }
                    } else {
                        texto = texto + "No se ha cambiado el nombre\n";
                    }
                    //Se comprueba Apellido
                    if (!textoApellido.getText().equals("")) {
                        if (bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "DNI")) {
                            bd.modificar(textoDni.getText().trim().toUpperCase(), "dni", "ALUMNOS", "apellido", textoApellido.getText().trim().toUpperCase());
                            texto = texto + "Se ha cambiado el apellido, nuevo apellido: " + textoApellido.getText().trim().toUpperCase() + "\n";
                        } else {
                            textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
                        }
                    } else {
                        texto = texto + "No se ha cambiado el apellido\n";
                    }
                    //Se comprueba Correo
                    if (util.validarCorreo(textoCorreo.getText().trim().toUpperCase())) {
                        if (bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "DNI")) {
                            bd.modificar(textoDni.getText().trim().toUpperCase(), "dni", "ALUMNOS", "correo", textoCorreo.getText().trim().toUpperCase());
                            texto = texto + "Se ha cambiado el correo, nuevo correo: " + textoCorreo.getText().trim().toUpperCase() + "\n";
                        } else {
                            textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
                        }
                    } else {
                        texto = texto + "No se ha cambiado el correo\n";
                    }
                    //Se comprueba Telefono
                    if (util.validarTelefono(textoTlfn.getText().trim().toUpperCase())) {
                        if (bd.buscar(textoDni.getText().trim().toUpperCase(), "ALUMNOS", "DNI")) {
                            bd.modificar(textoDni.getText().trim().toUpperCase(), "dni", "ALUMNOS", "telefono", textoTlfn.getText().trim().toUpperCase());
                            texto = texto + "Se ha cambiado el nombre, nuevo nombre: " + textoTlfn.getText().trim().toUpperCase();
                        } else {
                            textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
                        }
                    } else {
                        texto = texto + "No se ha cambiado el telefono\n";
                    }
                    textoInfo.setText(texto);
                }
                break;

            default:
                textoInfo.setText("Por favor, Selecciona una opcion, NUEVO, BORRAR O MODIFICAR");
                break;
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        //Se limpian los campos
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");

        //Se desabilitan los campos
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        textoInfo.setText("Ponga el DNI para BORRAR el alumno y pulse HACER GESTION");
        //Se habilitan los campos especificos
        textoDni.setEnabled(true);
        labelDni.setEnabled(true);
        opcion = 2;

    }//GEN-LAST:event_borrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        //Se limpian los campos
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");
        //Se desabilitan los campos
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }
        //Se habilitan los campos especificos
        textoDni.setEnabled(true);
        labelDni.setEnabled(true);
        textoInfo.setText("Ponga el DNI para modificar el alumno y pulse HACER GESTION");
        opcion = 3;
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aniadir;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTlfn;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEleccion;
    public javax.swing.JPanel panelGA;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextPane textoInfo;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTlfn;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
