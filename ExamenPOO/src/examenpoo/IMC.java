/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo;

/**
 *
 * @author ianhe
 */
public class IMC extends Datos { //Clase Hija se extiende a clase Padre

    Double CalcEdad, CalcIMC; //Atributos principales

    public IMC() {
        super(); //Constructor vacio
    }
    
    

    public IMC(Double CalcEdad, Double CalcIMC, Double IMC) { //Constructor con las variables locales
        this.CalcEdad = CalcEdad;
        this.CalcIMC = CalcIMC;
    }

        //Constructor para obtener las variables de la clase padre
    public IMC(String Nombre, String Nombres, String ApePa, String ApeMa, String CURP, String RFC, String DiaNac, String MesNac, String AñoNac, String EstadoResi, String EstCivil, String Genero, Double Peso, Double Estatura) {
        super(Nombre, Nombres, ApePa, ApeMa, CURP, RFC, DiaNac, MesNac, AñoNac, EstadoResi, EstCivil, Genero, Peso, Estatura);
    }

    public void CalcEdad(){ //Segmento de codigo para calcular la edad
        
        this.DatosBasicos(); //Se llama a la clase padre para que se rellenen los datos
        Double AñoNaci=Double.valueOf(AñoNac);//Se convierte el año de nacimiento de STRING a DOUBLE 
        
        if (AñoNaci >= 00 & AñoNaci <= 25) { //Condicion para calcular la edad
            
            AñoNaci = AñoNaci + 2000; //La fecha obtenida del curp de dos digitos se le suma 2000 
            CalcEdad = 2025-AñoNaci; //Se calcula la edad del usuario restandole el año actual
            System.out.println("Su edad es: " + CalcEdad+ " Años");
        }else{
            if (AñoNaci < 99 & AñoNaci >25) {//Condicion en caso de que los datos obtenidos del CURP sean del siglo pasado
                AñoNaci=AñoNaci + 1900;
                CalcEdad= 2025-AñoNaci;
            }
        }
    }
     
    //>” y menor que “<
    
    public void CalcIMC(){ //Segmento de codigo para obtener el IMC
        
            CalcIMC= Peso/Math.pow(Estatura,2); //Se obtiene el IMC con ayuda de la libreria MATH.POW
            
            if (CalcIMC <=18.5) { //Se crea la condicion para dar el mensaje al usuario dependiendo el rango del resultado de su IMC
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