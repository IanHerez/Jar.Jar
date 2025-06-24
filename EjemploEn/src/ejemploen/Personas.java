/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploen;
import javax.swing.JOptionPane; //Libreria para pantallas emergentes
/**
 *
 * @author ianhe
 */
public class Personas {
    
    //Atributos
    private int edad;
    private String nombre;
    
    //Constructor
    public Personas (int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }
    
    //Metodo get para mostrat
    public int getEdad(){
        return edad;
    }
    
    //Metodo set para modificar/almacenar
    public void setEdad(int edad){
        
        if (edad>=0) {
            this.edad=edad;
        }else{
            JOptionPane.showMessageDialog(null,"La edad no puede tener numeros negativos");
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
