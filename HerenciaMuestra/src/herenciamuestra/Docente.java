/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamuestra;

/**
 *
 * @author ianhe
 */
public class Docente extends Personas{
    
    public int NEmp, NCed; //Se declara atributo
    
    public Docente(){ //Constructor vacio
        super();
    }
    
    public Docente(int NEmp,int NCed){ //Constructor con atributos
        this.NEmp = NEmp; 
        this.NCed = NCed;
    }
    
    public void Empleado(){ //Metodo
        System.out.println("Ingresa tu numero de empleado");
        NEmp = leer.nextInt();
    }
    
    public void Cedula(){ //Metodo
        System.out.println("Ingrese su cedula");
        NCed = leer.nextInt();
    }
    
}
