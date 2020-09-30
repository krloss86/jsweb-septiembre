package ar.com.educacionit.domain.clase5.exceptions;

public class NullPointerException {

	public static void main(String[] args) {
		
		Integer a = null;
		
		if(a == 10) {
			System.out.println("A es 10!-");
		}else {
			System.out.println("A no es 10!");
		}
		
	}
}
