/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;

import java.util.Scanner;

public class Datos { 
Scanner leer=new Scanner(System.in);
    
    String Nombre, Nombres, CURP, RFC, FechNac, EstadoResi, EstCivil, Genero, Peso, Estatura;


  public Datos(){
    
}

    public Datos(String Nombre, String Nombres, String CURP, String RFC, String FechNac, String EstadoResi, String EstCivil, String Genero, String Peso, String Estatura) {
        this.Nombre = Nombre;
        this.CURP = CURP;
        this.RFC = RFC;
        this.FechNac = FechNac;
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
     }else{
         System.out.println("Ingrese su nombre: ");
         Nombre=leer.next();
     }
     
     System.out.println("Ingrese su CURP:");
     CURP=leer.next();
     
     if (CURP.length()==18) {
         System.out.println("CURP correcto");
     }else{
         System.out.println("Su CURP es incorrecto favor de ingresar un CURP correcto");
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
     
     
     System.out.println("Su fecha de ancimiento e");
     
 }
  
  
}
