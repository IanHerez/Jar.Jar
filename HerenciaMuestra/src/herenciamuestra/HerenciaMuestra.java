package herenciamuestra;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HerenciaMuestra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Alumno objAlumno = new Alumno();
        Docente objDocente = new Docente();
        Admin objAdmin = new Admin();

        int opcion;

       opcion=Integer.parseInt(JOptionPane.showInputDialog("==Bienvenido== \n Ingrese una de las siguientes opciones: \n 1.Docente  \n 2.Alumno \n 3.Administrador "));

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
