package pa_1poo;

import java.util.Scanner;
import java.time.LocalDate;

public class EDAD extends DATOS_USUARIO {
    int añoNacimiento, edad;

    public void CALCULAR_EDAD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento (e.g., 2000): ");
        añoNacimiento = sc.nextInt();

        int añoActual = LocalDate.now().getYear();
        edad = añoActual - añoNacimiento;

        System.out.println("SU EDAD ES: " + edad + " AÑOS");
    }
}
