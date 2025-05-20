/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamuestra;

/**
 *
 * @author ianhe
 */
public class Alumno extends Personas {
    
    public int matricula;
    public Alumno(){ //
        super(); //Comando para recuperar los constructores
    }
    
    public Alumno(int matricula){
        this.matricula=matricula;
    }
    
    public void matricula(){
        System.out.println("Ingrese su matricula");
        matricula=leer.nextInt();
    }
}
