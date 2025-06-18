package herencis3ird1;
import java.util.Scanner;
public class Herencis3ird1 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        alumno obj=new alumno();
        docente ob=new docente();
        Admin obe=new Admin();
        Personas obb=new Personas();
        int a;
        System.out.println("Selecciona una opcion");
        System.out.println("1.Maestro");
        System.out.println("2.Alumno");
        System.out.println("3.Administrador");
        a=leer.nextInt();
        obb.getNombre();
        obb.getApellidoP();
        obb.getApellidoM();
        obb.getCurp();
        obb.getEdad();
        obb.getTelefono();
        obb.getCorreo();
        
        switch (a){
            case 1:
                
                ob.getNcedula();
                ob.getNempleado();
                
                break;
        
            case 2:
                
                obj.getmatricula();
                
                break;
                
            case 3:
                
                obe.getNempleado();
                obe.getcargo();
                
                break;
                
        }
        
        }
        
        
    }
    

