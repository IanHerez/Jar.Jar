/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;


public class IMC extends Datos {

    Double CalcEdad, CalcIMC, IMC;
    
    public IMC() {
        super();
    }

    public IMC(Double CalcEdad, Double CalcIMC, Double IMC) {
        this.CalcEdad = CalcEdad;
        this.CalcIMC = CalcIMC;
        this.IMC = IMC;
    }

    public IMC(String Nombre, String Nombres, String ApePa, String ApeMa, String CURP, String RFC, String DiaNac, String MesNac, String AñoNac, String EstadoResi, String EstCivil, String Genero, Double Peso, Double Estatura) {
        super(Nombre, Nombres, ApePa, ApeMa, CURP, RFC, DiaNac, MesNac, AñoNac, EstadoResi, EstCivil, Genero, Peso, Estatura);
    }
    
    
    
    public void CalcIMC(){
        
        Double AñoNaci=Double.valueOf(AñoNac);
        
        if (AñoNaci >= 00) {
            
            AñoNaci = AñoNaci + 2000;
            
        }
     
    }
