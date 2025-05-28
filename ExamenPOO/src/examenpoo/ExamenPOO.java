/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpoo;

import java.util.Scanner;

public class ExamenPOO {

    //Agregar comentarios 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        String Usuario, Contraseña, Desicion;
        
        Datos objd= new Datos();
        IMC obji=new IMC ();
        
        System.out.println("Bienvenido al sistema");
        System.out.println("Ingrese su usuario: ");
        Usuario=leer.next();
        System.out.println("Ingrese su contraseña: ");
        Contraseña=leer.next();
        
        
        if (Usuario.equals("IANHE") && Contraseña.equals("252516")) {
            
            System.out.println("Datos de ingreso correcto");
            
            do{
                
                obji.CalcEdad();
                obji.CalcIMC();
                
                System.out.println("¿Deseas realizar alguna otra operacion? SI/NO");
                Desicion=leer.next();
            }while(Desicion.equalsIgnoreCase("SI"));
            
        }else{
            System.out.println("Datos incorrectos reinicie todo");
        }
        
    }
    
}
