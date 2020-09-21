package Principal;

public class Peliculas {
	private int id;
	private String nombre;
	private Categorias categorias;
	
	public Peliculas() {
		
	}
	
	public Peliculas(String nombre, Categorias categorias)
	{
		super();
		this.nombre = nombre;
		this.categorias = categorias;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	
	
}
