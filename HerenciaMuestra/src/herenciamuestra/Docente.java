package herenciamuestra;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Docente extends Personas {

    private String cedula, empleado;
    Scanner leer = new Scanner(System.in);

    public void Cedula() {
        cedula = JOptionPane.showInputDialog("Ingrese su cedula:  ");
    }

    public void Empleado() {
        System.out.print("Ingresa tu número de empleado: ");
        empleado = leer.next();
    }

    // Getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula() {
        this.cedula = JOptionPane.showInputDialog("Ingrese su cedula:  ");
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado() {
        this.empleado = JOptionPane.showInputDialog("Ingresa tu número de empleado: ");
    }
}
