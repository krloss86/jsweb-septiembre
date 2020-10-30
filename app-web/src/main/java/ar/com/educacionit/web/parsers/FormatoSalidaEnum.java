package ar.com.educacionit.web.parsers;

public enum FormatoSalidaEnum {
	CSV, XLS;
	
	public static FormatoSalidaEnum getEnumByExtension(String ext) {
		
		//todos los valores
		FormatoSalidaEnum[] enums = FormatoSalidaEnum.values();

		FormatoSalidaEnum enumValido = null;
		for(FormatoSalidaEnum aux : enums) {
			if(aux.name().equalsIgnoreCase(ext)) {
				enumValido = aux; 
				break;
			}
		}
		
		return enumValido;
	}
}
