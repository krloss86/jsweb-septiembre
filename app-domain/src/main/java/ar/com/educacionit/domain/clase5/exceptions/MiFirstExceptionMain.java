package ar.com.educacionit.domain.clase5.exceptions;

public class MiFirstExceptionMain {

	public static void main(String[] args) {
		
		boolean generarException = true;
		
		if(generarException) {
			
			//lanzar una MiFirstExeption
			try {
				throw new FirstExeption("Mi primera exeption tipo checked!!!",null);
			}catch (FirstExeption e) {
				e.printStackTrace();
			}
		}
	}

}
