package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorPelicula extends BuscadorBase {

	public BuscadorPelicula(String clave) {
		super(clave);
	}

	@Override
	//select * from 
	protected String getSQL() {
		
		//FROM PASATIEMPO WHERE MARCA = 'IRON MAN'
		
		return "PELICULA WHERE NOMBRE_PELICULA LIKE '%"+ super.claveBusqueda +"%'";
	}

}
