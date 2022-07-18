public class PilaIP {
    private Nodoip tope;
    private int lenght;
    
    /**
     * contructor de la clase
     */
    public PilaIP() {
        tope = null;
        lenght = 0;
    }
    /**
     * 
     * @return true o false
     */
    public boolean estaVacia() {
        return tope==null;
    }

    /**
     * Metodo para ingresar un nuevo elemento a la pila
     * @param e
     */
    public void IngresarNuevo(int e) {
        Nodoip nuevo = new Nodoip(e); //primero se crea el nuevo nodoip
        nuevo.setSiguiente(tope); // En la parte siguiente del nuevo nodoip s guarda la direccion del primer nodoip actual
        tope = nuevo; // El nuevo nodoip se convierte en el tope de la pila
        lenght++; // aumeenta la longitud
    }
    /**
     * Metodo para sacar el elemento que esta hasta arriba de la pila y mostrar el empleado 
     */
    public int sacarDato(){
        int aux=tope.getDato();// 
        tope=tope.getSiguiente();
        lenght--;
        return aux;
    }
    /**
     * Metodo para sacar un elemento
     */
    public void sacarElemento(){
        tope=tope.getSiguiente();
        lenght--;
    }
    

    /**
     * Metodo para obtener un la informacion del primer elemento de la pila
     * @return
     */
    public int Primero(){
        return tope.getDato();
    }

    /**
     * Regrea la longitud de la pila
     * @return
     */
    public int lenght(){
        return lenght;
    }

    /**
     * elimina todo los elentos de la pila
     */
    public void LimpiarPila(){
        while(estaVacia()){
            sacarElemento();
        }
    }
}
