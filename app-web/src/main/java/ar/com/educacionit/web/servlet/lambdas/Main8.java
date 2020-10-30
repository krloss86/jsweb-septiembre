package ar.com.educacionit.web.servlet.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main8 {

	public static void main(String[] args) {
		
		List<Integer> edades = Arrays.asList(new Integer[]{25,35,24,44,56,41});
		
		int edad = 35;
		
		List<Integer> edadesFiltradas = edades.stream()
		.filter(x -> x > edad)
		.filter(x -> x %2 ==0)
		.collect(Collectors.toList());
		
		System.out.println(edadesFiltradas);
	}

}
