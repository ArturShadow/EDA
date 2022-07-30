public class ListaCircularDoble {
    Nodo primero;
    Nodo ultimo;
    int lenght;

    public ListaCircularDoble() {
        primero = null;
        ultimo = null;
    }

    public boolean Vacia() {
        boolean resp = false;
        if (primero == null && ultimo == null)
            resp = true;
        else
            resp = false;
        return resp;
    }

    public void ingresarNodo(Empleado e) {
        Nodo nuevo = new Nodo(e);
        if (Vacia()) {
            primero = nuevo;
            primero.sig = primero;
            ultimo = nuevo;
            nuevo.ant = ultimo;
        } else {
            ultimo.sig = nuevo;
            nuevo.sig = primero;
            nuevo.ant = ultimo;
            ultimo = nuevo;
            primero.ant = ultimo;
        }
        lenght++;
    }

    public void BuscarNodo(String nombre) {
        Nodo actual = primero;
        boolean encontrado = false;
        if (actual != null) {
            do {
                if (actual.empleado.getNombre().equals(nombre)) {
                    System.out.println("Encontrado\n" + actual.empleado.toString());
                    encontrado = true;
                }
                actual = actual.sig;
            } while (actual != ultimo && encontrado == false);
        }
    }

    public void EliminarNodo(String nombre) {
        Nodo actual = primero;
        Nodo anterior = null;
        boolean encontrado = false;
        do {
            if (actual.empleado.getNombre().equals(nombre)) {
                System.out.println("Se encontro");
                encontrado = true;
                if (lenght == 1) {
                    primero.sig = null;
                    primero.ant = null;
                } else if (actual == primero) {
                    primero.empleado = null;
                    primero = primero.sig;
                    primero.ant = ultimo;
                    ultimo.sig = primero;
                    System.out.println("Se elimino el primer nodo");
                } else if (actual == ultimo) {
                    ultimo = anterior;
                    ultimo.sig = primero;
                    primero.ant = ultimo;
                    System.out.println("Se elimino el ulyimo nodo");
                } else {
                    anterior.sig = actual.sig;
                    actual.sig.ant = actual;
                    System.out.println("Se elimino el nodo del medio");
                }
            }
            anterior = actual;
            actual = actual.sig;
        } while (actual != primero && encontrado == false);
        lenght--;
    }

    public void DesplegarAdelante() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            System.out.println(actual.empleado.toString());
            actual = actual.sig;
        } while (actual != primero);
        actual = null;
    }
    public void DesplegarAtras() {
        Nodo actual = new Nodo();
        actual = ultimo;
        do {
            System.out.println(actual.empleado.toString());
            actual = actual.ant;
        } while (actual != ultimo);
        actual = null;
    }
}
