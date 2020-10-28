package ar.com.educacionit.web.parsers;

import java.util.Collection;

import ar.com.educacionit.domain.Producto;

public interface Parseable {

	public Collection<Producto> parse() throws ParseableException;
}
