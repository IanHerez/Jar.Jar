/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;

import java.util.Scanner;

public class Datos { 
Scanner leer=new Scanner(System.in);
    
    String Nombre, Nombres, ApePa, ApeMa, CURP, RFC, DiaNac, MesNac, AñoNac, EstadoResi, EstCivil, Genero;
    Double Peso, Estatura;

  public Datos(){
    super();
}

    public Datos(String Nombre, String Nombres, String ApePa, String ApeMa, String CURP, String RFC, String DiaNac, String MesNac, String AñoNac, String EstadoResi, String EstCivil, String Genero, Double Peso, Double Estatura) {
        this.Nombre = Nombre;
        this.Nombres = Nombres;
        this.ApePa = ApePa;
        this.ApeMa = ApeMa;
        this.CURP = CURP;
        this.RFC = RFC;
        this.DiaNac = DiaNac;
        this.MesNac = MesNac;
        this.AñoNac = AñoNac;
        this.EstadoResi = EstadoResi;
        this.EstCivil = EstCivil;
        this.Genero = Genero;
        this.Peso = Peso;
        this.Estatura = Estatura;
    }

    



   
   
 public void DatosBasicos(){
     
     System.out.println("Tienes dos nombres? Si/No: ");
     String NombElec = leer.next();
     if (NombElec.equalsIgnoreCase("Si")) {
         
         System.out.println("Ingrese su primer nombre: ");
         Nombre=leer.next();
         System.out.println("Ingrese su segundo nombre: ");
         Nombres=leer.next();
         System.out.println("Ingrese su apellido paterno:");
         ApePa=leer.next();
         System.out.println("Ingrese su apellido materno:");
         ApeMa=leer.next();
         
     }else{
         System.out.println("Ingrese su nombre: ");
         Nombre=leer.next();
         System.out.println("Ingrese su apellido paterno:");
         ApePa=leer.next();
         System.out.println("Ingrese su apellido materno:");
         ApeMa=leer.next();
         
     }
     
     System.out.println("Ingrese su CURP:");
     CURP=leer.next();
     
     if (CURP.length()==18) {
         System.out.println("CURP correcto");
     }else{
         System.out.println("Su CURP es incorrecto. FAVOR DE INGRESAR UN CURP CORRECTO");
         CURP=leer.next();
     }
     
     System.out.println("Ingrese su RFC: ");
     RFC=leer.next();
     
     if (RFC.length()==10) {
         System.out.println("Su RFC es correcta");
     }else{
         System.out.println("RFC incorrecto. Ingrese un RFC correcto: ");
         RFC=leer.next();
     }
    
     
     AñoNac=CURP.substring(4,6);
     MesNac=CURP.substring(6,8);
     DiaNac=CURP.substring(8,10);
     System.out.println("Su fecha de nacimiento es: \n Dia: " + DiaNac.trim()+" \n Mes: "+ MesNac.trim()+"\n Anio: "+ AñoNac.trim());
     
     
     System.out.println("Ingrese su estado de residencia: ");
     EstadoResi=leer.next();
     
     System.out.println("Ingrese su estatus civil: Soltero / Casado / Viudo / Separado");
     EstCivil=leer.next();
     
     System.out.println("Ingrese su genero: Masculino / Femenino");
     Genero=leer.next();
     
     System.out.println("Ingrese su peso en kilogramos: ");
     Peso=leer.nextDouble();
     
     System.out.println("Ingrese su estatura en metros: (Ej 1.70)");
     Estatura=leer.nextDouble();
     
 }
  
  
}
