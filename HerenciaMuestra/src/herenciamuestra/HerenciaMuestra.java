package herenciamuestra;

import java.util.Scanner;

public class HerenciaMuestra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Alumno objAlumno = new Alumno();
        Docente objDocente = new Docente();
        Admin objAdmin = new Admin();

        int opcion;

        System.out.println("Selecciona una opción:");
        System.out.println("1 - Maestro");
        System.out.println("2 - Alumno");
        System.out.println("3 - Administrador");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                objDocente.pedirDatos();  // Método heredado de Personas
                objDocente.Cedula();
                objDocente.Empleado();
                break;
            case 2:
                objAlumno.pedirDatos();   // Método heredado de Personas
                objAlumno.matricula();
                break;
            case 3:
                objAdmin.pedirDatos();    // Método heredado de Personas
                objAdmin.Cargo();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
