package herenciamuestra;

import javax.swing.JOptionPane;

public class Personas {

    private String nom;
    private int edad;
    private String app;
    private String apm;
    private String correo;
    private String curp;
    private String tel;

    // Constructor vacío
    public Personas() {
    }

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
        setNom(JOptionPane.showInputDialog("Ingresa tu nombre: "));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
        setApp(JOptionPane.showInputDialog("Ingrese su apellido paterno: "));
        setApm(JOptionPane.showInputDialog("Ingrese su apellido materno: "));
        setCorreo(JOptionPane.showInputDialog("Ingrese su correo: "));
        setCurp(JOptionPane.showInputDialog("Ingrese su CURP: "));
        setTel(JOptionPane.showInputDialog("Ingrese su número de teléfono: "));
    }
}
