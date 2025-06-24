package biblioteca;

/**
 * Clase Autor que hereda de Datos
 * Representa a un autor de libros
 */
public class Autor extends Datos {
    
    /**
     * Constructor por defecto
     */
    public Autor() {
        super();
    }
    
    /**
     * Constructor con parámetros
     */
    public Autor(String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }
    
    /**
     * Muestra el nombre completo del autor
     */
    public void mostrarAutor() {
        System.out.println("=== DATOS DEL AUTOR ===");
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido Paterno: " + getApellidoPaterno());
        System.out.println("Apellido Materno: " + getApellidoMaterno());
        System.out.println();
    }
} 