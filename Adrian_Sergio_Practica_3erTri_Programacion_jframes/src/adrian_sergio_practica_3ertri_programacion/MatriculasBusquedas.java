package adrian_sergio_practica_3ertri_programacion;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * La clase MatriculasBusquedas, es un JFRAME donde se gestionan las busquedas y
 * las matriculas tanto de los cursos como de los alumnos
 */
public class MatriculasBusquedas extends javax.swing.JFrame {

    int opcion = 0;
    Utiles util = new Utiles();
    GestionesDeBD bd = new GestionesDeBD();
    String[] limpiar = new String[0];

    //Constructor
    public MatriculasBusquedas() {
        initComponents();
        JPanel panel = new JPanel();
        JScrollPane mover = new JScrollPane(panel);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mover);
        // Deshabilita los componentes en el panelAlumno y panelCurso
        for (Component component : panelAlumno.getComponents()) {
            component.setEnabled(false);
        }
        for (Component component : panelCurso.getComponents()) {
            component.setEnabled(false);
        }
        aceptar.setEnabled(false);

        panelInfo.setText("Por favor, SELECCIONE, BUSCAR CURSO, BUSCAR ALUMNO O MATRICULAR");

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        panelAlumno = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cajaListaAlumnos = new javax.swing.JList<>();
        buscarAlumnoInsertado = new javax.swing.JButton();
        textoAlumnos = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        buscarTodos = new javax.swing.JButton();
        panelCurso = new javax.swing.JPanel();
        buscarCursoInsertado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaListaCursos = new javax.swing.JList<>();
        textoCurso = new javax.swing.JTextField();
        mostrarTodosC = new javax.swing.JButton();
        labelDni = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        borrarCampos = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        panelEleccion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonBuscarCurso = new javax.swing.JButton();
        botonBuscarAlumno = new javax.swing.JButton();
        botonMatricular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInfo = new javax.swing.JTextPane();
        botonCalificar = new javax.swing.JButton();
        textoNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap()
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buscarAlumnoInsertado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textoAlumnos, javax.swing.GroupLayout.Alignment.LEADING)))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCurso.setBackground(new java.awt.Color(202, 199, 215));

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

        labelDni.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelDni.setForeground(new java.awt.Color(4, 3, 12));
        labelDni.setText("Nombre de curso:");

        javax.swing.GroupLayout panelCursoLayout = new javax.swing.GroupLayout(panelCurso);
        panelCurso.setLayout(panelCursoLayout);
        panelCursoLayout.setHorizontalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCursoLayout.createSequentialGroup()
                        .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarCursoInsertado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursoLayout.createSequentialGroup()
                        .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrarTodosC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCursoLayout.createSequentialGroup()
                                .addComponent(labelDni)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        panelCursoLayout.setVerticalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCursoInsertado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTodosC)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addComponent(panelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(borrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelEleccion.setBackground(new java.awt.Color(56, 49, 64));

        jPanel4.setBackground(new java.awt.Color(202, 199, 215));
        jPanel4.setForeground(new java.awt.Color(138, 134, 4));
        jPanel4.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(202, 199, 215));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 134, 4));
        jLabel1.setText("MATRICULAS Y BUSQUEDAS");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        botonBuscarCurso.setBackground(new java.awt.Color(4, 3, 12));
        botonBuscarCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonBuscarCurso.setForeground(new java.awt.Color(244, 237, 113));
        botonBuscarCurso.setText("BUSCAR CURSO");
        botonBuscarCurso.setPreferredSize(new java.awt.Dimension(140, 80));
        botonBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCursoActionPerformed(evt);
            }
        });

        botonBuscarAlumno.setBackground(new java.awt.Color(4, 3, 12));
        botonBuscarAlumno.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        botonBuscarAlumno.setForeground(new java.awt.Color(244, 237, 113));
        botonBuscarAlumno.setText("BUSCAR ALUMNO");
        botonBuscarAlumno.setActionCommand("<html><p>BORRAR</p><p> ALUMNO</p></html>");
        botonBuscarAlumno.setPreferredSize(new java.awt.Dimension(140, 80));
        botonBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAlumnoActionPerformed(evt);
            }
        });

        botonMatricular.setBackground(new java.awt.Color(4, 3, 12));
        botonMatricular.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonMatricular.setForeground(new java.awt.Color(244, 237, 113));
        botonMatricular.setText("MATRICULAR / DESMATRICULAR");
        botonMatricular.setPreferredSize(new java.awt.Dimension(140, 80));
        botonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatricularActionPerformed(evt);
            }
        });

        panelInfo.setBackground(new java.awt.Color(4, 3, 12));
        panelInfo.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        panelInfo.setDisabledTextColor(new java.awt.Color(222, 222, 222));
        panelInfo.setEnabled(false);
        jScrollPane1.setViewportView(panelInfo);

        botonCalificar.setBackground(new java.awt.Color(4, 3, 12));
        botonCalificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonCalificar.setForeground(new java.awt.Color(244, 237, 113));
        botonCalificar.setText("CALIFICAR");
        botonCalificar.setPreferredSize(new java.awt.Dimension(140, 80));
        botonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalificarActionPerformed(evt);
            }
        });

        textoNota.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoNota.setText("NOTA");

        javax.swing.GroupLayout panelEleccionLayout = new javax.swing.GroupLayout(panelEleccion);
        panelEleccion.setLayout(panelEleccionLayout);
        panelEleccionLayout.setHorizontalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(panelEleccionLayout.createSequentialGroup()
                        .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(botonBuscarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                                .addComponent(botonCalificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonBuscarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelEleccionLayout.setVerticalGroup(
            panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCursoActionPerformed

    private void buscarAlumnoInsertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlumnoInsertadoActionPerformed

        String[] datosAlumno = new String[0];
        String[] cursosAlumno = new String[0];
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

            }
            listaImprimir = new String[datosAlumno.length + cursosAlumno.length + 1];
            listaImprimir[0] = datosAlumno[0];
            if (cursosAlumno.length != 0) {
                for (int i = 0, j = 1; i < cursosAlumno.length; i++, j++) {
                    listaImprimir[j] = cursosAlumno[i];
                }
            } else {
                panelInfo.setText("EL ALUMNO NO ESTA MATRICULADO EN NINGUN CURSO");
            }

            cajaListaAlumnos.setListData(listaImprimir);

        }


    }//GEN-LAST:event_buscarAlumnoInsertadoActionPerformed

    private void textoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAlumnosActionPerformed

    private void buscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodosActionPerformed
        cajaListaAlumnos.setListData(limpiar);
        cajaListaCursos.setListData(limpiar);
        String[] datosAlumno;
        datosAlumno = bd.imprimir("*", "ALUMNOS", "DNI", "");
        cajaListaAlumnos.setListData(datosAlumno);
        textoAlumnos.setText("");
        panelInfo.setText("Si pulsas en uno se rellena el campo DNI automaticamente\ny si buscas el DNI insertado tendras detalles del alumno");
    }//GEN-LAST:event_buscarTodosActionPerformed

    private void mostrarTodosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosCActionPerformed
        cajaListaAlumnos.setListData(limpiar);
        cajaListaCursos.setListData(limpiar);

        String[] datosCurso;

        datosCurso = bd.imprimir("*", "Cursos", "Nombre", "");

        cajaListaCursos.setListData(datosCurso);
        textoAlumnos.setText("");
        panelInfo.setText("Si pulsas en uno se rellena el campo DNI automaticamente\ny si buscas el DNI insertado tendras detalles del alumno");
    }//GEN-LAST:event_mostrarTodosCActionPerformed

    private void buscarCursoInsertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCursoInsertadoActionPerformed
        // TODO add your handling code here:

        String[] datosCursos = new String[0];
        String[] cursosAlumno = new String[0];
        String[] listaImprimir;
        String imprimir = "";
        if (!util.validarLongitud(textoCurso.getText().trim().toUpperCase(), 1)) {
            panelInfo.setText("Por favor, introduzca un curso que tenga al menos un caracter");
        } else if (!bd.buscar(textoCurso.getText().trim().toUpperCase(), "cursos", "Nombre")) {
            panelInfo.setText("Curso no encontrado, por favor, introduzca uno registrado");
        } else {
            if (bd.buscar(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE")) {

                datosCursos = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE", "");
                cursosAlumno = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "Inscripciones", "nombreCurso", "dniAlumno");

            }
            listaImprimir = new String[datosCursos.length + cursosAlumno.length + 1];
            listaImprimir[0] = datosCursos[0];
            if (cursosAlumno.length != 0) {
                for (int i = 0, j = 1; i < cursosAlumno.length; i++, j++) {
                    listaImprimir[j] = cursosAlumno[i];
                }
            } else {
                panelInfo.setText("EL CURSO NO TIENE ALUMNOS MATRICULADOS");
            }
            cajaListaCursos.setListData(listaImprimir);

        }


    }//GEN-LAST:event_buscarCursoInsertadoActionPerformed

    private void cajaListaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaListaAlumnosMouseClicked
        GestionesDeBD ge = new GestionesDeBD();
        String dato = "";
        javax.swing.JList<String> list = (javax.swing.JList) evt.getSource();
        if (evt.getClickCount() == 1) {// Si detecta click(1 click)

            int index = list.locationToIndex(evt.getPoint());//Extraemos la posicion del elemento seleccionado
            String item = list.getModel().getElementAt(index);
            //Extraemos el nombre
            String campos[] = item.split(": ");
            if (campos[0].equals("dni")) {
                String camposAux[] = campos[1].split("Nombre");
                dato = camposAux[0].trim();
            }

            if (dato.length() == 9 && !textoAlumnos.getText().equals(dato)) {
                textoAlumnos.setText(dato);
            }

        }
    }//GEN-LAST:event_cajaListaAlumnosMouseClicked

    private void cajaListaCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaListaCursosMouseClicked
        GestionesDeBD ge = new GestionesDeBD();

        javax.swing.JList<String> list = (javax.swing.JList) evt.getSource();
        if (evt.getClickCount() == 1) {// Si detecta click(1 click)

            int index = list.locationToIndex(evt.getPoint());//Extraemos la posicion del elemento seleccionado
            String texto = list.getModel().getElementAt(index);
            //Extraemos el nombre
            int indiceInicio = texto.indexOf(":"); // Encuentra la posición del ":"
            int indiceFin = texto.indexOf("Descripcion"); // Encuentra la posición de "NumeroHoras"

            String nombre;

            if (indiceInicio != -1 && indiceFin != -1) { // Verifica si se encontró el ":" y "NumeroHoras"
                nombre = texto.substring(indiceInicio + 1, indiceFin).trim(); // Obtiene el contenido entre ":" y "NumeroHoras" y se asigna a la variable "nombre"
                textoCurso.setText(nombre);
            }

        }
    }//GEN-LAST:event_cajaListaCursosMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        PrincipalJFrame principal = new PrincipalJFrame();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed

        textoCurso.setText("");
        textoAlumnos.setText("");
    }//GEN-LAST:event_borrarCamposActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String[] datosAlumno;
        String[] datosCursos;
        boolean cursoEncontrado = false;
        boolean alumnoEncontrado = false;
        String nombreCurso = "";
        String dniAlumno = "";
        panelInfo.setText("");
        if (!util.validarLongitud(textoCurso.getText().trim().toUpperCase(), 1)) {
            System.out.println("Aqui llego");
            panelInfo.setText("Por favor, introduzca un curso que tenga al menos un caracter");
        } else if (!bd.buscar(textoCurso.getText().trim().toUpperCase(), "cursos", "Nombre")) {
            panelInfo.setText("Curso no encontrado, por favor, introduzca uno registrado");
        } else {
            if (bd.buscar(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE")) {

                datosCursos = bd.imprimir(textoCurso.getText().trim().toUpperCase(), "CURSOS", "NOMBRE", "");
                panelInfo.setText("CURSO ENCONTRADO");
                cajaListaCursos.setListData(datosCursos);

                int indiceInicio = datosCursos[0].indexOf(":") + 1;
                int indiceFin = datosCursos[0].indexOf("Descripcion", indiceInicio);

                if (indiceInicio != -1 && indiceFin != -1) {
                    nombreCurso = datosCursos[0].substring(indiceInicio, indiceFin).trim();
                    System.out.println("Encontrado " + nombreCurso);
                    cursoEncontrado = true;
                } else {
                    System.out.println("No se encontró ninguna palabra.");
                }
            }
        }

        if (!util.validarDNI(textoAlumnos.getText().trim().toUpperCase())) {
            System.out.println("Aqui llego");
            panelInfo.setText(panelInfo.getText() + " " + "Por favor, introduzca un DNI valido 8 numeros y una letra");
        } else if (!bd.buscar(textoAlumnos.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {
            panelInfo.setText(panelInfo.getText() + " " + "DNI no encontrado, por favor, introduzca uno registrado");
        } else {
            if (bd.buscar(textoAlumnos.getText().trim().toUpperCase(), "ALUMNOS", "dni")) {

                datosAlumno = bd.imprimir(textoAlumnos.getText().trim().toUpperCase(), "Alumnos", "dni", "");
                panelInfo.setText(panelInfo.getText() + " " + "ALUMNO ENCONTRADO");
                cajaListaAlumnos.setListData(datosAlumno);

                int indiceInicio = datosAlumno[0].indexOf(":") + 1;
                int indiceFin = datosAlumno[0].indexOf("Nombre", indiceInicio);

                if (indiceInicio != -1 && indiceFin != -1) {
                    dniAlumno = datosAlumno[0].substring(indiceInicio, indiceFin).trim();
                    System.out.println("Encontrado " + dniAlumno);
                    alumnoEncontrado = true;
                } else {
                    System.out.println("No se encontró ninguna palabra.");
                }
            }
        }
        if (opcion == 1) {//MATRICULAR/DESMATRICULAR
            if (!bd.existeMatricula("inscripciones", dniAlumno, nombreCurso)) {
                if (alumnoEncontrado && cursoEncontrado) {
                    bd.insertarInscripcion(nombreCurso, dniAlumno);
                    aceptar.setEnabled(false);
                    panelInfo.setText("Se realizó la inscripcion");
                }
            } else {
                panelInfo.setText("El Alumno ya está matriculado en el curso");
                // PANEL DE CONFIRMACION
                    int n = JOptionPane.showConfirmDialog(
                            this,
                            "Se desmatriculara el alumno del curso.\n¿Estas seguro de querer desmatricular?",
                            "Confirmación de borrado",
                            JOptionPane.YES_NO_OPTION);
                    // SI SE CONFIRMA
                    if (n == JOptionPane.OK_OPTION) {
                    bd.borrarInscripciones(dniAlumno, nombreCurso);
                    }
                    
            }
        } else if (opcion == 2) {//CALIFICAR
            if (bd.existeMatricula("inscripciones", dniAlumno, nombreCurso)) {
                float nota = util.esNotaValida(textoNota.getText().trim());
                if (nota != -1) {
                    bd.calificar(dniAlumno, nombreCurso, nota);
                    panelInfo.setText("Calificacion realizada");
                } else {
                    panelInfo.setText("Pon una nota valida, < o = que 10 y > o = que 0");
                }
            } else {
                panelInfo.setText("El Alumno no esta matriculado en el curso, selecciona una relacion valida");
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void botonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalificarActionPerformed
        cajaListaAlumnos.setListData(limpiar);
        cajaListaCursos.setListData(limpiar);
        textoCurso.setText("");
        textoAlumnos.setText("");
        String[] datosAlumno;
        String[] datosCurso;
        datosAlumno = bd.imprimir("*", "ALUMNOS", "DNI", "");
        datosCurso = bd.imprimir("*", "CURSOS", "NOMBRE", "");
        cajaListaAlumnos.setListData(datosAlumno);
        cajaListaCursos.setListData(datosCurso);
        for (Component component : panelCurso.getComponents()) {
            component.setEnabled(true);
        }

        for (Component component : panelAlumno.getComponents()) {
            component.setEnabled(true);
        }

        panelInfo.setText("Escriba el NOMBRE DE CURSO y DNI DE ALUMNO, o pinchelo de la lista\nSi busca un CURSO o un Alumno aparecerán los detalles del mismo\nPosteriormente ponga una nota del 1 al 10 y pulse HACER GESTION");

        opcion = 2;
        aceptar.setEnabled(true);
    }//GEN-LAST:event_botonCalificarActionPerformed

    private void botonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatricularActionPerformed

        textoCurso.setText("");
        textoAlumnos.setText("");
        for (Component component : panelCurso.getComponents()) {
            component.setEnabled(true);
        }

        for (Component component : panelAlumno.getComponents()) {
            component.setEnabled(true);
        }
        String[] datosAlumno;
        String[] datosCurso;
        datosAlumno = bd.imprimir("*", "ALUMNOS", "DNI", "");
        datosCurso = bd.imprimir("*", "CURSOS", "NOMBRE", "");
        cajaListaAlumnos.setListData(datosAlumno);
        cajaListaCursos.setListData(datosCurso);
        textoAlumnos.setText("");
        panelInfo.setText("Rellene NOMBRE DE CURSO, DNI DE ALUMNO o pulse sobre la opcion de la lista que desee y pulse HACER GESTION\nSi selecciona Alumno y Curso donde Esta matriculado se Desmatriculara");

        opcion = 1;
        aceptar.setEnabled(true);
    }//GEN-LAST:event_botonMatricularActionPerformed

    private void botonBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAlumnoActionPerformed
        cajaListaAlumnos.setListData(limpiar);
        cajaListaCursos.setListData(limpiar);
        textoCurso.setText("");
        textoAlumnos.setText("");
        for (Component component : panelCurso.getComponents()) {
            component.setEnabled(false);
        }

        for (Component component : panelAlumno.getComponents()) {
            component.setEnabled(true);
        }
        panelInfo.setText("Ponga el DNI del Alumno y pulse Buscar DNI insertado para ver los detalles del alumno (Cursos inscritos)\nO pulse mostrar todos para ver todos los alumnos ");

        opcion = 2;
    }//GEN-LAST:event_botonBuscarAlumnoActionPerformed

    private void botonBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCursoActionPerformed
        cajaListaAlumnos.setListData(limpiar);
        cajaListaCursos.setListData(limpiar);
        textoCurso.setText("");
        textoAlumnos.setText("");

        for (Component component : panelAlumno.getComponents()) {
            component.setEnabled(false);
        }
        for (Component component : panelCurso.getComponents()) {
            component.setEnabled(true);
        }
        panelInfo.setText("Ponga el NOMBRE del Curso y pulse Buscar Curso insertado para ver los detalles del Curso (Alumnos inscritos)\nO pulse mostrar todos para ver todos los Cursos ");
        opcion = 1;
    }//GEN-LAST:event_botonBuscarCursoActionPerformed

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
            java.util.logging.Logger.getLogger(MatriculasBusquedas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculasBusquedas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculasBusquedas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculasBusquedas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton borrarCampos;
    private javax.swing.JButton botonBuscarAlumno;
    private javax.swing.JButton botonBuscarCurso;
    private javax.swing.JButton botonCalificar;
    private javax.swing.JButton botonMatricular;
    private javax.swing.JButton buscarAlumnoInsertado;
    private javax.swing.JButton buscarCursoInsertado;
    private javax.swing.JButton buscarTodos;
    private javax.swing.JList<String> cajaListaAlumnos;
    private javax.swing.JList<String> cajaListaCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JButton mostrarTodosC;
    private javax.swing.JPanel panelAlumno;
    private javax.swing.JPanel panelCurso;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEleccion;
    private javax.swing.JTextPane panelInfo;
    private javax.swing.JTextField textoAlumnos;
    private javax.swing.JTextField textoCurso;
    private javax.swing.JTextField textoNota;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
