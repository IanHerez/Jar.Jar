package herenciamuestra;

import java.util.Scanner;

public class Docente extends Personas {
    
    private String cedula, empleado;
    Scanner leer = new Scanner(System.in);

    public void Cedula() {
        System.out.print("Ingresa tu cédula: ");
        cedula = leer.next();
    }

    public void Empleado() {
        System.out.print("Ingresa tu número de empleado: ");
        empleado = leer.next();
    }

    // Getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
}
