package ar.com.educacionit.web.parsers;

import java.util.HashMap;
import java.util.Map;

public class FileParserBuilder {
	
	private static Map<String, Parseable> mapParser;
	
	//bloque estático
	static {
		mapParser = new HashMap<String, Parseable>();
		mapParser.put("csv", new CSVFileParser());
		//los demas parser!!!
		//mapParser.put("xls", new XLSFileParser());
		//mapParser.put("odt", new ODTFileParser());
		////mapParser.put("docx", new DOCXFileParser());
	}
	
	public static Parseable getParser(String fileName) {
		
		int idx = fileName.lastIndexOf(".");
		String ext = fileName.substring(idx+1, fileName.length());
		
		Parseable parseable = mapParser.get(ext);
		
		FileParser fileParseDentroDelParseable = (FileParser)parseable;
		fileParseDentroDelParseable.setFileName(fileName);
		
		return parseable;
	}
	
	public static Convertible getConverter(String formato) {
		
		Parseable parseable = mapParser.get(formato);
		FileParser fileParseDentroDelParseable = (FileParser)parseable;
		
		Convertible convertible = (Convertible)fileParseDentroDelParseable; 
		
		return convertible;
	}
}
