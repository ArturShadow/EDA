public class Arbol_Nodo {
    Arbol_Nodo left;
    int data;
    Arbol_Nodo right;

    public Arbol_Nodo(int dato) {
        this.left = null;
        this.data = dato;
        this.right = null;
    }

    public Arbol_Nodo() {
        this.left = null;
        this.data = 0;
        this.right = null;
    }
}
