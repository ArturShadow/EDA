public class Listaenlazada {
    private Nodo cabeza;
    private int size;

    public Listaenlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return (cabeza==null)?true:false;
    }

    public void addPrimero(Object obj) {
        if(cabeza==null){
            cabeza = new Nodo(obj);
        }
        else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public Object obtener(int index) {
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador<index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public void eliminarPrimero() {
        cabeza=cabeza.obtenerSiguiente();
        size--;
    }

    public void eiminar(int index) {
        if(index == 0){
            cabeza = cabeza.obtenerSiguiente();     
        }
        else{
            int contador = 0;
        Nodo temporal = cabeza;
        while(contador<index-1){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
    }
}
