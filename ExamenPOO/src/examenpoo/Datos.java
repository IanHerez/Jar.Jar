/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;

import java.util.Scanner; //Obtener la paqueteria de scanner

public class Datos {  //Clase Principal
Scanner leer=new Scanner(System.in);//Scanner global para clase padre e hijas
    
    String Nombre, Nombres, ApePa, ApeMa, CURP, RFC, DiaNac, MesNac, AñoNac, EstadoResi, EstCivil, Genero; //Atributos
    Double Peso, Estatura;

  public Datos(){ //Constructor vacio
    super();
}

    public Datos(String Nombre, String Nombres, String ApePa, String ApeMa, String CURP, String RFC, String DiaNac, String MesNac, String AñoNac, String EstadoResi, String EstCivil, String Genero, Double Peso, Double Estatura) {
        this.Nombre = Nombre;
        this.Nombres = Nombres;
        this.ApePa = ApePa;
        this.ApeMa = ApeMa;
        this.CURP = CURP;       //Construcctor con los atributos de la clase
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

    



   
   
 public void DatosBasicos(){ //Clase padre
     
     System.out.println("Tienes dos nombres? Si/No: ");
     String NombElec = leer.next();       //Diferencias si el usuario tiene uno o dos nombres con if
     if (NombElec.equalsIgnoreCase("Si")) {
         
         System.out.println("Ingrese su primer nombre: ");
         Nombre=leer.next();
         System.out.println("Ingrese su segundo nombre: ");
         Nombres=leer.next();
         System.out.println("Ingrese su apellido paterno:");
         ApePa=leer.next();
         System.out.println("Ingrese su apellido materno:");
         ApeMa=leer.next();
         
     }else{  //Procedimiento si solo se tiene un nombre
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
         System.out.println("CURP correcto");  //Confirmar que el tamaño de la CURP sea correcta
     }else{
         System.out.println("Su CURP es incorrecto. FAVOR DE INGRESAR UN CURP CORRECTO");
         CURP=leer.next();
     }
     
     System.out.println("Ingrese su RFC: ");
     RFC=leer.next();
     
       
     if (RFC.length()==13) { //HEEI061203P78
         System.out.println("Su RFC es correcta"); //Verificar el tamaño del RFC con homoclave
     }else{
         System.out.println("RFC incorrecto. Ingrese un RFC correcto: ");
         RFC=leer.next();
     }
    
     //Obtener del CURP Año de Nacimiento, Mes, y dia con SUBSTRING
     AñoNac=CURP.substring(4,6);
     MesNac=CURP.substring(6,8);
     DiaNac=CURP.substring(8,10);
     System.out.println("Su fecha de nacimiento es: \nDia: " + DiaNac.trim()+" \nMes: "+ MesNac.trim()+"\nAnio: "+ AñoNac.trim());
     
     //Obtener datos adicionales
     System.out.println("Ingrese su estado de residencia: ");
     EstadoResi=leer.next();
     
     System.out.println("Ingrese su estatus civil: Soltero / Casado / Viudo / Separado");
     EstCivil=leer.next();
     
     System.out.println("Ingrese su genero: (M) Masculino / (F) Femenino");
     Genero=leer.next();
     
     System.out.println("Ingrese su peso en kilogramos: ");
     Peso=leer.nextDouble();
     
     System.out.println("Ingrese su estatura en metros: (Ej 1.70)");
     Estatura=leer.nextDouble();
     
 }
  
  
}
