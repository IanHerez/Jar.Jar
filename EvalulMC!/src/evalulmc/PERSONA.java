package evalulmc;

import java.util.Scanner;

public class PERSONA {
    // Declaración de atributos (cadenas de texto)
    String nombre, fechaNacimiento, genero;
    

    // Constructor de la clase PERSONA
    // Aquí se inicializan los atributos de un objeto PERSONA.
    // Se declaran los parámetros 'nombre', 'fechaNacimiento', 'genero' que se recibirán al crear un objeto.
    public PERSONA(String nombre, String fechaNacimiento, String genero) {
        this.nombre = nombre; // Asigna el valor del parámetro 'nombre' al atributo 'nombre' del objeto.
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

  
    // Retornan el valor de los atributos.
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void nombre() {
        System.out.println("Ingresa tu nombre");
        
    }

    public void fechaNacimiento() {
        System.out.println("Ingresa tu fecha de nacimiento (DD/MM/AAAA):");
    }

    public void genero() {
        System.out.println("Ingresa tu género");
    }

    // Método para calcular la edad. Es una operación sobre la cadena 'fechaNacimiento'.
    // Declaración de una operación: calcularEdad()
    public int calcularEdad() {
        // Se usa 'substring' para extraer la parte del año de la cadena 'fechaNacimiento'.
        // Es una operación de cadena (String operation).
        String anioStr = fechaNacimiento.substring(6, 10);
        // 'Integer.parseInt' es una operación que convierte una cadena a un número entero.
        int anioNacimiento = Integer.parseInt(anioStr);
        int anioActual = 2025; 

        return anioActual - anioNacimiento; // Operación para calcular la edad.
    }
}
