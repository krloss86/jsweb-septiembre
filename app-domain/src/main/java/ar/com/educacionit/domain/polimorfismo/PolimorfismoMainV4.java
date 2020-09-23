package ar.com.educacionit.domain.polimorfismo;

public class PolimorfismoMainV4 {

	public static void main(String[] args) {
		
		String tipoInformeSeleccionado = "txt";
		String nombreInformeSeleccionado  = "listadoXYZ";
		
		InformeBase informe = null;
		
		//seleccion de la clase a instanciar en base al tipo
		switch (tipoInformeSeleccionado) {
			case "pdf":
				informe = new InformePDF(nombreInformeSeleccionado);
				break;
			case "csv":
				informe = new InformeCSV(nombreInformeSeleccionado);
				break;
			default:
				informe = new InformeTXT(nombreInformeSeleccionado);
				break;
		}

		System.out.println("Ejecutando informe...");
		informe.realizarConversion();
		
		System.out.println("Informe generado!");
	}

}
