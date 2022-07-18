public class Nodo{
    int dato;
    Nodo siguente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguente = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }
}