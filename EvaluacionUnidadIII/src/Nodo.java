public class Nodo {
    Nodo ant;
    int inf;
    Nodo sig;

    public Nodo(int inf) {
        ant = null;
        this.inf = inf;
        sig = null;
    }

    public Nodo() {
        ant = null;
        inf = 0;
        sig = null;
    }
}
