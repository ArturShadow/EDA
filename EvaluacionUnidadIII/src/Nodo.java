public class Nodo {
    Nodo ant;
    Empleado empleado;
    Nodo sig;

    public Nodo(Empleado d) {
        ant = null;
        this.empleado = d;
        sig = null;
    }

    public Nodo() {
        ant = null;
        empleado = null;
        sig = null;
    }
}
