package ar.com.educacionit.domain;

/**
 * Hello world!
 *
 */
public class App 
{
	//crear un objeto con mi nombre y apellido y mi dni
    public static void main( String[] args ) {
    	
    	Persona p = new Persona();
    	
    	System.out.println("Todas las personas tienen " + Persona.CANT_OJOS +" ojos");
    	
    	System.out.println("Todas las personas tienen " + Persona.getOjos() +" ojos");
    	
    	//Persona.CANT_OJOS = 5;
    }
}
