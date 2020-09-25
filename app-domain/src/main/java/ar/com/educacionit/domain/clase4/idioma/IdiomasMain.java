package ar.com.educacionit.domain.clase4.idioma;

public class IdiomasMain {

	public static void main(String[] args) {
		
		Persona persona = new Persona("carlos");

		System.out.println(persona.getNombre() + " habla:");
		
		for(IIdioma idioma : persona.getIdiomas()) {
			idioma.hablar();
		}
		
		//carlos aprende ingles
		IIdioma indiomaNuevo = new IdiomaIngles();
		persona.aprenderIdioma(indiomaNuevo);
		
		System.out.println("Ahora " +persona.getNombre() + " habla:");
		for(IIdioma idioma : persona.getIdiomas()) {
			String texto = idioma.hablar();
			System.out.println(texto);
		}
		
		indiomaNuevo = new IdiomaEspanol();
		persona.aprenderIdioma(indiomaNuevo);
		
		System.out.println("Ahora "  +persona.getNombre() + " habla:");
		for(IIdioma idioma : persona.getIdiomas()) {
			String texto = idioma.hablar();
			System.out.println(texto);
		}
	}

}
