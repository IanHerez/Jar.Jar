package evalulmc; 

public class DatosPersonales extends PERSONA {
    // Declaración de atributos (cadenas de texto) específicos de DatosPersonales.
    String curp, RFC, estadoResidencia, estadoCivil;

    // Constructor de la clase DatosPersonales.
    // Llama al constructor de la clase padre (PERSONA) usando 'super()'.
    // Aquí se declaran los parámetros para crear un objeto DatosPersonales.
    public DatosPersonales(String curp, String RFC, String estadoResidencia, String estadoCivil, String nombre, String fechaNacimiento, String genero) {
        
// Llamada al constructor de la clase padre (PERSONA)
        // Se mandan a llamar los atributos de la clase padre.
        super(nombre, fechaNacimiento, genero);
        // Inicialización de los atributos propios de DatosPersonales.
        this.curp = curp;
        this.RFC = RFC;
        this.estadoResidencia = estadoResidencia;
        this.estadoCivil = estadoCivil;
    }
    
    
    public String getCurp() {
        return curp;
    }

    public String getRFC() {
        return RFC;
    }

    public String getEstadoResidencia() {
        return estadoResidencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

   
    public void curp() {
        System.out.println("Ingresa tu CURP");
        
    }

    public void RFC() {
        System.out.println("Ingresa tu RFC");

    }

    public void estadoResidencia() {
        System.out.println("Ingresa el estado donde vives: ");
       
    }

    public void estadoCivil() {
        System.out.println("Ingresa tu estado civil: ");
       
    }
}