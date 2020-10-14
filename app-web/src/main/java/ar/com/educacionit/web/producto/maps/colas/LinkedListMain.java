package ar.com.educacionit.web.producto.maps.colas;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		//crear colas sin priodidad
		LinkedList<String> diasSemana = new LinkedList<>();
		
		//carga

		diasSemana.offer("Martes");
		diasSemana.offer("Miercoles");
		diasSemana.offer("Jueves");
		diasSemana.offer("Viernes");
		diasSemana.offer("Sabado");

		System.out.println(diasSemana);
		
		//agregare al principio
		diasSemana.addFirst("Lunes");
		System.out.println(diasSemana);
		
		//agregar al final
		diasSemana.addLast("Domingo");
		System.out.println(diasSemana);
		
		//recorrer
		/*Iterator<String> itDias = diasSemana.iterator();
		while(itDias.hasNext()) {
			String dia  = itDias.next();
			System.out.println(dia);
		}*/
		
		//usando el metodo de queue
		while(!diasSemana.isEmpty()) {
			String dia = diasSemana.pop();
			System.out.println(diasSemana);
		}
	}
}
