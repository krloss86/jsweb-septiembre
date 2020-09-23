package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorMusica extends BuscadorBase {

	public BuscadorMusica(String clave) {
		super(clave);
	}

	@Override
	//select * from 
	protected String getSQL() {
		
		//FROM MUSICA WHERE TITULO = 'IRON MAN'
		
		return "MUSICA WHERE ARTISTA LIKE '%"+ super.claveBusqueda +"%'";
	}

}
