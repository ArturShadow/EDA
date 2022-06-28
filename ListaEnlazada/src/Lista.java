public class Lista {
    //Punteros paraq conocer el inicio y final
    public Nodo inicio, fin;

    public Lista() { // Constructor de la clase
        inicio = null;
        fin    = null;
    }

    public void AgregarInicio(int e) { // Metodo psra sgregar un mtodo alinicio
        inicio = new Nodo(e,inicio);

        if(fin==null){
            fin=inicio;
        }
    }

    // Metodo para mostrar 
    public void mostrarLists() {
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]-------->");
            recorrer=recorrer.siguiente;
        }
        System.out.println();
    }

    public void agregarFinal(int d) {
        Nodo nuevoNodo = new Nodo(d, null);
    if (inicio == null){
        inicio = nuevoNodo;
    }
    else {
        Nodo actual = inicio;
        while (actual.siguiente!= null){
            actual = actual.siguiente;
            
            }
        actual.siguiente = nuevoNodo;
        }
        System.out.println("Final");
    }

    public void insertarMedio(int d) {
        Nodo nuevoNodo = new Nodo(d,fin);
        if(inicio == null){
            inicio = nuevoNodo;
        }
        else{
            Nodo aux = 
        }
    }

    
}

/*
    public void insertarFinal (int elemento){ 
    Nodo nuevoNodo = new Nodo(elemento, null);
    if (primero == null){
        primero = nuevoNodo;
    }
    else {
        Nodo actual = primero;
        while (actual.getSig()!= null){
            actual = actual.getSig();
            
            }
        actual.setSig(nuevo);
        numElem++;
        }
        System.out.println("Final");
    }
 */