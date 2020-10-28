package ar.com.educacionit.web.parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class CSVFileParser extends FileParser implements Parseable, Convertible {

	public CSVFileParser() {
		super(null, ";");
	}
	
	public CSVFileParser(String fileName) {
		super(fileName,";");
	}

	@Override
	public Collection<Producto> parse() throws ParseableException {
		
		Collection<Producto> productos = new ArrayList<Producto>();
		
		//crear el puntero al archivo
		File file = new File(super.getFileName());
		
		try {
			//lector de archivos de texto
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			String lineaLeida;
			boolean isPrimerLinea = true;
			while( (lineaLeida = br.readLine()) != null) {
				//codigo;titulo;precio;tipo
				if(!isPrimerLinea) {
					String[] array = lineaLeida.split(getDelimitador());
					//0 ->codigo
					//1 ->titulo
					//2 ->precio
					//3 ->tipo
					String codigo = array[0];
					String titulo = array[1];
					Float precio = Float.parseFloat(array[2]);
					Long tipoProducto = Long.parseLong(array[3]);
					Producto producto = new Producto(titulo, precio, codigo, tipoProducto);
					
					productos.add(producto);
				}else {
					isPrimerLinea = false;
				}
			}
			
			br.close();
		} catch (IOException e) {
			throw new ParseableException("No se ha podido parsear el archivo:" + getFileName(), e);
		}
		return productos;
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
