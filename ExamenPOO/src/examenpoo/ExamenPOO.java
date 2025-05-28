/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpoo;

import java.util.Scanner; //Paqueteria para el scanner

public class ExamenPOO {

    //Agregar comentarios 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in); //Metodo para leer
        
        String Usuario, Contraseña, Desicion;
        
        Datos objd= new Datos(); //Declaracion de objetos 
        IMC obji=new IMC ();
        
        System.out.println("Bienvenido al sistema"); //Ingreso al sistema
        System.out.println("Ingrese su usuario: ");
        Usuario=leer.next();
        System.out.println("Ingrese su contraseña: ");
        Contraseña=leer.next();
        
        
        if (Usuario.equals("IANHE") && Contraseña.equals("252516")) { //Requerimento de Uusario y contraseña con equals
            
            System.out.println("Datos de ingreso correcto");
            
            do{ //Do While para repetir el calculo cuanats veces queira el usuario
                
                obji.CalcEdad(); //Clase padre
                obji.CalcIMC(); //Clase hija
                
                System.out.println("¿Deseas realizar alguna otra operacion? SI/NO");//Pregunta para repetir
                Desicion=leer.next(); //Se lee la desicion
            }while(Desicion.equalsIgnoreCase("SI")); //Se utiliza equalsignorecase para diferencia el resultado de si o no
            
        }else{
            System.out.println("Datos incorrectos reinicie todo"); //Mensaje en caso dde informacion erronea
        }
        
    }
    
}
