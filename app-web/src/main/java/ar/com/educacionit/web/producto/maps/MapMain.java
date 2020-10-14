package ar.com.educacionit.web.producto.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];

		//RECORRIDO POR FILAS
		for(int f = 0; f < 3; f++) {
			
			for(int c = 0; c <3; c++) {
				
				if(f == c) {
					matriz[f][c] = 1;
				}
			}
		}
		
		String[] dias = new String[7];
		dias[0] = "Lunes";
		
		//----------------
		Map<Integer, String> diasDeLaSemana = new  HashMap<Integer, String>();
		diasDeLaSemana.put(1, dias[0]);
		diasDeLaSemana.put(2, "Martes");
		diasDeLaSemana.put(3, "Miercoles");
		diasDeLaSemana.put(4, "Jueves");
		diasDeLaSemana.put(5, "Viernes");
		diasDeLaSemana.put(6, "Sabado");
		diasDeLaSemana.put(7, "Domingo");
		
		System.out.println(diasDeLaSemana);
		
		//obtener un valor del mapa
		String valorDelMapa =  diasDeLaSemana.get(1);
		System.out.println("valor dentro del mapa para la clave " + 1  + " = " + valorDelMapa);
		
		//contains 
		//ctrl+shit+i
		boolean contieneElDia8 = diasDeLaSemana.containsKey(8);
		System.out.println("Contiene al dia 8?" + (contieneElDia8 ? "SI": "NO"));
		
		boolean contieneMiercoles = diasDeLaSemana.containsValue("Miercoles");
		System.out.println("COntiene el dia miercoles" + (contieneMiercoles ? "SI": "NO"));
		
		//eliminar uno en particular
		String diaEliminado = diasDeLaSemana.remove(3);
		
		System.out.println(diasDeLaSemana);
		
		//vaciar el mapa
		//diasDeLaSemana.clear();
		System.out.println(diasDeLaSemana);

		//recorrido de un mapa
		//recorrer las claves
		Set<Integer> keys = diasDeLaSemana.keySet();
		
		for(Integer key : keys) {
			System.out.println(key);
		}	
		
		//por valores
		Collection<String> values = diasDeLaSemana.values();
		
		for(String value : values) {
			System.out.println(value);
		}
		
		Iterator<String> itValues = values.iterator();
		while(itValues.hasNext()) {
			String value = itValues.next();
			System.out.println(value);
		}
		
		//dada las key -> tomo las los valores		
		keys = diasDeLaSemana.keySet();
		for(Integer key : keys) {
			if(key == 7) {
				//actualizo el valor del mapa para la clave 7
				diasDeLaSemana.put(key, "SUNDAY");
			}
			String valorDadoSuClave = diasDeLaSemana.get(key);
			System.out.println("Clave: " + key +", Valor = "+ valorDadoSuClave);
		}
		
		//EntrySet
		Set<Entry<Integer,String>> entrySet = diasDeLaSemana.entrySet();
		for(Entry<Integer,String> entry : entrySet) {
			Integer key =  entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}
	}

}
