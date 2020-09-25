package ar.com.educacionit.domain.clase4.dtos;

//DTO
public class Resultado {

	private boolean error;
	
	private String mensaje;
	
	public Resultado(boolean error, String mensaje) {
		this.error = error;
		this.mensaje = mensaje;
	}
	
	public Resultado(boolean error) {
		this.error =  error;
		if(error) {
			this.mensaje = "Error inesperado";
		}
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	//ctrl+shift+s
	@Override
	public String toString() {
		return "Resultado [error=" + error + ", mensaje=" + mensaje + "]";
	}
	
}
