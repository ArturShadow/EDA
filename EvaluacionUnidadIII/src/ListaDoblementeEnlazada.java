public class ListaDoblementeEnlazada {
    Nodo raiz;
    int lenght;

    public ListaDoblementeEnlazada() {
        Nodo cab = new Nodo();
        raiz = cab;
        raiz.ant = cab;
        raiz.sig = cab;
        lenght = 0;
    }

    public void Agregar() {

    }

    public void AgregarOrden(int d) {
        Nodo nuevo = new Nodo(d);
        if (raiz.sig == null) {
            raiz.sig = nuevo;
            nuevo.sig = raiz;
            raiz.ant = nuevo;
            nuevo.ant = raiz;
        } else {
            Nodo p1 = raiz.sig, p2 = raiz.sig;

            while (p2.sig != raiz && p2.inf > d) {
                p1 = p2;
                p2.sig = p2;
            }
            if(p1 == p2){
                raiz.sig = nuevo;
                nuevo.sig = p1;
                p2.ant = nuevo;
                nuevo.ant = p1;
            }else{
                p1.sig = nuevo;
                nuevo.sig = p2;
                p2.ant = nuevo;
                nuevo.sig = p1;
            }
        }
        lenght++;
    }

    public void MostrarID() {
        Nodo ptr = raiz.sig;
        while (ptr != raiz) {
            System.out.println(ptr.inf + " ");
            ptr = ptr.sig;
        }
    }
    
    public void MostrarDI() {
        Nodo ptr = raiz.sig;
        while (ptr != raiz) {
            System.out.println(ptr.inf + " ");
            ptr = ptr.ant;
        }
    }
}
