package ar.com.educacionit.domain.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		
		Libro libro = new Libro("HARRY POTTER: LOS ARCHIVO...", "VARIOS AUTORES", 2390F);
		
		Musica musica = new  Musica("CHROMATICA", "LADY GAGA", 1046F, "UNIVERSAL");
		
		Pelicula pelicula = new Pelicula("AVENGER", "Stan Lee", 2500F);
		
		Pasatiempo pasatiempo = new Pasatiempo("AVENGER ASSEMBLE PINTA Y CREA", "VARIOS", 299F);
		
		//VVECTOR DE ARTICULOS
		Articulo[] articulos = new Articulo[4];
		articulos[0] = libro;
		articulos[1] = musica;
		articulos[2] = pelicula;
		articulos[3] = pasatiempo;
		
		//magia de la herencia
		for(Articulo articulo : articulos) {
			//mostrarlos datos de un articulo, sin importar que categoria es
			System.err.println("Titulo:" + articulo.getTitulo());
			System.err.println("Autor:" + articulo.getAutor());
			System.err.println("Precio:" + articulo.getPrecio());
			System.err.println("Categoria:" + articulo.getCategoria());
			System.out.println("------------------------------------");
		}
	}
}
