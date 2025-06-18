package evalulmc;


public class InformacionSalud extends DatosPersonales {
    // Declaración de atributos (números decimales)
    double estatura, peso;

    // Constructor principal de InformacionSalud.
    // Llama al constructor de la clase padre (DatosPersonales).
    // Se declaran los parámetros necesarios para crear un objeto InformacionSalud.
    public InformacionSalud(double peso, double estatura, String curp, String RFC, String estadoResidencia, String estadoCivil, String nombre, String fechaNacimiento, String genero) {
        // Llamada al constructor de la clase padre (DatosPersonales)
        // Se mandan a llamar los atributos de la clase padre.
        super(curp, RFC, estadoResidencia, estadoCivil, nombre, fechaNacimiento, genero);
        this.peso = peso;
        this.estatura = estatura;
    }

   
    
    // Métodos para obtener peso y estatura.
   
      public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    // Método para calcular el IMC. Es una operación numérica.
        double calcularIMC() {
        if (estatura <= 0) {
            // Manejo de error: la estatura no puede ser cero o negativa.
            System.err.println("Error: La estatura debe ser mayor que cero para calcular el IMC.");
            return 0.0; 
        }
        // Operación matemática: peso / (estatura ^ 2)
        return peso / Math.pow(estatura, 2);
    }

    // Método para obtener el rango de IMC. Es una operación que devuelve una cadena.
    
    String obtenerRangoIMC(double imc) {
                if (imc < 18.5) {
            return "Bajo peso"; // Retorna una cadena de texto.
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            return "Obesidad clase I";
        } else if (imc >= 35 && imc < 39.9) {
            return "Obesidad clase II";
        } else {
            return "Obesidad clase III";
        }
    }
}

