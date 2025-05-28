/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;

/**
 *
 * @author ianhe
 */
public class IMC extends Datos {

    Double CalcEdad, CalcIMC;

    public IMC() {
        super();
    }
    
    

    public IMC(Double CalcEdad, Double CalcIMC, Double IMC) {
        this.CalcEdad = CalcEdad;
        this.CalcIMC = CalcIMC;
    }

    public IMC(String Nombre, String Nombres, String ApePa, String ApeMa, String CURP, String RFC, String DiaNac, String MesNac, String AñoNac, String EstadoResi, String EstCivil, String Genero, Double Peso, Double Estatura) {
        super(Nombre, Nombres, ApePa, ApeMa, CURP, RFC, DiaNac, MesNac, AñoNac, EstadoResi, EstCivil, Genero, Peso, Estatura);
    }

    public void CalcEdad(){
        
        this.DatosBasicos();
        Double AñoNaci=Double.valueOf(AñoNac);
        
        if (AñoNaci >= 00 & AñoNaci <= 25) {
            
            AñoNaci = AñoNaci + 2000;
            CalcEdad = 2025-AñoNaci;
            System.out.println("Su edad es: " + CalcEdad+ " Años");
        }else{
            if (AñoNaci < 99 & AñoNaci >25) {
                AñoNaci=AñoNaci + 1900;
                CalcEdad= 2025-AñoNaci;
            }
        }
    }
     
    //>” y menor que “<
    
    public void CalcIMC(){
        
            CalcIMC= Peso/Math.pow(Estatura,2);
            
            if (CalcIMC <=18.5) {
                System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica BAJO DE PESO");
        }else{
                if (CalcIMC >=18.5 && CalcIMC <25 ) {
                    System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica PESO IDEAL");
                }else{
                    if (CalcIMC >=25.0 && CalcIMC <=29.9  ) {
                       System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica SOBRE PESO");
                    }else{
                        if (CalcIMC >=30.0 && CalcIMC <=34.9 ) {
                            System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica OBESIDAD TIPO I");
                        }else{
                            if (CalcIMC >=35.0 && CalcIMC <=39.9 ) {
                                System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica OBESIDAD TIPO II");
                            }else{
                                if (CalcIMC >40 ) {
                                    System.out.println("Su calculo "+Nombre+" "+ ApePa+ " " +ApeMa+"\nEdad: "+CalcEdad+" \nPeso: "+ Peso+ "\nSus datos indican que tiene un Indice de Masa Coporal (IMC) DE: \n"+CalcIMC+ " Lo que indica OBESIDAD EXTREMA TIPO III");
                                }else{
                                    System.out.println("Algo esta mal, favor de reiniciar");
                                }
                            }
                        }
                }
            }
    }

}
}