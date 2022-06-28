public class App {
    public static void main(String[] args) throws Exception {
        /* Pruebas, video 1
        Nodo primero = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercero = new Nodo("Hols");

        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);

        System.out.println(primero.obtenerSiguiente().obtenerSiguiente().obtenerValor());
        */

        // Pruebas segundo video
        // Listaenlazada lista = new Listaenlazada();
        
        // lista.addPrimero("Jorge");
        // lista.addPrimero(20);
        // lista.addPrimero("Hola, que tal");
        // lista.addPrimero(3);
        // System.out.println("primer elemento " + lista.obtener(0));
        // System.out.println("primer elemento " + lista.obtener(lista.size()-1));
        // System.out.println("Index 2 " + lista.obtener(2));

        // System.out.println("Esta vacia " + lista.estaVacia());
        // System.out.println("Tamaño: " + lista.size());

        Listaenlazada lista = new Listaenlazada();
        System.out.println("Esta vacia: " + lista.estaVacia());
        
        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);

        lista.eliminarPrimero();
        
        System.out.println("Primero: " + lista.obtener(0));
        System.out.println("Ultimo: "+ lista.obtener(lista.size()-1));
        System.out.println("Tamaño: " + lista.size());
        
        System.out.println("Esta vacia: " + lista.estaVacia());
    }
}
