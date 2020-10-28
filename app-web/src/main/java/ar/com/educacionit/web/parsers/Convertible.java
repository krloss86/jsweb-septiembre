package ar.com.educacionit.web.parsers;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public interface Convertible {

	public List<String> convertir(Collection<Producto> productos);
}
