package biblioteca;


public class Libros extends Datos {

    // Atributos propios de la clase Libros
    private String titulo;
    private String isbn;

    
     // Constructor por defecto
    
    public Libros() {
        super();
        this.titulo = "";
        this.isbn = "";
    }

   
     // Constructor con parámetros
     
    public Libros(String nombre, String apellidoPaterno, String apellidoMaterno,
            String titulo, String isbn) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // Métodos getter y setter para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Métodos getter y setter para isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

 
    public void mostrarLibro() {
        System.out.println("=== DATOS DEL LIBRO ===");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Autor: " + getNombreCompleto());
        System.out.println("Nombre del autor: " + getNombre());
        System.out.println("Apellido Paterno del autor: " + getApellidoPaterno());
        System.out.println("Apellido Materno del autor: " + getApellidoMaterno());
        System.out.println();
    }
}