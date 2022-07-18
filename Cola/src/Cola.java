public class Cola {
    private Nodo inicio;
    private Nodo fin;
    int longitud;

    public Cola() {
        inicio = null;
        fin = null;
    }

    public boolean EstaVacia() {
        return inicio == null;

    }

    public int getLongitud() {
        return longitud;
    }

    public void insertarEmpleado(Empleado e) {
        Nodo nuevo = new Nodo(e);
        if (EstaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            nuevo.setSiguiente(null);
            nuevo = null;
        }
        longitud++;
    }

    public Empleado extraerEmpleado(){
        Empleado emp=fin.getEmpleado();
        Nodo aux=inicio,anterior=inicio;
        while(aux.getSiguiente()!=null){
            anterior=aux;
            aux=aux.getSiguiente();
        }
        fin=anterior;
        aux=null;
        longitud--;
        return emp;
    }
}
