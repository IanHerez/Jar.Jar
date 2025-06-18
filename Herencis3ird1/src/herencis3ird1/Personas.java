package herencis3ird1;
import java.util.Scanner;//importar libreria

public class Personas {
    Scanner leer=new Scanner(System.in);//objeto de scanner
    public String nom;//atributos
    String Apm, App, correo, curp, tel;
    int edad;
    
    
    public Personas(){//constructor vacio
    }

    public Personas(String nom, String Apm, String App, String correo, String curp, String tel, int edad) {
        this.nom = nom;
        this.Apm = Apm;
        this.App = App;
        this.correo = correo;                 //contructores / atributo
        this.curp = curp;
        this.tel = tel;
        this.edad = edad;
    }
    public void setNombre(){
        System.out.println("Ingresa tu nombre: ");
        nom=leer.next();
    }
     public void getNombre(){
        System.out.println("Ingresa tu nombre: ");
        nom=leer.next();
    }
    public void setApellidoM(){
        System.out.println("Ingresa tu apellido materno: ");
        Apm=leer.next();
    }
    public void getApellidoM(){
        System.out.println("Ingresa tu apellido materno: ");
        Apm=leer.next();
    }
    public void setApellidoP(){
        System.out.println("Ingresa tu apellido paterno: ");
        App=leer.next();
    }
    public void getApellidoP(){
        System.out.println("Ingresa tu apellido paterno: ");
        App=leer.next();
    }
    public void setCorreo(){
        System.out.println("Ingresa tu correo: ");
        correo=leer.next();
    }
    public void getCorreo(){
        System.out.println("Ingresa tu correo: ");
        correo=leer.next();
    }
    public void setCurp(){
        System.out.println("Ingresa tu curp: ");
        curp=leer.next();
    }
     public void getCurp(){
        System.out.println("Ingresa tu curp: ");
        curp=leer.next();
    }
    public void setTelefono(){
        System.out.println("Ingresa tu telefono: ");
        tel=leer.next();
    }
    public void getTelefono(){
        System.out.println("Ingresa tu telefono: ");
        tel=leer.next();
    }
    public void setEdad(){
        System.out.println("Ingresa tu edad: ");
        edad=leer.nextInt();
    }
    public void getEdad(){
        System.out.println("Ingresa tu edad: ");
        edad=leer.nextInt();
    }




  
    
    
}
