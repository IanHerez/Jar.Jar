
package herencis3ird1;


public class docente extends Personas {
    public int Nempleado, cedula;//atributo
    public docente(){
    super();
    }
    
    public void setdocente(int Nempleado, int cedula){
    this.Nempleado=Nempleado;
    this.cedula=cedula;
    }
    
    public void getdocente(int Nempleado, int cedula){
    this.Nempleado=Nempleado;
    this.cedula=cedula;
    }
    public void setNempleado (){
        System.out.println("Ingresa tu numero de empleado: ");
        Nempleado=leer.nextInt();  
    }
    public void getNempleado (){
        System.out.println("Ingresa tu numero de empleado: ");
        Nempleado=leer.nextInt();  
    }
    
    public void setNcedula (){
        System.out.println("Ingresa tu numero de cedula: ");
        cedula=leer.nextInt();  
    }
    public void getNcedula (){
        System.out.println("Ingresa tu numero de cedula: ");
        cedula=leer.nextInt();  
    }
    
}
