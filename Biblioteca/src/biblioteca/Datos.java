package biblioteca;


public class Datos {
    
    // Atributos protegidos para permitir herencia
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    
    
     // Constructor por defecto
     
    public Datos() {
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
    }
    
    
     // Constructor con parámetros
     
    public Datos(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidoPaterno(String ap) {
        this.apellidoPaterno = ap;
    }
    
    public void setApellidoMaterno(String am) {
        this.apellidoMaterno = am;
    }
    
    // Métodos getter
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    
    
     // Obtiene el nombre completo
     
    public String getNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
} 