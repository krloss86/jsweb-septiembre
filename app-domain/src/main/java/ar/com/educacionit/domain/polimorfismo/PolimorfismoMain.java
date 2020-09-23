package ar.com.educacionit.domain.polimorfismo;

public class PolimorfismoMain {

	public static void main(String[] args) {
		
		String tipoInformeSeleccionado = "pepe";
		String nombreInformeSeleccionado  = "listadoXYZ";
		
		InformePDF informePDF = null;
		InformeCSV informeCSV = null;
		InformeBase informeBase = null;
		
		//seleccion de la clase a instanciar en base al tipo
		if("pdf".equalsIgnoreCase(tipoInformeSeleccionado))  {
			informePDF = new InformePDF(nombreInformeSeleccionado);
		}else if("csv".equalsIgnoreCase(tipoInformeSeleccionado)) {
			informeCSV = new InformeCSV(nombreInformeSeleccionado);
		}else {
			informeBase = new InformeTXT(nombreInformeSeleccionado);
		}

		if(informePDF != null) {
			System.out.println("Ejecutando informe en PDF...");
			informePDF.convertir();
		}else if(informeCSV != null) {
			System.out.println("Ejecutando informe en CSV...");
			informeCSV.convertir();
		}else {
			System.out.println("Ejecutando informe en GENERAL...");
			informeBase.convertir();
		}
		
		System.out.println("Informe generado!");
	}

}
