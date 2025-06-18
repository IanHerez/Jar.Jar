/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author ianhe
 */
public class Caballero extends Dama {

    public Caballero() {
        super();
    }

    public Caballero(String Tipo, String Color, String Marca, String Talla, Double Stock, Double Precio) {
        super(Tipo, Color, Marca, Talla, Stock, Precio);
    }

    public void PrendaCaballo(){
        System.out.println("Registrar Prenda Para Cabellero");
        this.PrendaDama();
    }
    
    
    
}
