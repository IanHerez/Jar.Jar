package calculadora;
import javax.swing.JOptionPane;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ianhe
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
       
        int opcion, n1,n2, resultado;
                
        opcion=Integer.parseInt(JOptionPane.showInputDialog("==Bienvenido== \n Ingrese una de las siguientes opciones: \n 1. Sumar \n 2.Restar \n 3.Multiplicar \n 4.Division \n"));
        
        switch (opcion) {
            case 1:
                n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunndo valor valor: "));
                
                resultado=n1+n2;
                
                JOptionPane.showMessageDialog(null,"El resultado de su suma: \n "+n1+ " + " +n2+ "=" +resultado);
                break;
                
            case 2:
                n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunndo valor valor: "));
                
                resultado=n1-n2;
                
                JOptionPane.showMessageDialog(null,"El resultado de su suma: \n " +n1+ " - " +n2+ "=" +resultado);
                break;
                
            case 3:
                n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunndo valor valor: "));
                
                resultado=n1*n2;
                
                JOptionPane.showMessageDialog(null,"El resultado de su suma: \n " +n1+ " * " +n2+ "=" +resultado);
                break;
                
            case 4:
                n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunndo valor valor: "));
                
                resultado=n1/n2;
                
                JOptionPane.showMessageDialog(null,"El resultado de su suma: \n " +n1+ +n2+ " / " +resultado);
                break;
              
            default:
              JOptionPane.showMessageDialog(null, "Error: Esta mal en algo");  
        }
        
        
    }
    
}
