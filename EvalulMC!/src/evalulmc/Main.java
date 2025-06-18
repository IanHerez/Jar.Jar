package evalulmc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Declaración y creación de un objeto Scanner para leer la entrada.
        Scanner leer = new Scanner(System.in);

        // Declaración de cadenas para el usuario y contraseña correctos.
        String UsuarioCorrecto = "JazminGC";
        String ContraseñaCorrecta = "252516";

        System.out.println("---Inicio de sesión---");
        System.out.println("Ingresa tu usuario: ");
        // Lectura de una cadena del usuario.
        String UsuarioIngresado = leer.nextLine();
        System.out.println("Ingresa tu contraseña: ");
        // Lectura de una cadena del usuario.
        String ContraseñaIngresada = leer.nextLine();

        // Operación de comparación de cadenas (equals()) para validar el inicio de sesión.
        if (UsuarioIngresado.equals(UsuarioCorrecto) && ContraseñaIngresada.equals(ContraseñaCorrecta)) {
            System.out.println("---Inicio de sesión exitoso---\n");

            String continuarCalculando; // Variable para controlar el bucle de cálculo

            // Bucle do-while para permitir múltiples cálculos de IMC
            do {
                System.out.println("Por favor, complete la siguiente información\n");

                // Declaración de variables para almacenar la información personal.
                String nombre;
                System.out.println("¿Tiene dos nombres? (si/no)");
                // Lectura de una cadena y conversión a minúsculas.
                String respuestaNombres = leer.nextLine().toLowerCase();

                // condicion para obtener el nombre.
                if (respuestaNombres.equals("si")) {
                    System.out.println("Ingresa primer nombre: ");
                    String PrimerNombre = leer.nextLine(); // Lectura de cadena
                    System.out.println("Ingresa segundo nombre: ");
                    String SegundoNombre = leer.nextLine(); // Lectura de cadena
                    nombre = PrimerNombre + " " + SegundoNombre; // Operación de concatenación de cadenas.
                } else {
                    System.out.println("Ingresa tu nombre completo: ");
                    nombre = leer.nextLine(); // Lectura de cadena
                }

                String curp;
                // Bucle para validar la longitud de la CURP.
                do {
                    System.out.println("Ingresa tu CURP (18 caracteres): ");
                    curp = leer.nextLine(); // Lectura de cadena
                    if (curp.length() != 18) { // Operación de longitud de cadena y comparación.
                        System.out.println("CURP incorrecto. Debe tener exactamente 18 caracteres. Intente de nuevo.");
                    } else {
                        System.out.println("CURP válido.");
                    }
                } while (curp.length() != 18);

                String rfc;
                // Bucle para validar la longitud del RFC.
                do {
                    System.out.println("Ingresa tu RFC (12 o 13 caracteres, dependiendo si es persona física o moral): ");
                    rfc = leer.nextLine(); // Lectura de cadena
                    if (rfc.length() < 12 || rfc.length() > 13) { // Operación de longitud de cadena y comparación.
                        System.out.println("RFC inválido. Debe tener 12 o 13 caracteres. Intente de nuevo.");
                    } else {
                        System.out.println("RFC válido.");
                    }
                } while (rfc.length() < 12 || rfc.length() > 13);


                System.out.println("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
                String fechaNacimiento = leer.nextLine(); // Lectura de cadena
                System.out.println("Estado donde vives: ");
                String estadoResidencia = leer.nextLine(); // Lectura de cadena
                System.out.println("Estado civil: ");
                String estadoCivil = leer.nextLine(); // Lectura de cadena
                System.out.println("Género: ");
                String genero = leer.nextLine(); // Lectura de cadena

                double peso;
                // Bucle para asegurar que el peso sea un número válido y positivo.
                do {
                    System.out.println("Peso (en kg, ej. 70.5): ");
                    // Se usa leer.nextDouble() para leer un número decimal.
                    // Manejo de excepción para entrada no numérica.
                    while (!leer.hasNextDouble()) {
                        System.out.println("Entrada inválida. Por favor, ingresa un número para el peso.");
                        leer.next(); // Consume la entrada incorrecta
                    }
                    peso = leer.nextDouble();
                    if (peso <= 0) {
                        System.out.println("El peso debe ser un valor positivo. Intente de nuevo.");
                    }
                } while (peso <= 0);

                double estatura;
                // Bucle para asegurar que la estatura sea un número válido y positivo.
                do {
                    System.out.println("Estatura (en metros, ej. 1.75): ");
                    while (!leer.hasNextDouble()) {
                        System.out.println("Entrada inválida. Por favor, ingresa un número para la estatura.");
                        leer.next(); // Consume la entrada incorrecta
                    }
                    estatura = leer.nextDouble();
                    if (estatura <= 0) {
                        System.out.println("La estatura debe ser un valor positivo. Intente de nuevo.");
                    }
                } while (estatura <= 0);

                
                
                // Declaración y creación de un OBJETO de la clase InformacionSalud. Que serian las que se piden al usuario.
                InformacionSalud obj = new InformacionSalud(peso, estatura, curp, rfc, estadoResidencia, estadoCivil, nombre, fechaNacimiento, genero);

                // Llamada a los métodos de cálculo
                int edad = obj.calcularEdad();
                double imcCalculado = obj.calcularIMC();
                String rangoIMC = obj.obtenerRangoIMC(imcCalculado);

                System.out.println("\n----Resultados para " + obj.getNombre() + "----");
                System.out.println("Nombre: " + obj.getNombre());
                System.out.println("Fecha de Nacimiento: " + obj.getFechaNacimiento());
                System.out.println("Edad: " + edad + " años");
                System.out.println("Género: " + obj.getGenero());
                System.out.println("CURP: " + obj.getCurp());
                System.out.println("RFC: " + obj.getRFC());
                System.out.println("Estado de Residencia: " + obj.getEstadoResidencia());
                System.out.println("Estado Civil: " + obj.getEstadoCivil());
                System.out.println("Peso: " + obj.getPeso() + " kg");
                System.out.println("Estatura: " + obj.getEstatura() + " m");
                System.out.printf("IMC: %.2f\n", imcCalculado);
                System.out.println("Clasificación IMC: " + rangoIMC);

                // Preguntar al usuario si desea calcular otro IMC
                System.out.println("\n¿Desea calcular otro IMC? (si/no)");
                continuarCalculando = leer.nextLine().toLowerCase();

            } while (continuarCalculando.equals("si")); // El bucle continúa si la respuesta es "si"

        } else {
            System.out.println("Inicio de sesión incorrecto, intente de nuevo!");
        }

        
        leer.close();
    }
}