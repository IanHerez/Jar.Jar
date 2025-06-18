package herenciamuestra;

import java.util.Scanner;

public class Personas {

    private String nom;
    private int edad;
    private String app;
    private String apm;
    private String correo;
    private String curp;
    private String tel;

    Scanner leer = new Scanner(System.in);

    // Constructor vacío
    public Personas() {}

    // Constructor con parámetros
    public Personas(String nom, int edad, String apm, String app, String correo, String curp, String tel) {
        this.nom = nom;
        this.edad = edad;
        this.apm = apm;
        this.app = app;
        this.correo = correo;
        this.curp = curp;
        this.tel = tel;
    }

    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // Métodos para pedir datos al usuario
    public void pedirDatos() {
        System.out.print("Ingresa tu nombre: ");
        setNom(leer.next());

        System.out.print("Ingrese su edad: ");
        setEdad(leer.nextInt());

        System.out.print("Ingrese su apellido paterno: ");
        setApp(leer.next());

        System.out.print("Ingrese su apellido materno: ");
        setApm(leer.next());

        System.out.print("Ingrese su correo: ");
        setCorreo(leer.next());

        System.out.print("Ingrese su CURP: ");
        setCurp(leer.next());

        System.out.print("Ingrese su número de teléfono: ");
        setTel(leer.next());
    }
}
