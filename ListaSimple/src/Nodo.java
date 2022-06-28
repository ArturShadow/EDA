public class Nodo {
    Object valor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Object valor){
        this.valor = valor;
        siguiente = null;
    }

    public Object obtenerValor(){
        return valor;
    }

    public void enlazarSiguiente(Nodo n) {
        this.siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }


}