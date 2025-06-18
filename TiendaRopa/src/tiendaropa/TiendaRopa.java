package tiendaropa;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ianhe
 */
public class TiendaRopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in); //Metodo para leer
        
        String Usuario, Contraseña;
        
        System.out.println("Bienvenido al sistema"); //Ingreso al sistema
        System.out.println("Ingrese su usuario: ");
        Usuario=leer.next();
        System.out.println("Ingrese su contraseña: ");
        Contraseña=leer.next();
        
        
        
        if (Usuario.equals("IANHE") && Contraseña.equals("252516")) { //Requerimento de Uusario y contraseña con equals
           
            Ropa objr=new Ropa();
            objr.RegistrarRop();
            
        }else{
            System.out.println("Datos incorrectos reinicie todo"); //Mensaje en caso dde informacion erronea
        }
        
    }
    
}
