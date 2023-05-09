/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.awt.Component;
import java.util.HashMap;

/**
 *
 * @author Chevy
 */
public class FicherosYBBDD extends javax.swing.JFrame {

    int opcion;
    HashMap<String,Alumno> listaAlumnos;
    HashMap<String,Curso> listaCursos;
    Utiles util= new Utiles();
    
    public FicherosYBBDD(HashMap<String,Alumno>listaAlumnos,HashMap<String,Curso> listaCursos) {
        this.listaAlumnos=listaAlumnos;
        this.listaCursos=listaCursos;
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
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("GESTION BBDD Y FICHEROS");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        textoInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoInfo.setForeground(new java.awt.Color(4, 3, 12));
        textoInfo.setEnabled(false);
        jScrollPane1.setViewportView(textoInfo);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelGALayout.setVerticalGroup(
            panelGALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGALayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGA, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
       
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(true);
        }
        int opcion = 1;
        textoInfo.setText("Por favor, rellene todos los campos");
    }//GEN-LAST:event_aniadirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");

        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        textoInfo.setText("Ponga el DNI para BORRAR el alumno y pulse HACER GESTION");
        textoDni.setEnabled(true);
        labelDni.setEnabled(true);

        opcion = 2;
    }//GEN-LAST:event_borrarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String dni = "0";
        switch (opcion) {
            case 1:

            if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("Por favor, introduzca DNI valido, 8 num y 1 letra");
            } else if (listaAlumnos.containsKey(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("DNI registrado, por favor, introduzca uno nuevo");
            } else if (textoNombre.getText().trim().toUpperCase().equals("")) {
                textoInfo.setText("Por favor, introduzca Nombre valido");
            } else if (textoApellido.getText().trim().toUpperCase().equals("")) {
                textoInfo.setText("Por favor, introduzca Apellido valido");
            } else if (!util.validarCorreo(textoCorreo.getText().trim().toUpperCase())) {
                textoInfo.setText("Por favor, introduzca Correo valido, debe tener @");
            } else if (!util.validarTelefono(textoTlfn.getText().trim().toUpperCase())) {
                textoInfo.setText("Por favor, introduzca Telefono valido, 9 digitos");
            } else {
                listaAlumnos.put(textoDni.getText().trim().toUpperCase(), new Alumno(textoDni.getText().trim().toUpperCase(), textoNombre.getText().trim().toUpperCase(), textoApellido.getText().trim().toUpperCase(), textoCorreo.getText().trim().toUpperCase(), textoTlfn.getText().trim().toUpperCase()));
                textoInfo.setText("Se ha añadido el Alumno Correctamente");
                for (Alumno alumno : listaAlumnos.values()) {
                    System.out.println(alumno.getNombre());
                }
                for (Component component : panelDatos.getComponents()) {
                    component.setEnabled(false);
                }

                opcion = 0;
                textoInfo.setText("REGISTRO NUEVO ALUMNO REALIZADO.\nSelecciona una opcion, NUEVO, BORRAR O MODIFICAR");
                textoDni.setText("");
                textoNombre.setText("");
                textoApellido.setText("");
                textoCorreo.setText("");
                textoTlfn.setText("");
                System.out.println(listaAlumnos);
            }
            break;
            case 2:
            textoInfo.setText("Por favor, Introduzca un DNI registrado");
            if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("Por favor, introduzca DNI valido, 8 num y 1 letra");
            } else if (!listaAlumnos.containsKey(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
            } else {
                textoInfo.setText("ELIMINADO " + listaAlumnos.get(textoDni.getText().trim().toUpperCase()));
                listaAlumnos.remove(textoDni.getText().trim().toUpperCase());
                System.out.println(listaAlumnos);
                opcion = 0;
            }
            break;
            case 3:
            if (!util.validarDNI(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("Por favor, introduzca DNI valido, 8 num y 1 letra");
            } else if (!listaAlumnos.containsKey(textoDni.getText().trim().toUpperCase())) {
                textoInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
            } else {
                textoInfo.setText("Alumno encontrado: " + listaAlumnos.get(textoDni.getText().trim().toUpperCase()).toString() + "\nRellena los campos que quieres cambiar, si alguno no quieres cambiarlo, dejalo en blanco");

                for (Component component : panelDatos.getComponents()) {
                    component.setEnabled(true);
                }
                textoDni.setEnabled(false);
                labelDni.setEnabled(false);
                System.out.println(listaAlumnos);
                opcion = 4;
            }
            break;
            case 4:
            String texto = "Alumno con DNI: " + dni + "\n";
            textoInfo.setText("");
            if (!textoNombre.getText().equals("")) {
                listaAlumnos.get(textoDni.getText().trim().toUpperCase()).setNombre(textoNombre.getText().trim().toUpperCase());
                texto = texto + "Nuevo Nombre: " + textoNombre.getText().trim().toUpperCase() + "\n";
            } else {
                texto = texto + "No se ha cambiado el nombre\n";
            }
            if (!textoApellido.getText().equals("")) {
                listaAlumnos.get(textoDni.getText().trim().toUpperCase()).setApellido(textoApellido.getText().trim().toUpperCase());
                texto = texto + "Nuevo Apellido: " + textoApellido.getText().trim().toUpperCase() + "\n";
            } else {
                texto = texto + "No se ha cambiado el apellido\n";
            }
            if (util.validarCorreo(textoCorreo.getText().trim().toUpperCase())) {
                listaAlumnos.get(textoDni.getText().trim().toUpperCase()).setCorreo(textoCorreo.getText().trim().toUpperCase());
                texto = texto + "Nuevo Correo: " + textoCorreo.getText().trim().toUpperCase() + "\n";
            } else {
                texto = texto + "No se ha cambiado el correo\n";
            }
            if (util.validarTelefono(textoTlfn.getText().trim().toUpperCase())) {
                listaAlumnos.get(textoDni.getText().trim().toUpperCase()).setTelefono(textoTlfn.getText().trim().toUpperCase());
                texto = texto + "Nuevo Telefono: " + textoTlfn.getText().trim().toUpperCase() + "\n";
            } else {
                texto = texto + "No se ha cambiado el telefono\n";
            }
            textoInfo.setText(texto);
            System.out.println(listaAlumnos);
            break;
            default:
            textoInfo.setText("Por favor, Selecciona una opcion, NUEVO, BORRAR O MODIFICAR");
            break;
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed

        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoCorreo.setText("");
        textoTlfn.setText("");
    }//GEN-LAST:event_borrarCamposActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        PrincipalJFrame principal = new PrincipalJFrame(listaAlumnos, listaCursos);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void textoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDniActionPerformed

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
            java.util.logging.Logger.getLogger(FicherosYBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FicherosYBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FicherosYBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FicherosYBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTlfn;
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
