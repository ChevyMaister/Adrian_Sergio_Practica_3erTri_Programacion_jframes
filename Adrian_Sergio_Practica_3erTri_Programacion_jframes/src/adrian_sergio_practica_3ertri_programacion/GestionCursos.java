package adrian_sergio_practica_3ertri_programacion;

import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class GestionCursos extends javax.swing.JFrame {

    String auxNombre = "";
    GestionesDeBD tablaCursos = new GestionesDeBD();
    HashMap<String, Alumno> listaAlumnos;
    HashMap<String, Curso> listaCursos = new HashMap();
    Utiles util = new Utiles();
    private int opcion = 0; //opcion 0 Cuando entras Opcion 1 Cuando Añades Opcion 2 Cuando Borras, Opcion 3 Cuando modificas

    //Constructor
    public GestionCursos() {
        this.listaCursos = new HashMap();
        initComponents();
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        textoInfo.setText("Selecciona una opcion, NUEVO, BORRAR O MODIFICAR");
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        borrarCampos = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        labelNombreC = new javax.swing.JLabel();
        labelDes = new javax.swing.JLabel();
        labelNumH = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        textoDesc = new javax.swing.JTextField();
        NumH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextPane();
        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aniadir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        labelNombreC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelNombreC.setForeground(new java.awt.Color(4, 3, 12));
        labelNombreC.setText("Nombre");

        labelDes.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelDes.setForeground(new java.awt.Color(4, 3, 12));
        labelDes.setText("Descripcion");

        labelNumH.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelNumH.setForeground(new java.awt.Color(4, 3, 12));
        labelNumH.setText("Numero de horas");

        Nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(4, 3, 12));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        textoDesc.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoDesc.setForeground(new java.awt.Color(4, 3, 12));

        NumH.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NumH.setForeground(new java.awt.Color(4, 3, 12));

        textoInfo.setBackground(new java.awt.Color(0, 0, 0));
        textoInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoInfo.setForeground(new java.awt.Color(4, 3, 12));
        textoInfo.setEnabled(false);
        jScrollPane1.setViewportView(textoInfo);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNombreC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumH, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NumH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(55, 55, 55)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("GESTION DE CURSOS");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        aniadir.setBackground(new java.awt.Color(4, 3, 12));
        aniadir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        aniadir.setForeground(new java.awt.Color(244, 237, 113));
        aniadir.setText("<html><p>&nbsp;&nbsp;NUEVO</p><p>&nbsp;&nbsp;CURSO</p></html>");
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
        borrar.setText("<html><p>&nbsp;BORRAR</p><p>&nbsp;&nbsp;CURSO</p></html>");
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
        modificar.setText("<html><p>&nbsp;MODIFICAR</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CURSO</p></html>");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

        switch (opcion) {
            case 1://CREAR

                if (!util.validarLongitud(Nombre.getText().trim(), 1)) {
                    textoInfo.setText("Por favor, introduzca Nombre valido");
                } else if (!util.validarLongitud(textoDesc.getText().trim(), 5)) {
                    textoInfo.setText("Por favor, introduzca una descripcion de 5 caracteres minimo");
                } else if (!util.esNumeroC(NumH.getText().trim())) {

                    textoInfo.setText("Debe ser un numero mayor que 0 ");

                } else if (tablaCursos.buscar(Nombre.getText().trim(), "CURSOS", "Nombre")) {
                    textoInfo.setText("El Curso con el nombre " + Nombre.getText().trim().toUpperCase() + " ya existe");
                } else {
                    //listaCursos.put(Nombre.getText().trim().toUpperCase(), new Curso(Nombre.getText().trim().toUpperCase(), textoDesc.getText().trim().toUpperCase(), Integer.parseInt(NumH.getText().trim())));
                    tablaCursos.insertarCurso(Nombre.getText().trim().toUpperCase(), textoDesc.getText().trim().toUpperCase(), NumH.getText().trim().toUpperCase());
                    textoInfo.setText("Se ha añadido el Curso Correctamente");
                    for (Curso curso : listaCursos.values()) {
                        System.out.println(curso.getNombre());
                    }
                    for (Component component : panelDatos.getComponents()) {
                        component.setEnabled(false);
                    }
                    opcion = 0;
                    textoInfo.setText("REGISTRO NUEVO Curso REALIZADO.\nSelecciona una opcion, NUEVO, BORRAR O MODIFICAR");
                    Nombre.setText("");
                    textoDesc.setText("");
                    NumH.setText("");
                    System.out.println(listaCursos);
                }
                break;
            case 2://BORRAR
                textoInfo.setText("Por favor, Introduzca un nombre de curso registrado");
                if (!util.validarLongitud(Nombre.getText().trim().toUpperCase(), 1)) {
                    textoInfo.setText("Por favor, introduzca nombre valido , minimo una letra");
                } else if (!tablaCursos.buscar(Nombre.getText().trim().toUpperCase(), "CURSOS", "Nombre")) {
                    textoInfo.setText("Nombre no encontrado, por favor, introduzca uno registrado");
                } else {
                    int n = JOptionPane.showConfirmDialog(
                            this,
                            " Estas seguro de querer borrar el curso " + Nombre.getText().trim().toUpperCase() + " ?",
                            "Confirmación",
                            JOptionPane.YES_NO_OPTION);
                    if (n == JOptionPane.OK_OPTION) {
                        tablaCursos.borrarCurso(Nombre.getText().trim().toUpperCase());
                        tablaCursos.borrarInscripciones("", Nombre.getText().trim().toUpperCase());
                        textoInfo.setText("Curso Eliminado");
                    } else {
                        textoInfo.setText("El curso no ha sido eliminado");
                    }

                }
                break;
            case 3://HACER MODIFICAR CURSOS

                if (!util.validarLongitud(Nombre.getText().trim(), 1)) {
                    textoInfo.setText("Por favor, introduzca nombre valido , minimo 1 letra");
                } else if (tablaCursos.buscar(Nombre.getText().trim().toUpperCase(), "CURSOS", "Nombre")) {
                    textoInfo.setText("Curso encontrado ");

                    auxNombre = Nombre.getText().trim().toUpperCase();

                    for (Component component : panelDatos.getComponents()) {
                        component.setEnabled(true);
                    }
                    Nombre.setEnabled(false);
                    labelNombreC.setEnabled(false);

                    opcion = 4; // Establecer la opción actual como 4 (Modificar)
                } else {
                    textoInfo.setText("Nombre no encontrado, por favor, introduzca uno registrado y pulse REALIZAR GESTION");
                }

                break;
            case 4:
                String texto = "En el curso: " + auxNombre + "\n";
                textoInfo.setText("");
                // Se comprueba cada uno de los campos rellenables, 
                //1º si está vacío no hace nada 
                //2ª Si hay algo realiza las comprobaciones, como si el tipo de variable es correcta.
                //3ª Tambien determina si la clave esta dentro de la BD
                //Se comprueba Nombre
                if (!textoDesc.getText().equals("")) {
                    if (util.validarLongitud(textoDesc.getText().trim(), 5)) {
                        int dec = JOptionPane.showConfirmDialog(
                                this,
                                "Seguro que quieres cambiar la descripcion de " + auxNombre,
                                "Confirmación",
                                JOptionPane.YES_NO_OPTION);
                        if (dec == JOptionPane.OK_OPTION) {
                            tablaCursos.modificar(auxNombre, "nombre", "Cursos", "descripcion", textoDesc.getText().trim().toUpperCase());
                            texto = texto + " Se ha modificado la descripcion por " + textoDesc.getText().trim().toUpperCase() + "\n";
                        } else {
                            texto = texto + "No se ha modificado la descripcion " + "\n";
                        }
                    } else {
                        texto = texto + "No se ha modificado la descripcion (5 caracteres minimo) " + "\n";
                    }
                } else {

                    texto = texto + "No se ha modificado la descripcion " + "\n";
                }

                textoInfo.setText("Por favor, Selecciona una opcion, NUEVO, BORRAR O MODIFICAR");

                if (!NumH.getText().equals("")) {
                    if (util.esNumeroC(NumH.getText().trim())) {
                        int dec2 = JOptionPane.showConfirmDialog(
                                this,
                                "Seguro que quieres cambiar las horas de " + auxNombre,
                                "Confirmación",
                                JOptionPane.YES_NO_OPTION);
                        if (dec2 == JOptionPane.OK_OPTION) {
                            tablaCursos.modificar(auxNombre, "nombre", "Cursos", "numeroHoras", NumH.getText().trim().toUpperCase());
                            texto = texto + "Se ha modificado correctamente las horas a " + NumH.getText().trim().toUpperCase() + "\n";
                        } else {
                            texto = texto + "No se ha modificado las horas" + "\n";
                        }
                    } else {
                        texto = texto + "No se ha modificado las horas (mayor  0) " + "\n";
                    }
                } else {
                    texto = texto + "No se ha modificado las horas" + "\n";
                }
                textoInfo.setText(texto);
                textoDesc.setText("");
                NumH.setText("");
                break;
            default:
                textoInfo.setText("Por favor, Selecciona una opcion, NUEVO, BORRAR O MODIFICAR");
                break;
        }

    }//GEN-LAST:event_aceptarActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed

        Nombre.setText("");
        textoDesc.setText("");
        NumH.setText("");

    }//GEN-LAST:event_borrarCamposActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        PrincipalJFrame principal = new PrincipalJFrame();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(true);
        }
        opcion = 1;
        textoInfo.setText("Por favor, rellene todos los campos");
    }//GEN-LAST:event_aniadirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Nombre.setText("");
        textoDesc.setText("");
        NumH.setText("");

        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        textoInfo.setText("Ponga el Nombre para BORRAR el Curso y pulse HACER GESTION");
        Nombre.setEnabled(true);
        labelNombreC.setEnabled(true);

        opcion = 2;
    }//GEN-LAST:event_borrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Nombre.setText("");
        textoDesc.setText("");
        NumH.setText("");

        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(false);
        }

        Nombre.setEnabled(true);
        labelNombreC.setEnabled(true);
        textoInfo.setText("Ponga el nombre del curso para modificar y pulse HACER GESTION");
        if (!util.validarLongitud(Nombre.getText().trim(), 1)) {
            textoInfo.setText("Por favor, introduzca nombre valido , minimo 1 letra");
        } else if (!tablaCursos.buscar(Nombre.getText().trim().toUpperCase(), "CURSOS", "Nombre")) {
            textoInfo.setText("Curso no encontrado, por favor, introduzca uno registrado");
        } else {
            Nombre.setText("");
            auxNombre = Nombre.getText().trim();

        }
        opcion = 3;
    }//GEN-LAST:event_modificarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GestionCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NumH;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aniadir;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDes;
    private javax.swing.JLabel labelNombreC;
    private javax.swing.JLabel labelNumH;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEleccion;
    private javax.swing.JTextField textoDesc;
    private javax.swing.JTextPane textoInfo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public HashMap<String, Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(HashMap<String, Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void modificarCampos() {

        textoInfo.setText("Curso : " + auxNombre + " encontrado. " + "\n Rellena los campos que quieres cambiar, si alguno no quieres cambiarlo, dejalo en blanco");

        for (Component component : panelDatos.getComponents()) {
            component.setEnabled(true);
        }
        if (!Nombre.getText().trim().equalsIgnoreCase("")) {
            tablaCursos.modificarCurso(auxNombre, "Nombre", Nombre.getText().trim());

        } else {
        }
        if (!textoDesc.getText().trim().equalsIgnoreCase("")) {
            tablaCursos.modificarCurso(auxNombre, "Descripcion", textoDesc.getText().trim());

        } else {
        }
        if (!NumH.getText().trim().equalsIgnoreCase("")) {
            tablaCursos.modificarCurso(auxNombre, "NumeroHoras", NumH.getText().trim());

        } else {
        }
        Nombre.setText("");
        NumH.setText("");
        textoDesc.setText("");

    }

}
