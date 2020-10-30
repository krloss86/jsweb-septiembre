package ar.com.educacionit.web.parsers;

import java.util.HashMap;
import java.util.Map;

public class FileParserBuilder {
	
	private static Map<FormatoSalidaEnum, Object> mapParser;
	
	//bloque estático
	static {
		mapParser = new HashMap<FormatoSalidaEnum, Object>();
		mapParser.put(FormatoSalidaEnum.CSV, new CSVFileParser());
		//los demas parser!!!
		mapParser.put(FormatoSalidaEnum.XLS, new XLSFileParser());
		//mapParser.put("odt", new ODTFileParser());
		////mapParser.put("docx", new DOCXFileParser());
	}
	
	public static Parseable getParser(String fileName) {
		
		int idx = fileName.lastIndexOf(".");
		String ext = fileName.substring(idx+1, fileName.length());
		
		//obtener el enum dado la ext
		FormatoSalidaEnum formatoEnum = FormatoSalidaEnum.getEnumByExtension(ext); 
				
		Object parseable = mapParser.get(formatoEnum);
		
		if(parseable instanceof Parseable) {
		
			FileParser fileParseDentroDelParseable = (FileParser)parseable;
			fileParseDentroDelParseable.setFileName(fileName);
			
			return (Parseable)parseable;
		}else {
			throw new RuntimeException("La extension" + ext + " no tiene asociado un Parseable");
		}
	}
	
	public static Convertible getConverter(FormatoSalidaEnum formatoEnum) {
		
		Object convertible = mapParser.get(formatoEnum);
		
		if(convertible instanceof Convertible) {
			
			FileParser fileParseDentroDelParseable = (FileParser)convertible;
			
			return  (Convertible)fileParseDentroDelParseable; 
		}else {
			throw new RuntimeException("El formato" + formatoEnum.name() + " no tiene asociado un Convertible");
		}
	}
}
