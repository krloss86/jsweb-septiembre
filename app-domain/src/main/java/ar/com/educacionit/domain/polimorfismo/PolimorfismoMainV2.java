package ar.com.educacionit.domain.polimorfismo;

public class PolimorfismoMainV2 {

	public static void main(String[] args) {
		
		String tipoInformeSeleccionado = "csv";
		String nombreInformeSeleccionado  = "listadoXYZ";
		
		InformeBase informe = null;
		
		//seleccion de la clase a instanciar en base al tipo
		if("pdf".equalsIgnoreCase(tipoInformeSeleccionado))  {
			informe = new InformePDF(nombreInformeSeleccionado);
		}else if("csv".equalsIgnoreCase(tipoInformeSeleccionado)) {
			informe = new InformeCSV(nombreInformeSeleccionado);
		}else {
			informe = new InformeTXT(nombreInformeSeleccionado);
		}

		System.out.println("Ejecutando informe...");
		informe.convertir();
		
		System.out.println("Informe generado!");
	}

}
