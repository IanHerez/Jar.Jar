package herenciamuestra;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Alumno extends Personas {

    private String matricula;
    private String carrera;
    Scanner leer = new Scanner(System.in);

    public void matricula() {
        System.out.print("Ingresa tu matrícula: ");
        matricula = leer.next();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        this.matricula = JOptionPane.showInputDialog("Ingrese su matrícula: ");
    }

    public void setCarrera() {
        this.carrera = JOptionPane.showInputDialog("Ingrese su carrera: ");
    }
}
