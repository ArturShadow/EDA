public class Nodoip{
    private int dato;
    private Nodoip siguiente;

    public Nodoip(){
        siguiente = null;
    }

    public Nodoip(int dato){
        this.dato = dato;
    }
    
    public Nodoip(int dato, Nodoip sig){
        this.dato = dato;
        this.siguiente = sig;
    }

    public Nodoip getSiguiente(){ return siguiente;}
    public void setSiguiente(Nodoip n) {siguiente = n;}

    public int getDato(){return dato;}
    public void setEmpleado(int dato){this.dato = dato;}
    }