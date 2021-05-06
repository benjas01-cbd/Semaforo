package principal;
import clases.Profesor;
 /**
 * Clase color, el profesor pregunta a un alumno por un color entre (rojo, amarillo y verde)
 * @author Benjamin
 * @version 2.0
 * @since 1.5
 * 
 */
public class ClaseColor {
     /**
     * instancia un objeto profesor y llama a preguntacolor
     *
     */
	public static void main(String[] args) {
		Profesor teacher = new Profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
