public class Nodo {
    /**
     * Atributo
     **Object - es la clase padre de todos los tipos de dato, y asi el atriibuto acepta sin importar cual sea
     */
    Object valor;
    /**
     **Apuntador que contiene la direccion del siguiente nodo
     */
    Nodo siguiente;

    /**
     * @param valor
     * TODO: constructRructor de la clase y recibe el valor que guardara
     */
    public Nodo(Object valor){
        this.valor = valor;
        siguiente = null;
    }

    /**
     * @return valor
     * TODO: metodo retorna lo que tiene guardado valor
     */
    public Object obtenerValor(){
        return valor;
    }

    /**
     * Metodo enlzarSiguiente
     * @param n
     * TODO: Guarda el puntero al siguiente nodo de la lista
     */
    public void enlazarSiguiente(Nodo n) {
        this.siguiente = n;
    }

    /**
     * Metodo obtenerSiguiente
     * @return
     * TODO: retorna la localizacion del siguiente nodo
     */
    public Nodo obtenerSiguiente() {
        return siguiente;
    }


}