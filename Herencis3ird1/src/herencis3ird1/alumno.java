package herencis3ird1;


public class alumno extends Personas {
    public int matricula;
    public alumno(){
    super(); //se pase la informacion y contructor vacio
    }
    
    public void setalumno(int matricula){
    this.matricula=matricula;
    }
    public void getalumno(int matricula){
    this.matricula=matricula;
    }
    
    public void setmatricula(){
        System.out.println("Ingresa tu matricula: ");
        matricula=leer.nextInt();
    
    }
    public void getmatricula(){
        System.out.println("Ingresa tu matricula: ");
        matricula=leer.nextInt();
    
    }
    
}
