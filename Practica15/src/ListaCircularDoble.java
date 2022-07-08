public class ListaCircularDoble {
    private Nodo raiz;

    public ListaCircularDoble() {
        Nodo cab = new Nodo();
        raiz = cab;
        raiz.anterior = cab;
        raiz.siguiente = cab;
    }

    public void addOrden(Empleado empleado) {
        Nodo nuevo = new Nodo(empleado);

        if (raiz.siguiente == null) {
            raiz.siguiente = nuevo;
            nuevo.siguiente = raiz;

            raiz.anterior = nuevo;
            nuevo.anterior = raiz;
        } else {
            Nodo p1 = raiz.siguiente, p2 = raiz.siguiente;

            while (p2.siguiente != raiz && p2.empleado.getEdad() > empleado.getEdad()) {
                p1 = p2;
                p2 = p2.siguiente;
            }

            if (p1 == p2) {
                raiz.siguiente = nuevo;
                nuevo.siguiente = p1;
                p2.anterior = nuevo;
                nuevo.anterior = raiz;
            } else {
                p1.siguiente = nuevo;
                nuevo.siguiente = p2;
                
                p2.anterior = nuevo;
                nuevo.anterior = p1;
            }

        }
    }

    public void mostrarID() {
        Nodo ptr = raiz.siguiente;
        while (ptr != raiz) {
            System.out.println(ptr.empleado.toString());
            ptr = ptr.siguiente;
        }
    }

    public void addEnd(Empleado empleado) {
        Nodo nuevo = new Nodo(empleado);
        Nodo p1=raiz.anterior, p2 = raiz;

        /*
         * conexiones
         */

        p1.siguiente = nuevo;
        nuevo.siguiente = p2;
        p2.anterior =  nuevo;
        nuevo.anterior = p1;

    }
}