package ar.com.educacionit.domain.polimorfismo2;

import ar.com.educacionit.domain.herencia.Articulo;
import ar.com.educacionit.domain.herencia.Libro;
import ar.com.educacionit.domain.herencia.Musica;
import ar.com.educacionit.domain.herencia.Pasatiempo;
import ar.com.educacionit.domain.herencia.Pelicula;

public abstract class BuscadorBase {
	
	//atributos
	protected String claveBusqueda;
	
	public BuscadorBase(String clave) {
		this.claveBusqueda = clave;
	}
	
	public Articulo[] buscar() {
		
		String sqlPadre = "SELECT * FROM ";
		
		String sqlhijo = this.getSQL();
		
		String sqlFinal = sqlPadre + sqlhijo;
		
		System.out.println("Ejecutando: " + sqlFinal);
		
		//simula la consulta contra la DB
		
		Libro libro = new Libro(this.claveBusqueda, "VARIOS AUTORES", 2390F);
		libro.setEditorial("EDITORIAL XYZ");
		
		Musica musica = new  Musica(this.claveBusqueda, "LADY GAGA", 1046F, "UNIVERSAL");
		
		Pelicula pelicula = new Pelicula(this.claveBusqueda, "Stan Lee", 2500F);
		
		Pasatiempo pasatiempo = new Pasatiempo(this.claveBusqueda, "VARIOS", 299F);
		
		//VVECTOR DE ARTICULOS
		Articulo[] articulos = new Articulo[4];
		articulos[0] = libro;
		articulos[1] = musica;
		articulos[2] = pelicula;
		articulos[3] = pasatiempo;
		
		return articulos;
	}
	
	protected abstract String getSQL();
}
