package clases;
import java.util.Random;
/**
 * La clase siguiente emula el comportamiento de un semaforo, siendo aleatorio el color devuelto
 * 
 * @author Benjamin
 * @version 2.0
 * @since 1.5
 * 
 */
public class Ordenador {
     /**
     * 
     * creador de objetos vacio
     */
    public Ordenador() {}
    /**
     * devuelve un valor, que puede ser rojo,amarillo o verde, es aleatorio
     * @return String Devuelve el color del semaforo
     */
    public String color(){
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}
