package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorPasatiempo extends BuscadorBase {

	public BuscadorPasatiempo(String clave) {
		super(clave);
	}

	@Override
	//select * from 
	protected String getSQL() {
		
		//FROM PASATIEMPO WHERE MARCA = 'IRON MAN'
		
		return "PASATIEMPO WHERE MARCA LIKE '%"+ super.claveBusqueda +"%'";
	}

}
