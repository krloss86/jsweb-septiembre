package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorGeneral extends BuscadorBase {

	public BuscadorGeneral(String clave) {
		super(clave);
	}

	@Override
	//select * from 
	protected String getSQL() {
		
		//FROM ARTICULOS WHERE TITULO = 'IRON MAN'
		
		return "LIBRO WHERE ARTICULOS LIKE '%"+ super.claveBusqueda +"%'";
	}

}
