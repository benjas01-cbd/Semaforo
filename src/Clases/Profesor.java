package clases;
/**
 * Clase constructor de profesor
 * @author Benjamin
 * @version 2.0
 * @since 1.5
 * 
 */
public class Profesor  extends Persona{
     /** Constructor
         * 
         */
    	public Profesor() {}
        /** 
         * Hace la pregunta al estudiante sobre el color
         * @return String Devuelve el color dicho por el estudiante
         * 
         */
    	public String preguntacolor(){

		Estudiante alumno;
                alumno = new Estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}
