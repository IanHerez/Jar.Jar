/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamuestra;

/**
 *
 * @author ianhe
 */
public class Admin extends Docente {  
    
    public String cargo;
    
    public Admin(){
        super();
    }
    
    public Admin(String cargo){
        this.cargo = cargo;
    }
    
    public void Cargo(){
        System.out.println("Ingrese su cargo");
        cargo = leer.next();
    }
}
