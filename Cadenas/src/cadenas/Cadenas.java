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
        
        String Curp, RFC, Nombre, Apellido, Matricula, Usuario, Contraseña;
        
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
                System.out.println("Ingresa tu RFC: ");
                    RFC=leer.next();
                    if (RFC.length()<10 && RFC.length()>13) {
                        System.out.println("RFC Correcto");
                }else{
                        System.out.println("RFC Incorrecto, ingrese su RFC correcto");
                    }
            }
            
            System.out.println("Ingrese su matricula: ");
            Matricula=leer.next();
            
            if (Matricula.length()==10) {
                System.out.println("Su matricula es correcta");
            }else{
                System.out.println("Su matricula es Incorrecta, Ingrese una matricula correcta");
            }
            
        }else{
            System.out.println("Usuario y/o contraseña incorrecto");
        }
    }
    
}
