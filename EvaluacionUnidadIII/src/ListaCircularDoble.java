public class ListaCircularDoble {
    Nodo primero;
    Nodo ultimo;
    int lenght;

    /**
     * Contructr de la clase, y los 2 punteros crean apuntando a nulo
     */
    public ListaCircularDoble() {
        primero = null;
        ultimo = null;
    }

    /**
     * Vacia
     * Metodo para verificar si la lista esta vacia o no
     * 
     * @return true | false
     */
    public boolean Vacia() {
        return primero == null;
    }

    /**
     * ingresarNodo.
     * Metodo para agregar un nuevo elemento a la lista.
     * Recibe un objeto de tipo Empleado
     * 
     * @param e
     */
    public void ingresarNodo(Empleado e) {
        Nodo nuevo = new Nodo(e); // Se crea un nuevo nodo
        if (Vacia()) { // Si la lista esta vacia el nuevo nodo se pone como el primero y como ultimo
            primero = nuevo;
            primero.sig = primero;
            ultimo = nuevo;
            nuevo.ant = ultimo;
        } else { // si no esta vacia el nuevo nodo se convirte en el ultimo
            ultimo.sig = nuevo;
            nuevo.sig = primero;
            nuevo.ant = ultimo;
            ultimo = nuevo;
            primero.ant = ultimo;
        }
        lenght++;
    }

    /**
     * BuscarNodo
     * Metodo para bucar el nodo por el nombre del empleado
     * @param nombre Nombre del empleado a buscar
     */
    public void BuscarNodo(String nombre) {
        Nodo actual = primero; // Nodo temporal para recorrer la lista
        boolean encontrado = false; // Bandera booleana para ayudar a controlar el ciclo
        if (actual != null) { // si actual no es nulo se el proceso de busca
            do {
                if (actual.empleado.getNombre().equals(nombre)) { //actual trae cada elemento de cada nodo, tomamos el nombre y lo comparamos con el deseado y si lo encuentra muestra los datos
                    System.out.println("Encontrado\n" + actual.empleado.toString());
                    encontrado = true;
                }
                actual = actual.sig; //si no lo encuentra pasa al siguiente nodo
            } while (actual != ultimo && encontrado == false); // repite esto mientras que actual sea diferente a nulo y no se 
        }
    }

    /**
     * EliminarNodo
     * Elimninar nodos por medio del nombre del empleado
     * ! Sale error al querer eliminar cuando hay un solo nodo
     * @param nombre
     */
    public void EliminarNodo(String nombre) {
        Nodo actual = primero;
        Nodo anterior = null; // nodo para guardar el nodo anterior
        boolean encontrado = false;
        if (actual != null) {
            do {
                if (actual.empleado.getNombre().equals(nombre)) { //Cuando se encuentra el nodo compara en que posicion esta
                    System.out.println("Se encontro");
                    encontrado = true;
                    if (actual == primero) { // si es el primero
                        primero = primero.sig; // el segundo ahora es el primero
                        primero.ant = ultimo; // actualizamos el puntero anterior para que ahora apunte al ultimo en vez al que eera el primero
                        ultimo.sig = primero; // actualizamos el punto siguiente del utimo para que apunte al primero
                        System.out.println("Se elimino el primer nodo");
                    } else if (actual == ultimo) { // si es el ultimo
                        ultimo = anterior; // el nodo anterior ahora es el ultimo
                        ultimo.sig = primero; // actualizamos el puntero siguiente con el primero
                        primero.ant = ultimo; // actualizamos el puntero anterior primero con el ultimo actual
                        System.out.println("Se elimino el ulyimo nodo");
                    } else { // Si no cumple con ninguno es por que es un dodo del medio
                        anterior.sig = actual.sig; // actualizamos el punbtero siguiente del nodo anterior con el nodo siguiente del actual
                        actual.sig.ant = actual; // actualizamos el puntero anterior del nodo siguiente con el actual
                        System.out.println("Se elimino el nodo del medio");
                    }
                }
                anterior = actual; //guardamos el nodo actual en anterior
                actual = actual.sig; // recorremos al siguente nodo
            } while (actual != primero && encontrado == false);
            lenght--;
        }
    }

    /**
     * DesplegarAdelante
     * Metodo para mostrar los elementos de izquierda a derecha
     */
    public void DesplegarAdelante() {
        if (!Vacia()) {
            Nodo actual = primero;
            do {
                System.out.println(actual.empleado.toString());
                actual = actual.sig;
            } while (actual != primero);
            actual = null;
        } else {
            System.out.println("No hay nada");
        }
    }
    
    /**
     * DesplegarAtras
     * Metodo para mostrar los elementos de derecha a izquierda
     */
    public void DesplegarAtras() {
        if (!Vacia()) {
            Nodo actual = ultimo;
            do {
                System.out.println(actual.empleado.toString());
                actual = actual.ant;
            } while (actual != ultimo);
            actual = null;
        } else {
            System.out.println("No hay nada");
        }

    }
}
