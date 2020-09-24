package ar.com.educacionit.domain.polimorfismo2;

import ar.com.educacionit.domain.herencia.Articulo;

public class BuscadorLibro extends BuscadorBase {

	public BuscadorLibro(String clave) {
		super(clave);
	}

	@Override
	//select * from 
	protected String getSQL() {
		
		//FROM LIBRO WHERE TITULO = 'IRON MAN'
		
		return "LIBRO WHERE TITULO LIKE '%"+ super.claveBusqueda +"%'";
	}

	public Articulo obtenerLibroMayorPrecio() {
		
		Articulo precioMaximo = null;
		
		for(Articulo articulo : super.resultados) {
			if(precioMaximo == null) {
				precioMaximo = articulo;
			}else {
				if(articulo.getPrecio() > precioMaximo.getPrecio()) {
					precioMaximo = articulo;
				}
			}
		}
		
		return precioMaximo;
	}
}
