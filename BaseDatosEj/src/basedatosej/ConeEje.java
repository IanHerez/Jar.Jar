/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatosej;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ianhe
 */
public class ConeEje {
    
     public void conec(){
        
        Connection con=null;
        String urlDataBase="jdbc:mysql://localhost:3306/ejemplo";
        
        try{
            
            Class.forName("org.postgresql.Driver"); //com.mysql.jdbc.Driver
            con=DriverManager.getConnection(urlDataBase, "usuario", "password");
            
        }catch (Exception e){
            
            System.out.println("Ocurrio un error "+e.getMessage());
        }
        
        System.out.println("La conexion se realizo con exito");
    }
    
}
