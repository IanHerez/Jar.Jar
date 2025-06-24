package biblioteca;


public class Lector extends Datos {

    // Atributo propio de la clase Lector
    private String matricula;

    // Constructor por defecto

    public Lector() {
        super();
        this.matricula = "";
    }

    // Constructor con parámetros

    public Lector(String nombre, String apellidoPaterno, String apellidoMaterno, String matricula) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.matricula = matricula;
    }

    // Métodos getter y setter para matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // Muestra todos los datos del lector

    public void mostrarLector() {
        System.out.println("=== DATOS DEL LECTOR ===");
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido Paterno: " + getApellidoPaterno());
        System.out.println("Apellido Materno: " + getApellidoMaterno());
        System.out.println();
    }
}