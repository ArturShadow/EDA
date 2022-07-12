public class Nodo {
    Nodo anterior;
    Empleado empleado;
    Nodo siguiente;

    public Nodo(Empleado empleado) {
        anterior = null;
        this.empleado = empleado;
        siguiente=null;
    }

    public Nodo() {
        anterior = null;
        empleado = null;
        siguiente = null;
    }
}
