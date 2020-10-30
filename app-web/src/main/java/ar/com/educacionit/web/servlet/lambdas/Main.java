package ar.com.educacionit.web.servlet.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> edades = Arrays.asList(new Integer[]{25,35,24,44,56,41});
		
		//edad 25, edad 35, edad 24...
		List<String> edadesString = new ArrayList<String>();
		
		for(Integer edad : edades) {
			edadesString.add("Edad" + edad);
		}
		
		System.out.println(edadesString);
	}

}
