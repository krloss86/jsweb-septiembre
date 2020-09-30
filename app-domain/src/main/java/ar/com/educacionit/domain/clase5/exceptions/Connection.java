package ar.com.educacionit.domain.clase5.exceptions;

public class Connection {

	private Boolean open;
	
	public Connection() {
		this.open = new Boolean(false);
	}
	
	public void open() {
		this.open = Boolean.TRUE;
	}
	
	public void close() {
		this.open = Boolean.FALSE;
	}

	public Boolean getOpen() {
		return open;
	}
	
}
