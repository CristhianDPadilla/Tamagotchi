
public class perro {
    //Atributos
    
    String nombre;
    String raza;
    String genero;
    int    edad;
    String color;
    double tamanio;
    
    
    
    
    //Método constructor
    public perro (String nombre, String raza, String genero, int edad, String color, double tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.color=color;
        this.tamanio=tamanio; 
    }
    
    
    //Métodos
    
    public void ladrar(){
        
        System.out.println("Guau Guau");
    
    }
    
    public void aullar(){
    
        System.out.println("aúúúúúú");
    }

    public void comer(){

        System.out.println("ñam ñam ñam");
    }

    public void Acostarse(){

        System.out.println("Zzzzzzzz");
    }
    
   public void morder(){
       System.out.println("tengo sueñoooo");
   }
   public void jugar(){
       System.out.println("Quiero jugar");
    
    
}
