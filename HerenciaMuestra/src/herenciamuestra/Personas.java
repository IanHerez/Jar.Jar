/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamuestra;

import  java.util.Scanner; //Importar la libreria
public class Personas {
    
    Scanner leer=new Scanner(System.in); //Objeto de Scanner
    public String nom; //Se convierte en atributo
    int edad;
    String app, apm, correo, curp, tel;
    
    public Personas(){ //Constructor vacio
        
    }

    public Personas(String nom, int edad, String apm, String app, String correo, String curp, String tel) {
        this.nom = nom;
        this.edad = edad;
        this.apm = apm;
        this.app = app;
        this.correo = correo;
        this.curp = curp;
        this.tel = tel;
    }
    
    public void Nombre(){
        System.out.println("Ingresa tu nombre");
        nom=leer.next();
    }
    
    public void Edad(){
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
    }
    
    public void ApePA(){
        System.out.println("Ingrese su apellido Paterno");
        app = leer.next();
    }
    
    public void ApeMa(){
        System.out.println("Ingresa su apellido materno");
        apm = leer.next();
    }
    
    public void Correo(){
        System.out.println("Ingrese su correo");
        correo = leer.next();
    }
    
    public void Telefono(){
        System.out.println("Ingrese su numero de telefono:" );
        tel = leer.next();
    }
    
    public void CURP(){
        System.out.println("Ingresa tu CURP");
        curp=leer.next();
    }
    
   
}
