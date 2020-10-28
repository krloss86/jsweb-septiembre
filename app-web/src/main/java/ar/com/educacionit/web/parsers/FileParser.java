package ar.com.educacionit.web.parsers;

public class FileParser {

	protected String fileName;
	protected String delimitador;
	
	public FileParser(String fileName, String delimitador) {
		this.fileName = fileName;
		this.delimitador = delimitador;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDelimitador() {
		return delimitador;
	}

	public void setDelimitador(String delimitador) {
		this.delimitador = delimitador;
	}
	
}
