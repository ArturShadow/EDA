public class Listaenlazada {
    /**
     * *Atributo para indicar el inicio de la lista
     */
    private Nodo cabeza;
    /**
     * * Atributo para saber el tamaño de la lista
     */
    private int size;

    /**
     *TODO constructor de la clase
     */
    public Listaenlazada() {
        cabeza = null;
    }

    /**
     * Metodo estaVacia
     * @return true o false
     * TODO comprueba si la lista esta vacia o no
     */
    public boolean estaVacia() {
        return (cabeza == null) ? true : false;
    }

    /**
     * Metodo addPrimero
     * TODO si la cabeza es nula, entonces entonces se crea un nuevo nodo, si  no se la cabeza se reserva en temp y se crea un nuevo nodo, se enlaza y se convierrte en l nueva cabeza, tambien incrementa el tamañ
     * @param obj
     */
    public void addPrimero(Object obj) {
        if (cabeza == null) {
            cabeza = new Nodo(obj);
        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }

    /**
     * Metodo size
     * TODO retorna el valor de sixe
     * @return size
     */
    public int size() {
        return size;
    }

    /**
     * Metodo obtener
     * TODO recorre la lista hasta encontrar el indice especificado
     * @param index
     * @return valor del nodo
     */
    public Object obtener(int index) {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    /**
     * Metodo elinarPrimero
     * TODO Elimina el primer nodo de la lista
     */
    public void eliminarPrimero() {
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }

    /**
     * Metodo eliminar
     * TODO siel index es 0 solo se saltea hasta el tercxer nodo si no recortre la lista y busca el indice y saltea el nodo siguiente de la posicion actualk y decrementa el tamaño
     * @param index
     */
    public void eiminar(int index) {
        if (index == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int contador = 0;
            Nodo temporal = cabeza;
            while (contador < index - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    /**
     * Metodo cortar
     * TODO recorre la lista y cuando encuantra la posicion, el aopuntador del nodo lo establece como null
     * @param index
     */
    public void cortar(int index) {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        size = index;
    }
}
