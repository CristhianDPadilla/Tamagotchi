public class gato { 
    //Atributos 
    String nombre;
    int edad;

    //Metodo constructor
    public gato (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos
    public void dormir(){
        System.out.println("Zzzzzzz");
    }

    public void maullar(){
        System.out.println("Miau Miau");
    }
    
}
