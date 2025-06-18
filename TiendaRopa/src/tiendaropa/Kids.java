/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author ianhe
 */
public class Kids extends Caballero {

    public Kids(String Tipo, String Color, String Marca, String Talla, Double Stock, Double Precio) {
        super(Tipo, Color, Marca, Talla, Stock, Precio);
    }

    public Kids() {
        super();
    }
    
    public void PrendaKids(){
        System.out.println("Registrar Prenda Para Kids");
        this.PrendaCaballo();
    }
    
}
