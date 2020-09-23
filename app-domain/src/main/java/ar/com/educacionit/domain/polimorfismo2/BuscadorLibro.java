package ar.com.educacionit.domain.polimorfismo2;

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

}
