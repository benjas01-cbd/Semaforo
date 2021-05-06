package clases;
/**
 * La clase siguiente estamos creando un objeto
 * 
 * @author Benjamin
 * @version 2.0
 * @since 1.5
 * 
 *
 * 
 * 
 */
public class Estudiante extends Persona{
	// Incluye un metodo de clase que se une a los heredados
	int i_Curso;
         /**Creando el objeto
          *
          */
    	public Estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
        /**
         * presentacion del alumno
         */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
        /**
         * Pregunta el color al alumno 
         * @return String Devuelve el color seleccionado
         * 
         */
	public String preguntacolor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
}
