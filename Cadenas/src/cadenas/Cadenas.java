/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

import java.util.Scanner;

public class Cadenas {

   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        String Curp, RFC, Nombre, Apellido, Matricula, Usuario, Contraseña, SaberRFC;
        int Edad=19;
        
        System.out.println("Ingresa tu usuario: ");
        Usuario=leer.next();
        
        System.out.println("Ingresa tu contraseña: ");
        Contraseña=leer.next();
        
        if (Usuario.equals("IAN") && Contraseña.equals("12345")) {
            System.out.println("Datos Correctos"); 
            System.out.println("Actualizar Datos");
            System.out.println("Ingresa tu nombre: ");
            Nombre=leer.next();
            System.out.println("Ingresa tu apellido: ");
            Apellido=leer.next();
            System.out.println("Ingrese su CURP: ");
            Curp=leer.next();
            
            if (Curp.length()==18) {
                System.out.println("CURP Valido");
            }else{
                System.out.println("CURP Invalido");
                System.out.println("Conoces tu RFC?");
                SaberRFC = leer.next();
                if (SaberRFC.equalsIgnoreCase("si")) {
                    
                    System.out.println("Ingrese su RFC");
                    RFC=leer.next();
                    
                }else{
                    RFC=Curp.substring(0,9);
                    System.out.println("Su RFC es: " +RFC.trim());
                            
                }
            }
            
            System.out.println("Ingrese su matricula: ");
            Matricula=leer.next();
            
            if (Matricula.length()==10) {
                System.out.println("Su matricula es correcta");
                long b= Long.valueOf(Matricula);
                System.out.println("" +b);
            }else{
                System.out.println("Su matricula es Incorrecta, Ingrese una matricula correcta");
            }
            
            System.out.println("La primera letra de tu nombre es" +Nombre.charAt(0));
            System.out.println("La primera letra de tu apellido es:" +Apellido.charAt(0));
            System.out.println("El primer numero de tu matricula es: " +Matricula.charAt(0));
            String a =String.valueOf(Edad);// De entero a cadena
            System.out.println("variable a= " +a);
            
        }else{
            System.out.println("Usuario y/o contraseña incorrecto");
            
        }
    }
    
}
