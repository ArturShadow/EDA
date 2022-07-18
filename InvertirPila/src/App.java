public class App {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();
        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);
        pila.Apilar(4);
        System.out.println(pila.MostrarPila());

        System.out.println("\n\n");
        System.out.println(pila.invertirPila());
    }
}
/***#0*# */