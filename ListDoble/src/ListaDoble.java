public class ListaDoble {

    Nodo r1, r2;

    public ListaDoble() {

    }

    public void addOrden(int valor) {
        Nodo nuevo = new Nodo(valor);
        if ((r1 == null) && (r2 == null)) {
            r1 = nuevo;
            r2 = nuevo;
        } else {
            Nodo p1 = r1;
            Nodo p2 = r2;
            while ((p2 != null) && (p2.inf < valor)) {
                p1 = p2;
                p2 = p2.sig;
            }
            if (p1 == p2) {
                r1 = nuevo;
                p1.ant = nuevo;
            } else {
                p1.sig = nuevo;
                nuevo.sig = p2;
                if (p2 == null){
                    r2 = nuevo;
                    nuevo.ant = p1;
                }
                else{
                    p2.ant = nuevo;
                    nuevo.ant = p1;
                }
            }
        }
    }

    public void mostrarD() {
        Nodo ptr = r1;
        while(ptr != null){
            System.out.print(ptr.inf+"--> ");
            ptr = ptr.sig;
        }
    }
}
