package herenciamuestra;

import java.util.Scanner;

public class Admin extends Personas {
    
    private String cargo;
    Scanner leer = new Scanner(System.in);

    public void Cargo() {
        System.out.print("Ingresa tu cargo: ");
        cargo = leer.next();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
