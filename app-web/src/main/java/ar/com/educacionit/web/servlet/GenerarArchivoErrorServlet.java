package ar.com.educacionit.web.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.web.parsers.Convertible;
import ar.com.educacionit.web.parsers.FileParserBuilder;

@WebServlet("/GenerarArchivoErrorServlet")
public class GenerarArchivoErrorServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String formatoSalida = req.getParameter("formato");
		
		//tomcar la lista desde la sesion
		Object listadoFail = req.getSession().getAttribute("listadoFail");
		
		Collection<Producto> productos = (Collection<Producto>)listadoFail;
		
		Convertible convertible = FileParserBuilder.getConverter(formatoSalida);
		
		List<String> lineasAGrabar = convertible.convertir(productos);
		
		//FileWritter
		String filePathOutput = "c:" + File.separator + "desarrollo" + File.separator + "listado-producto.error.csv";
		File outputFile = new File(filePathOutput);
		if(!outputFile.exists()) {
			Files.createFile(outputFile.toPath());
		}
		FileWriter fw = new FileWriter(outputFile);
		for(String linea : lineasAGrabar) {
			fw.write(linea);
		}
		fw.close();
	}
	
}
