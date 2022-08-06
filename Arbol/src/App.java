public class App {
    public static void main(String[] args) throws Exception {
        Arbol_Binario arbol_Binario = new Arbol_Binario();

        int[] numeros = {10, 15, 4, 1, 6, 17, 19, 45, 23, 31};
        for (int numero : numeros) {
            arbol_Binario.Insertar(numero);
        }

        System.out.println("Orden preorden");
        arbol_Binario.recorrerPreOrden();
        System.out.println("\nOrden inorden");
        arbol_Binario.recorrerInOrden();
        System.out.println("\nOrden postorden");
        arbol_Binario.recorrerPostOrden();
    }
}
