/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploen;

/**
 *
 * @author ianhe
 */
public class EjemploEn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personas obj=new Personas(20,"Max");
        
        System.out.println(obj.getNombre()); //Mostrar el nombre
        System.out.println(obj.getEdad()); //Mostrar la edad
        
        obj.setNombre("Levy"); //Modificar Nombre
        obj.setEdad(15); //Modificar la edad
        
        System.out.println(obj.getNombre()); //Mostrar el nombre modificado
        System.out.println(obj.getEdad()); //Mostrar la edad modificado
        
        obj.setEdad(-1); //Modifica y muestra la alerte
        
    }
    
}
