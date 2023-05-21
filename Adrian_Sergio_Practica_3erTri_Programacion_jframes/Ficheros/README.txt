-----------------EXPLICACIÓN DEL PROGRAMA----------------------

-----------GESTION ALUMNOS---------------

----BOTONES----
	NUEVO ALUMNO - habilita todos los campos para rellenarlos, cada campo tiene su comprobacion,
		una vez puestos todos los datos correctamente pulsar HACER GESTION, realiza la acción.
	
	BORRAR ALUMNO - habilita el campo clave DNI para introducir el alumno a borrar,
		una vez puesto el dato correctamente pulsar HACER GESTION, realiza la acción.
	
	MODIFICAR - habilita el campo clave DNI para introducir el alumno a borrar,
		una vez puesto el dato correctamente pulsar HACER GESTION.
		Se habilitaran los campos que se pueden modificar, para modificarlos introduce lo que quieras modifiar
		en caso de que no se quiera modificar nada se queda en blanco, pulsa HACER GESTION y realiza la acción.

	HACER GESTION: Realiza la acción que proponen los botones anteriormente mencionados.

	BORRAR DATOS: Pone todos los campos rellenables en blanco.

	VOLVER ATRAS: Vuelve al jframe anterior en este caso el menu principal

----PANEL----
	PANEL: Interactua con el usuario dependiendo de la selección para informarle.

----PANELES DE ESCRITURA----
	Se habilitan cada vez que el usuario vaya a hacer una acción, dependiendo de los botones pulsados.


--------------------------------------------------ENUNCIADO DEL TRABAJO Y COMENTARIOS SOBRE LA REALIZACION------------------------------------------------------	
PARTE OBLIGATORIA (8 puntos)

Diseñe un sistema de gestión académica para una escuela que la gestión de alumnos y cursos. Cada alumno puede estar inscrito en varios cursos y cada curso puede ser tomado por varios alumnos.

El sistema debe permitir:

a) Crear nuevos alumnos, con al menos los siguientes datos: nombre, apellido, correo electrónico y teléfono. También se debe permitir la modificación de cualquiera de los campos indicados así como la eliminación de alumnos.
-GESTION DE ALUMNOS permite crear alumnos, borrarlos y modificarlos, se le aniade dato DNI que sera la clave primaria en la BD, por decision de gestion el DNI no se puede modificar.

b) Crear nuevos cursos, con información sobre el nombre, la descripción y el número de horas. También se debe permitir la modificación de cualquiera de los campos indicados así como la eliminación de cursos.
-GESTION DE CURSOS permite crear cursos, borrarlos y modificarlos, se utiliza el dato nombre como clave primaria en la BD, por decision de gestion el nombre no se puede modificar.

c) Asociar a cada alumno los cursos en los que está inscrito, fechas de inicio y fin(mes y año) y la calificación obtenida en cada curso. La fecha de finalización no podrá ser introducida por el usuario, ésta se guardará automáticamente en el momento en el que se califique al alumno. Así, al principio del curso, el alumno se "matricula" en el curso, y al final del mismo, se le "evalúa". Se debe permitir la modificación y el borrado.
-BUSCAR MATRICULAR Y CALIFICAR permite, calificar y matricular a los alumnos en cursos y, a los cursos matricular alumnos, la fecha de inscripción se pone automaticamente al inscribirlos, la fecha final tambien al calificarlos.
Tambien permite la desmatriculacion del alumno del curso.

d) Mostrar la lista de alumnos inscritos en un curso y la lista de cursos en los que está inscrito un alumno.
-BUSCAR MATRICULAR Y CALIFICAR permite la busqueda del curso o del alumno de manera individual, entonces se podran ver los cursos que tiene un alumno y los alumnos que tiene un curso.
-LISTAS DE ALUMNOS Y CURSOS tambien permite ver en un Jtable la informacion.

e) Obtener un informe con la lista de alumnos(nombre completo), los cursos(nombre) en los que están inscritos y sus notas.
CREAR INFORMES DE ALUMNOS CURSOS Y CALIFICACIONES, crea un informe en documento txt, con toda la informacion requerida, ordenada por alumnos este documento se guarda en la carpeta \Adrian_Sergio_Practica_3erTri_Programacion_jframes\Ficheros.

La funcionalidad anterior debe implementarse en un programa java con interfaz gráfica utilizando la librería "swing" y los datos deben estar en una base de datos MySQL. El informe se generará en un fichero de texto.



PARTE OPCIONAL (3 puntos)

-Obtener un informe con la lista de cursos(nombre), sus descripciones y la lista de alumnos(nombre completo) inscritos en cada curso. (0,5p)

-Utilización del componente JTable para mostrar los datos en la interfaz. Se deberá utilizar al menos para implementar el punto d), aunque también podría utilizarse para mostrar los alumnos y cursos.(0,5p)
---LISTAS DE ALUMNOS Y CURSOS tambien permite ver en un Jtable la informacion requerida en el punto d.

-Permitir realizar una copia de seguridad de los alumnos en un fichero serializado. Dicha copia de seguridad también se debe poder reponer y actualizar así la base de datos. La tabla de los alumnos se sobrescribiría entera. También se puede realizar una copia de las 3 tablas(2p)
GESTION FICHEROS COPIAS DE SEGURIDAD permite realizar la copia de seguridad en un fichero serializable, también se realiza la deserializacion desde el fichero a la bbdd.

-Las foreign keys son opcionales. En caso de no usarlas se restará 0,5 puntos a la nota final.
---Se realizan las foreing keys en la creacción de las tablas

