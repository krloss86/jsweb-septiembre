package ar.com.educacionit.domain.clase4.idioma;

public class Persona {

	private String nombre;
	
	private IIdioma[] idiomas;
	
	//nace la persona, no sabe hablar
	public Persona(String nombre) {
		this.nombre = nombre;
		this.idiomas = new IIdioma[0];
	}
	
	public void aprenderIdioma(IIdioma nuevoIdioma) {
		
		IIdioma[] idiomasActules = new IIdioma[this.idiomas.length + 1];
		
		//condicion inicial
		if(this.idiomas.length == 0) {
			idiomasActules[0] = nuevoIdioma;
		}else {
			int i=0;
			for(IIdioma ia :this.idiomas) {
				idiomasActules[i] = ia;
			}
			i++;
			idiomasActules[i] = nuevoIdioma;
		}
		
		this.idiomas = idiomasActules;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IIdioma[] getIdiomas() {
		return idiomas;
	}
}
