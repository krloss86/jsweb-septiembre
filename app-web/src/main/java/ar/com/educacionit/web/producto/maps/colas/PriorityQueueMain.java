package ar.com.educacionit.web.producto.maps.colas;

import java.util.PriorityQueue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		
		//crear
		PriorityQueue<Integer> colaBanco = new PriorityQueue<Integer>(new OrdePorEdadDesc());
		
		//cargar
		colaBanco.offer(35);
		
		colaBanco.offer(15);
		
		colaBanco.offer(85);
		
		//compareble
		System.out.println(colaBanco);
		
		while(!colaBanco.isEmpty()) {
			Integer valor = colaBanco.poll();
			System.out.println(valor);
			
			System.out.println(colaBanco.toString());
		}
	}

}
