
package pa_1poo;
import java.util.Scanner;
//JOHANNA LIZBETH ORTIZ JUAREZ
public class PA_1POO {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaración de variables
        String usuario, pass;
               

        // Ingreso de usuario y contraseña
         System.out.print("--BIENVENIDO A ESTE TU SISTEMA, PORFAVOR INGRESA CORRECTAMENTE LO SOLICITADO--");
        System.out.print("\nINGRESA TU USUARIO: ");
        usuario = leer.next();

        System.out.print("INGRESA TU CONTRASEÑA: ");
        pass = leer.next();

        if (usuario.equals("JOHANNAOJ") && pass.equals("252516")) {
            System.out.println("DATOS CORRECTOS");
            leer.nextLine(); // Limpiar buffer después de next()
    }
 DATOS_USUARIO obj = new DATOS_USUARIO();
 obj.AGREGARDATOS();
 obj.MOSTRAR_NOM_COMPLETO();
 obj.CURP_USUARIO();
 obj.RECIDENCIA();
 obj.ESTATUS_CIVIL();
 obj.GENERO();
 obj.PESO_ESTATURA();
 obj.DATOS_ACTUALIZADOS();
 

EDAD sa=new EDAD();
sa.CALCULAR_EDAD();
    }
    
}
