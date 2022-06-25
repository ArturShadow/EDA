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

    public void AgregarFinal(int d) {
        var nodoNuevo = new Nodo(d);
        if(fin == null){qq
            fin = nodoNuevo;
        }
    }

    
}
/*
 * public void insertarFinal (int elemento){ 
    Nodo nuevo = new Nodo(elemento, null);
    if (primero == null){
    primero = nuevo;
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