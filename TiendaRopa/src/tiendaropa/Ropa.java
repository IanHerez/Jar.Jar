/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;
import java.util.Scanner;
/**
 *
 * @author ianhe
 */
public class Ropa  {
    
           Scanner leer=new Scanner(System.in);
            Integer Desi;
            
            Dama objd=new Dama();
            Caballero objc=new Caballero();
            Kids objk=new Kids();
            
            public void RegistrarRop(){
            System.out.println("Datos de ingreso correcto");
            
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Registrar Prenda para Dama");
            System.out.println("2. Registrar Prenda para Caballero");
            System.out.println("3. Registrar Prenda Kids");
            Desi=leer.nextInt();
            
            switch (Desi){
                
                case 1:
                    objd.PrendaDama();
                    break;
                    
                case 2:
                    objc.PrendaCaballo();
                    break;
                
                case 3: objk.PrendaKids();
            }
            }
}
