public class ListaCircularDoble {
    /**
     * Nodo inicial
     */
    private Nodo raiz;
    private int cantidad;

    /**
     * Constructor de la lista circular doble
     */
    public ListaCircularDoble() {
        /**
         * Nodo Cabeza de la lista
         */
        Nodo cab = new Nodo(-99999);
        raiz = cab;
        raiz.sig = cab;
        raiz.ant = cab;
        cantidad = 0;
    }

    /**
     * Metodo para gregar en orden nodos a la lista
     * 
     * @param valor
     */
    public void addOrden(int valor) {
        /**
         * se crea un nuevo nodo
         */
        Nodo nuevo = new Nodo(valor);
        /**
         * Si el nodo raiz esta vacio, entonces el puntero siguiente de raiz se dirigira
         * al nuevo nodo y el del nuvo nodo a raiz, y hace lo mismo hacia atras
         */
        if (raiz.sig == null) {
            raiz.sig = nuevo;
            nuevo.sig = raiz;

            raiz.ant = nuevo;
            nuevo.ant = raiz;
        } else {
            /**
             * En orden ascendente
             */

            Nodo p1 = raiz.sig, p2 = raiz.sig;
            /**
             * Mientras que p2.sig sea diferente a la raiz y p2.inf sea menor al valor
             * recibido, se sigue recorriendo la lista
             */
            while (p2.sig != raiz && p2.inf > valor) {
                p1 = p2;
                p2 = p2.sig;
            }

            if (p1 == p2) {

                raiz.sig = nuevo;
                nuevo.sig = p1;
                p2.ant = nuevo;
                nuevo.ant = raiz;
            } else {
                p1.sig = nuevo;
                nuevo.sig = p2;

                p2.ant = nuevo;
                nuevo.ant = p1;
            }
        }
        cantidad++;
    }

    public void mostrarID() {
        Nodo ptr = raiz.sig;
        while (ptr != raiz) {
            System.out.print(ptr.inf + " - ");
            ptr = ptr.sig;
        }
    }

    /**
     * dado dos numeros grandes mostrar la suma de ambos utilizando listas
     */
    
    public void addEnd(int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo p1=raiz.ant, p2 = raiz;

        /*
         * conexiones
         */

        p1.sig = nuevo;
        nuevo.sig = p2;
        p2.ant =  nuevo;
        nuevo.ant = p1;

    }

    public String suma(ListaCircularDoble b) {
        String resultado = "";
        Nodo p1 = raiz.ant, p2 = b.raiz.ant;
        int a, piv = 0,digito;
        while(p1 != raiz && p2 != b.raiz){
            a = p1.inf + p2.inf + piv;
            piv = a / 10;

            digito = (a % 10);
            resultado = digito+resultado;
        }
        return resultado;
    }

    public int getCantidad() {
        return cantidad;
    }
}
