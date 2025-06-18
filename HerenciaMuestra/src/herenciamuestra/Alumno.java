package herenciamuestra;

import java.util.Scanner;

public class Alumno extends Personas {
    
    private String matricula;
    Scanner leer = new Scanner(System.in);
    
    public void matricula() {
        System.out.print("Ingresa tu matrícula: ");
        matricula = leer.next();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

