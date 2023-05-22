package adrian_sergio_practica_3ertri_programacion;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 * Clase donde se gestionan las listas de los alumnos y los cursos en la
 * interfaz grafica
 *
 */
public class ListaCursosYAlumnos extends javax.swing.JFrame {

    GestionesDeBD bd = new GestionesDeBD();
    Utiles util = new Utiles();

    public ListaCursosYAlumnos() {
        initComponents();
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInfo = new javax.swing.JTextPane();
        panelDatos = new javax.swing.JPanel();
        panelAlumno = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cajaListaAlumnos = new javax.swing.JList<>();
        buscarAlumnoInsertado = new javax.swing.JButton();
        textoAlumnos = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        buscarTodos = new javax.swing.JButton();
        panelCurso = new javax.swing.JPanel();
        labelDni = new javax.swing.JLabel();
        buscarCursoInsertado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaListaCursos = new javax.swing.JList<>();
        textoCurso = new javax.swing.JTextField();
        mostrarTodosC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        volver = new javax.swing.JButton();
        borrarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("LISTA ALUMNOS Y CURSOS");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfo.setBackground(new java.awt.Color(4, 3, 12));
        panelInfo.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        panelInfo.setDisabledTextColor(new java.awt.Color(222, 222, 222));
        panelInfo.setEnabled(false);
        jScrollPane1.setViewportView(panelInfo);

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelEleccionLayout.setVerticalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.setBackground(new java.awt.Color(202, 199, 215));

        panelAlumno.setBackground(new java.awt.Color(202, 199, 215));

        cajaListaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaListaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cajaListaAlumnos);

        buscarAlumnoInsertado.setText("BUSCAR DNI INSERTADO");
        buscarAlumnoInsertado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlumnoInsertadoActionPerformed(evt);
            }
        });

        textoAlumnos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoAlumnos.setForeground(new java.awt.Color(4, 3, 12));
        textoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAlumnosActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(4, 3, 12));
        labelNombre.setText("DNI de Alumno:");

        buscarTodos.setText("MOSTRAR TODOS");
        buscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlumnoLayout = new javax.swing.GroupLayout(panelAlumno);
        panelAlumno.setLayout(panelAlumnoLayout);
        panelAlumnoLayout.setHorizontalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarAlumnoInsertado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buscarTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAlumnoLayout.setVerticalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarAlumnoInsertado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarTodos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelCurso.setBackground(new java.awt.Color(202, 199, 215));

        labelDni.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelDni.setForeground(new java.awt.Color(4, 3, 12));
        labelDni.setText("Nombre de curso:");

        buscarCursoInsertado.setText("BUSCAR CURSO INSERTADO");
        buscarCursoInsertado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCursoInsertadoActionPerformed(evt);
            }
        });

        cajaListaCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaListaCursosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cajaListaCursos);

        textoCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoCurso.setForeground(new java.awt.Color(4, 3, 12));
        textoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCursoActionPerformed(evt);
            }
        });

        mostrarTodosC.setText("MOSTRAR TODOS");
        mostrarTodosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodosCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCursoLayout = new javax.swing.GroupLayout(panelCurso);
        panelCurso.setLayout(panelCursoLayout);
        panelCursoLayout.setHorizontalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursoLayout.createSequentialGroup()
                                .addComponent(labelDni)
                                .addGap(93, 93, 93))
                            .addGroup(panelCursoLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(panelCursoLayout.createSequentialGroup()
                        .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCursoLayout.createSequentialGroup()
                        .addComponent(buscarCursoInsertado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursoLayout.createSequentialGroup()
                        .addComponent(mostrarTodosC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        panelCursoLayout.setVerticalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCursoLayout.createSequentialGroup()
                .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCursoInsertado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTodosC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURSO", "ALUMNO", "NOTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaMostrar);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(panelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(borrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed

        textoCurso.setText("");
        textoAlumnos.setText("");
        DefaultListModel<String> modelo = new DefaultListModel<>();
        cajaListaCursos.setModel(modelo);
        modelo.clear();
        DefaultListModel<String> modelo1 = new DefaultListModel<>();
        cajaListaAlumnos.setModel(modelo1);
        modelo1.clear();
        DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();
        tabla.setRowCount(0);


    }//GEN-LAST:event_borrarCamposActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        PrincipalJFrame principal = new PrincipalJFrame();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void cajaListaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaListaAlumnosMouseClicked
        GestionesDeBD ge = new GestionesDeBD();
        String dato = "";
        javax.swing.JList<String> list = (javax.swing.JList) evt.getSource();
        javax.swing.ListModel<String> model = list.getModel();

        if (model != null && model.getSize() > 0) {// Si detecta click(1 click)

            int index = list.locationToIndex(evt.getPoint());//Extraemos la posicion del elemento seleccionado
            String item = list.getModel().getElementAt(index);
            //Extraemos el nombre
            String campos[] = item.split(": ");
            if (campos[0].equals("dni")) {
                String camposAux[] = campos[1].split("nombre");
                dato = camposAux[0].trim();
            }

            if (dato.length() == 9 && !textoAlumnos.getText().equals(dato)) {
                textoAlumnos.setText(dato);
            }

        }
    }//GEN-LAST:event_cajaListaAlumnosMouseClicked

    private void buscarAlumnoInsertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlumnoInsertadoActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();
        String[] datosAlumno = new String[0];
        String[] cursosAlumno = new String[0];
        String[] cursosAlumnoNotas = new String[0];
        String[] listaImprimir;
        String imprimir = "";
        if (!util.validarDNI(textoAlumnos.getText().trim().toUpperCase())) {
            System.out.println("Aqui llego");
            panelInfo.setText("Por favor, introduzca un DNI valido 8 numeros y una letra");
        } else if (!bd.buscar(textoAlumnos.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {
            panelInfo.setText("DNI no encontrado, por favor, introduzca uno registrado");
        } else {
            if (bd.buscar(textoAlumnos.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {

                datosAlumno = bd.imprimir(textoAlumnos.getText().trim().toUpperCase(), "Alumnos", "dni", "");
                cursosAlumno = bd.imprimir(textoAlumnos.getText().trim().toUpperCase(), "Inscripciones", "dniAlumno", "nombreCurso");
                cursosAlumnoNotas = bd.imprimir(textoAlumnos.getText().trim().toUpperCase(), "Inscripciones", "dniAlumno", "calificacion");
                panelInfo.setText("ALUMNO ENCONTRADO");

            }

            listaImprimir = new String[datosAlumno.length + cursosAlumno.length + 1];
            listaImprimir[0] = datosAlumno[0];
            if (cursosAlumno.length != 0) {
                tabla.setRowCount(0);
                String nomCurso = "";
                int i = 0;
                for (String curso : cursosAlumno) {
                    int indice = curso.indexOf(":");
                    nomCurso = curso.substring(indice + 1).trim();
                    Object[] fila = new Object[3];
                    fila[1] = textoAlumnos.getText().trim().toUpperCase();
                    fila[0] = nomCurso;

                    fila[2] = cursosAlumnoNotas[i];
                    tabla.addRow(fila);
                    i++;
                }
            } else {
                panelInfo.setText("El alumno no tiene cursos");
            }
            cajaListaAlumnos.setListData(listaImprimir);

        }

    }//GEN-LAST:event_buscarAlumnoInsertadoActionPerformed

    private void textoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAlumnosActionPerformed

    private void buscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodosActionPerformed
        // TODO add your handling code here:
        String[] datosAlumnoDni;
        String[] datosAlumnoNombre;

        datosAlumnoDni = bd.imprimir("*", "ALUMNOS", "DNI", "dni");
        datosAlumnoNombre = bd.imprimir("*", "ALUMNOS", "DNI", "nombre");
        String[] datosAlumno = new String[datosAlumnoDni.length];
        for (int i = 0; i < datosAlumnoDni.length; i++) {
            datosAlumno[i] = datosAlumnoDni[i] + datosAlumnoNombre[i];
        }
        cajaListaAlumnos.setListData(datosAlumno);
        textoAlumnos.setText("");
        panelInfo.setText("Si pulsas en uno se rellena el campo DNI de Alumno automaticamente\ny si buscas el DNI insertado tendras detalles del alumno");
    }//GEN-LAST:event_buscarTodosActionPerformed

    private void mostrarTodosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosCActionPerformed
        String[] datosCursoNombre;
        String[] datosDescripcion;

        datosCursoNombre = bd.imprimir("*", "Cursos", "Nombre", "Nombre");
        datosDescripcion = bd.imprimir("*", "Cursos", "Nombre", "Descripcion");
        String[] datos = new String[datosCursoNombre.length];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = datosCursoNombre[i] + datosDescripcion[i];
        }
        cajaListaCursos.setListData(datos);
        textoAlumnos.setText("");
        panelInfo.setText("Si pulsas en uno se rellena el campo NOMBRE de Curso automaticamente\ny si buscas el NOMBRE insertado tendras detalles del curso");
    }//GEN-LAST:event_mostrarTodosCActionPerformed

    private void buscarCursoInsertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCursoInsertadoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();
        String[] datosCursos = new String[1];
        String[] cursosAlumno = new String[0];
        String[] cursosAlumnoNotas = new String[0];
        String[] listaImprimir;
        if (!util.validarLongitud(textoCurso.getText().trim().toUpperCase(), 1)) {
            panelInfo.setText("Por favor, introduzca un curso que tenga al menos un caracter");
        } else if (!bd.buscar(textoCurso.getText().trim().toUpperCase(), "cursos", "Nombre")) {
            panelInfo.setText("Curso no encontrado, por favor, introduzca uno registrado");
        } else {
            if (bd.buscar(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE")) {

                datosCursos = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE", "");
                cursosAlumno = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "Inscripciones", "nombreCurso", "dniAlumno");
                cursosAlumnoNotas = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "Inscripciones", "nombreCurso", "calificacion");
                panelInfo.setText("CURSO ENCONTRADO");

            }

            listaImprimir = new String[datosCursos.length + cursosAlumno.length + 1];
            listaImprimir[0] = datosCursos[0];

            if (cursosAlumno.length != 0) {
                tabla.setRowCount(0);
                String dniAlumno = "";
                int i = 0;
                for (String curso : cursosAlumno) {
                    int indice = curso.indexOf(":");
                    dniAlumno = curso.substring(indice + 1).trim();
                    Object[] fila = new Object[3];
                    fila[0] = textoCurso.getText().trim().toUpperCase();
                    fila[1] = dniAlumno;

                    fila[2] = cursosAlumnoNotas[i];
                    tabla.addRow(fila);
                    i++;
                }
            } else {
                panelInfo.setText("El Curso no tiene alumnos");
            }
            cajaListaCursos.setListData(datosCursos);

        }
    }//GEN-LAST:event_buscarCursoInsertadoActionPerformed

    private void textoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCursoActionPerformed

    private void cajaListaCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaListaCursosMouseClicked
        GestionesDeBD ge = new GestionesDeBD();

        javax.swing.JList<String> list = (javax.swing.JList) evt.getSource();
        javax.swing.ListModel<String> model = list.getModel();

        if (model != null && model.getSize() > 0) {// Si detecta click(1 click)

            int index = list.locationToIndex(evt.getPoint());//Extraemos la posicion del elemento seleccionado
            String texto = list.getModel().getElementAt(index);
            //Extraemos el nombre
            int indiceInicio = texto.indexOf(":"); // Encuentra la posición del ":"
            int indiceFin = texto.indexOf("Descripcion"); // Encuentra la posición de "NumeroHoras"

            String nombre = "";

            if (indiceInicio != -1 && indiceFin != -1) { // Verifica si se encontró el ":" y "NumeroHoras"
                nombre = texto.substring(indiceInicio + 1, indiceFin).trim(); // Obtiene el contenido entre ":" y "NumeroHoras" y se asigna a la variable "nombre"
                textoCurso.setText(nombre);
            }

        }
    }//GEN-LAST:event_cajaListaCursosMouseClicked

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
            java.util.logging.Logger.getLogger(ListaCursosYAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCursosYAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCursosYAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCursosYAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarCampos;
    private javax.swing.JButton buscarAlumnoInsertado;
    private javax.swing.JButton buscarCursoInsertado;
    private javax.swing.JButton buscarTodos;
    private javax.swing.JList<String> cajaListaAlumnos;
    private javax.swing.JList<String> cajaListaCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JButton mostrarTodosC;
    private javax.swing.JPanel panelAlumno;
    private javax.swing.JPanel panelCurso;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEleccion;
    private javax.swing.JTextPane panelInfo;
    private javax.swing.JTable tablaMostrar;
    private javax.swing.JTextField textoAlumnos;
    private javax.swing.JTextField textoCurso;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
