/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

import java.util.Scanner;
/**
 *
 * @author ianhe
 */
public class Dama {
    
    
    Scanner leer=new Scanner(System.in);
    String Tipo, Color, Marca, Talla;
    Double  Stock, Precio;

    public Dama() {
        super();
    }

    public Dama(String Tipo, String Color, String Marca, String Talla, Double Stock, Double Precio) {
        this.Tipo = Tipo;
        this.Color = Color;
        this.Marca = Marca;
        this.Talla = Talla;
        this.Stock = Stock;
        this.Precio = Precio;
    }

    

    
    public void PrendaDama(){
        
            System.out.println("Ingrese el Tipo de prenda:");
            Tipo=leer.next();
            System.out.println("Ingrese el Color de la prenda");
            Color=leer.next();
            System.out.println("Ingrese la Marca de la prenda");
            Marca=leer.next();
            System.out.println("Ingrese la Talla de la prenda (S/M/X/XS)");
            Talla=leer.next();
            System.out.println("Ingrese el Stock disponible de la prenda");
            Stock=leer.nextDouble();
            System.out.println("Ingrese el Precio de venta");
            Precio=leer.nextDouble();
            
            System.out.println("La prenda ingresada es:" +Tipo+ "\n De color:"+Color+"\n De marca:"+Marca+"\n Talla:"+Talla+"\n Stock:" +Stock+"\n Precio: $" +Precio);
    }
    
    
}
    
    
    
    
    


