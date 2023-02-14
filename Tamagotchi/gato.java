public class gato { 
    //Atributos 
    String nombre;
    int edad;
    String raza;
    double peso;
    double tamanio;
    String color;

    //Metodo constructor
    public gato (String nombre, int edad, String raza, double peso, double tamanio, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.tamanio= tamanio; 
        this.color= color; 
    }
    
    //Metodos
    public void dormir(){
        System.out.println("Zzzzzzz");
    }

    public void maullar(){
        System.out.println("Miau Miau");
    }
    
    public void ronronear(){
        System.out.println("Meoww Meoww");
    }
    
    public void lamer(){
        System.out.println("Plop! Plop!");
    }
    public void comer(){
        System.out.println ("Dame de comer >:c");
    }
    public void jugar (){
        System.out.println("Humano, juega conmigo :3");
    }
    
}
