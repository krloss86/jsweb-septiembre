package ar.com.educacionit.domain;

//clase
public class Persona {

	//atributos
	//encapsulamiento
	private String pensamiento;
	private Float altura;//
	private String nombre;
	private String apellido;
	private Long dni;
	private Integer cantidadOjos;
	public final static Integer CANT_OJOS = 2;
	
	//contructores por defecto
	public Persona() {
		System.out.println("Creando persona....");
	}
	
	public Persona(String nombre, String apellido, Long dni) {
		this.nombre = nombre;//f6
		this.apellido = apellido;//f6
		this.dni = dni;
		this.cantidadOjos = 2;
	}
	
	//metodos
	public String obtenerNombre() {
		return this.nombre;
	}
	public String obtenerApellido() {
		return this.apellido;
	}
	public Long obtenerDni() {
		return this.dni;
	}
	//metodo getter
	public Integer getCantidadOjos() {
		return this.cantidadOjos;
	}
	//metodo setter
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	//metodo de CLASE!!!!
	public static Integer getOjos() {
		return Persona.CANT_OJOS;
	}
	
	//destructor
	protected void finalize() throws Throwable {
		super.finalize();
		System.err.println("objeto muerto!");
	}

	public String getPensamiento() {
		return pensamiento;
	}

	public void setPensamiento(String pensamiento) {
		this.pensamiento = pensamiento;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCantidadOjos(Integer cantidadOjos) {
		this.cantidadOjos = cantidadOjos;
	}
	
}
