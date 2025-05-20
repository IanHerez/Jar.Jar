/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciamuestra;

import java.util.Scanner;

public class HerenciaMuestra {

    public static void main(String[] args) {
        // TODO code application logic here 
        
        Scanner leer=new Scanner(System.in);
        
        Alumno obj=new Alumno();
        Docente ob=new Docente();
        Admin obje=new Admin();
        
        int a;
        
        System.out.println("Selecciona una opcion");
        System.out.println("1- Maestro");
        System.out.println("2- Alumno");
        System.out.println("3- Administrador");
        a = leer.nextInt();
        
        obj.Nombre();
        obj.Edad();
        obj.ApePA();
        obj.ApeMa();
        obj.Correo();
        obj.Telefono();
        obj.CURP();
        
        
        
        switch (a){
            
            case 1:
                
                ob.Cedula();
                ob.Empleado();
                break;
            case 2:
                
                obj.matricula();
                
                break;
            case 3:
                
                obje.Cargo();
                
                break;
        }
        }
    }
    
