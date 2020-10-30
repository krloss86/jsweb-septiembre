package ar.com.educacionit.web.parsers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class XLSFileParser extends FileParser implements Convertible<List<String>> {

	public XLSFileParser() {
		super(null, "|");
	}
	public XLSFileParser(String fileName) {
		super(fileName, "|");
	}

	@Override
	public List<String> convertir(Collection<Producto> productos) {
		
		List<String> lineas = new ArrayList<String>();
		lineas.add("id;titulo;precio;tipo\n");
		
		for(Producto producto : productos) {
			StringBuffer linea = new StringBuffer();
			linea.append(producto.getCodigo()).append(";")
			.append(producto.getTitulo()).append(";")
			.append(producto.getPrecio()).append(";")
			.append(producto.getTipoProducto())
			.append("\n");
			
			lineas.add(linea.toString());
		}
		
		return lineas;
	}

}
