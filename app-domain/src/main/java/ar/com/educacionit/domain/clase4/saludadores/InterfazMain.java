package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.polimorfismo2.BuscadorBase;

public class InterfazMain {

	public static void main(String[] args) {
		
		//(widening casting) en variables primitivas
		int edad = 10;
		
		long edadLong = edad;
		
		//casting, perdida 150031313232131
		short edadShot = (short)edad;
		
		//decimal
		double dolar = 150.75;
		
		long dolarEnero = (long)dolar;
		
		///objetos + herencia
		
	}

}
