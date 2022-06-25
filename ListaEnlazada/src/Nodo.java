public class Nodo{
    public int dato;
    public Nodo siguiente;

    public Nodo(int d) { // Agrega elementos al final
        this.dato = d;
    }

    public Nodo(int d, Nodo n) { // Agrega elemento al inicio
        this.dato=d;
        this.siguiente = n;
    }
}