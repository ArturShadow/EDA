import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        var leer = new BufferedReader(new InputStreamReader(System.in));

        /* int n,a;
        ListaDoble listaDoble = new ListaDoble();
        System.out.print("Cuantos elementos deseas agregar? ");
        n = Integer.parseInt(leer.readLine());
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(leer.readLine());
            listaDoble.addOrden(a);
        }
        listaDoble.mostrarD(); */

        System.out.println();

        ListaDoble a = new ListaDoble();
        ListaDoble b = new ListaDoble();

        String x = leer.readLine();
        String y = leer.readLine();

        for (int i = 0; i < args.length; i++) {
            
        }

    }
}
