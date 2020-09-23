package Principal;

public class Peliculas {
	private int id;
	private String nombre;
	private Categorias categorias;
	static int cont=0;
	public Peliculas() {
		cont++;
		this.id=cont;
		this.nombre="";
		this.categorias = new Categorias();
	}
	
	public Peliculas(String nombre, Categorias categorias)
	{
		cont++;
		this.id=cont;
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
	public void setCategorias(Object object) {
		this.categorias = (Categorias) object;
	}
	
	
}
