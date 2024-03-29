public class Pila {
    private Nodo tope;
    private int lenght;
    
    /**
     * contructor de la clase
     */
    public Pila() {
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
    public void IngresarNuevo(Empleado e) {
        Nodo nuevo = new Nodo(e); //primero se crea el nuevo nodo
        nuevo.setSiguiente(tope); // En la parte siguiente del nuevo nodo s guarda la direccion del primer nodo actual
        tope = nuevo; // El nuevo nodo se convierte en el tope de la pila
        lenght++; // aumeenta la longitud
    }
    /**
     * Metodo para sacar el elemento que esta hasta arriba de la pila y mostrar el empleado 
     */
    public Empleado sacarEmpleado(){
        Empleado aux=tope.getEmpleado();// 
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
    public Empleado Primero(){
        return tope.getEmpleado();
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
