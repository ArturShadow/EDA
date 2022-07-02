public class Nodo {
    /**
     * dato que guarda el nodo
     */
    int inf;
    /**
     * Puntero que guarda la direccion del nodo anterior
     */
    Nodo ant;
    /**
     * Puntero que guarda la direccion del nodo siguiente
     */
    Nodo sig;

    /**
     * Constreuctor del nodo
     * @param valor
     */
    public Nodo(int valor) {
        inf = valor;
        sig = null;
        ant = null;
    }

}
