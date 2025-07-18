/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conecbdejem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ianhe
 */
public class ConecBDEjem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("Error al cargar el conector MySQL");
            return;
        }
        
        //Establecer la conexion
        String url = "jdbc:mysql://localhost:3306/ejemplo";
        String usuario ="root";
        String contraseña ="";
        
        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)){
            System.out.println("Conexion establecida");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");
            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                
            }
        }catch (SQLException e){
            System.out.println("Error al conectar a la base de datos");
        }
    }
}
