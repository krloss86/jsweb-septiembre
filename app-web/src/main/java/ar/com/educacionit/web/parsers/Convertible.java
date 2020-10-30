package ar.com.educacionit.web.parsers;

import java.util.Collection;

import ar.com.educacionit.domain.Producto;

public interface Convertible<T> {

	public T convertir(Collection<Producto> productos);
}
