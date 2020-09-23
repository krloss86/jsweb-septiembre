package ar.com.educacionit.domain.polimorfismo2;

import ar.com.educacionit.domain.herencia.Articulo;

public class BuscadorMain {

	public static void main(String[] args) {
		
		String[] tiposDeBusquedas = args;
		
		String clave = "IRON MAN";
		
		if(tiposDeBusquedas.length > 4) {
			System.err.println("Error!!! muchos tipos de buscadores");
			System.exit(100);
		}
		
		BuscadorBase[] buscadores = new BuscadorBase[tiposDeBusquedas.length]; 
		
		//construccion de los busacadores en base a los tipos infomados
		for(int i = 0; i < tiposDeBusquedas.length; i++) {
			switch (tiposDeBusquedas[i]) {
				case "1":
					buscadores[i] = new BuscadorLibro(clave);
					break;
				case "2":
					buscadores[i] = new BuscadorMusica(clave);
					break;
				case "3":
					buscadores[i] = new BuscadorPelicula(clave);
					break;
				case "4":
					buscadores[i] = new BuscadorPasatiempo(clave);
					break;
				default:
					buscadores[i] = new BuscadorGeneral(clave);
					break;
			}
		}
		
		//recorro cada uno de los buscadores y  ejecuto el metodo buscar
		for(BuscadorBase buscador :  buscadores) {
			
			//ctrl+shift+i
			System.out.println("Mostrando resultado del buscador " + buscador.getClass().getSimpleName());
			
			Articulo[] articulos = buscador.buscar();
			
			for(Articulo articulo : articulos) {
				//invoco al metodo toString de cada articulo dentro del array/vector
				
				String estadoDelArticulo = articulo.toString();
				
				System.out.println(estadoDelArticulo);
			}
			System.out.println("-------------------------");
		}
		
		System.out.println("Fin busqueda!");
	}
}
