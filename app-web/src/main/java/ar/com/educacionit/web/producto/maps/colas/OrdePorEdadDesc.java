package ar.com.educacionit.web.producto.maps.colas;

import java.util.Comparator;

public class OrdePorEdadDesc implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}
