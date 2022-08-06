public class App {
    public static void main(String[] args) throws Exception {
        Arbol_Binario arbol_Binario = new Arbol_Binario();
        Menu();
    }
    public static void Menu() {
        System.out.println("Seleccione accion que desee realizar.\n1. Recorrer en Preorden\n2.Recorrer inorden\n3. Recorrer en postorden");
    }
}
