package ar.com.educacionit.web.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
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
import ar.com.educacionit.web.parsers.FormatoSalidaEnum;

@WebServlet("/GenerarArchivoErrorServlet")
public class GenerarArchivoErrorServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String formatoSalida = req.getParameter("formato");
		
		//tomcar la lista desde la sesion
		Object listadoFail = req.getSession().getAttribute("listadoFail");
		
		Collection<Producto> productos = (Collection<Producto>)listadoFail;
		
		FormatoSalidaEnum formatoEnum = FormatoSalidaEnum.getEnumByExtension(formatoSalida);
		
		Convertible<List<String>> convertible = FileParserBuilder.getConverter(formatoEnum);
		
		List<String> lineasAGrabar = convertible.convertir(productos);
		
		//FileWritter
		String filename = "listado-producto-error";
		
		String filePathOutput = "c:" + File.separator + "desarrollo" + File.separator + filename+"."+formatoSalida;
		
		File outputFile = new File(filePathOutput);
		if(!outputFile.exists()) {
			Files.createFile(outputFile.toPath());
		}
		FileWriter fw = new FileWriter(outputFile);
		for(String linea : lineasAGrabar) {
			fw.write(linea);
		}
		fw.close();
		
		//logica para descargar el file
		
		resp.setContentType("text/csv");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+filename+"."+formatoSalida+"\" "); 
		//escribir el contenido en el response 
		try {
			OutputStream outputStream = resp.getOutputStream();
			
			byte[] byteDelArchivoGenerado = Files.readAllBytes(outputFile.toPath());
			outputStream.write(byteDelArchivoGenerado);
					
			outputStream.flush();
			outputStream.close();
		}catch (Exception e) {
			resp.getWriter().print("No se ha podido generar el archivo, por favor reintente");
		}
	}
	
}
