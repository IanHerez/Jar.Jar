package herencis3ird1;


public class Admin extends docente {
    public String cargo;
    public Admin(){
    super();
    }
    
    public void setAdmin(String cargo){
    this.cargo=cargo;
    }
    public void getAdmin(String cargo){
    this.cargo=cargo;
    }
    
     public void setcargo (){
        System.out.println("Ingresa tu cargo: ");
        cargo=leer.next();  
    }
      public void getcargo (){
        System.out.println("Ingresa tu cargo: ");
        cargo=leer.next();  
    }
    
}
