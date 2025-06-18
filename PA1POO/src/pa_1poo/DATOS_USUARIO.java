
package pa_1poo;
import java.util.Scanner;
//JOHANNA LIZBETH ORTIZ JUAREZ

public class DATOS_USUARIO {
    Scanner scanner = new Scanner(System.in);
     String nombreCompleto;
     String curp;
     
    private String rfc, año,mes,dia,estado, estcivil,gen;
    int cantidadNombres,contadorNombres,cantidadApellidos,contadorApellidos;
    protected double peso,estatura;
    
             
        public DATOS_USUARIO (){            
      super();//MI CONSTRUCTOR VACIO
        }
        
        public DATOS_USUARIO (String nombreCompleto,String año,String mes,String dia,String curp,String rfc,String estado,String estrcivil,String gen,int peso,int cantidadNombres,int contadorNombres,int cantidadApellidos,int contadorApellidos){
    this.cantidadApellidos = cantidadApellidos;
         this.cantidadNombres = cantidadNombres;
         this.contadorApellidos = contadorApellidos;
         this.contadorNombres = contadorNombres;
         this.nombreCompleto = nombreCompleto;
         this.curp = curp;
         this.rfc = rfc;
         this.estado = estado;
         this.estcivil =  estcivil;
         this.gen = gen;
         this.peso = peso;
         this.estatura = estatura;        
        this.año = año;
        this.mes = mes;
        this.dia = dia;
}
        
        public void AGREGARDATOS() {
        do {//PREGUNTA, CANTIDAD NOMBRES
            System.out.print("¿NOMBRES A INGRESAR?(minimo 2): ");
            cantidadNombres = scanner.nextInt();
        } while (cantidadNombres != 1 && cantidadNombres != 2);

        scanner.nextLine(); // limpiar buffer
        nombreCompleto = "";

        contadorNombres = 0;
        do {//INGRESAR NOMBRES
            System.out.print("INGRESE NOMBRE(S) " + (contadorNombres + 1) + ": ");
            String nombre = scanner.nextLine();
            nombreCompleto += nombre + " ";
            contadorNombres++;
        } while (contadorNombres < cantidadNombres);

        
        do {//PREGUNTA, CANTIDAD APELLIDOS
            System.out.print("¿APELLIDOS A INGRESAR?(minimo 2): ");
            cantidadApellidos = scanner.nextInt();
        } while (cantidadApellidos != 1 && cantidadApellidos != 2);

        scanner.nextLine(); // limpiar buffer
        contadorApellidos = 0;
        do {//INGRESAR APELLIDOS
            System.out.print("INGRESE APELLIDO(S) " + (contadorApellidos + 1) + ": ");
            String apellido = scanner.nextLine();
            nombreCompleto += apellido + " ";
            contadorApellidos++;
        } while (contadorApellidos < cantidadApellidos);

    }
//RECLUTAR LOS DATOS INGRESADOS Y ENCADENAR
    public void MOSTRAR_NOM_COMPLETO() {
        System.out.println("\nNOMBRE COMPLETO INGRESADO:");
        System.out.println(nombreCompleto.trim());
    }
    
    public void CURP_USUARIO(){
        System.out.println("INGRESE SU CURP PORFAVOR ");
        curp = scanner.nextLine();
        if (curp.length()==18){
            
            System.out.println("AHORA INGRESE SU RFC PORFAVOR ");
            rfc = scanner.nextLine();
            if (rfc.length() >=10 && rfc.length() <=13){
                System.out.println("VALIDADO CORRECTAMENTE ");
                
                System.out.println("\nPORFAVOR INDIQUE QUE SI ACEPTA QUE LE INDIQUEMOS SU FECHA DE NACIMIENTO(SI)");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("NO")) {
                    System.out.println("ES NECESARIO ESTE REQUISITO PARA CONTINUAR  ");
                }else {
                    año = curp.substring(4, 6);
                    mes = curp.substring(6, 8);
                    dia = curp.substring(8, 10);
                    System.out.println("SU FEHCA DE NACIMIENTO ES: "+ dia.trim()+" / "+mes.trim()+" / "+año.trim());
                }
            }else{
                System.out.println("ALGO FALLO AL DIGITAR LO SOLICITADO");
            }
        }else {
            System.out.println("ALGO FALLO EN EL CURP ");            
        } 
    }
   public void RECIDENCIA(){
        System.out.println("INGRESE SU ESTADO ACTUAL DONDE VIVE : ");
        estado=scanner.nextLine();
    }           
    public void ESTATUS_CIVIL(){
        System.out.println("¿ESTADO CIVIL ACTUAL? ");
        estcivil=scanner.nextLine();
}
     public void GENERO(){
        System.out.println("¿SEXO?(F ó M) ");
        gen=scanner.nextLine();
     }
    public void PESO_ESTATURA(){
       System.out.print(" INGRESE SU PESO PORFAVOR ");
        peso = scanner.nextDouble();

        System.out.print("INGRESE SU ESTATURA PORVAFOR ");
        estatura = scanner.nextDouble(); 
        scanner.nextLine();
}
    
      public void DATOS_ACTUALIZADOS() {
        System.out.println("\n------BIENVENIDO USUARIO------");
        System.out.println(nombreCompleto.trim());
          System.out.println("SUS DATOS RECLUTADO FUERON: ");
          System.out.println("ESTADO RECIDENCIAL: "+estado.trim());
          System.out.println("ESTADO CIVIL: "+estcivil.trim());
          System.out.println("SEXO: "+gen.trim());
          System.out.println("ESTATURA: "+peso+" kg");
            System.out.println("PESO: "+estatura+" m");
          
      }
}
