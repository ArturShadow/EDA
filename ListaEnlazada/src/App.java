import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        var leer = new BufferedReader(new InputStreamReader(System.in));

        int op = 0;
        int elemento;

        var listaNums = new Lista();

        do {
            System.out.print("1. Agregar el primer elemento a la lista\n2. Mostrar lista\n3. Agregar al final\nTerminar lista\nOpcion -->");

            op = Integer.parseInt(leer.readLine());

            switch (op) {
                case 1:
                    System.out.print("Ingresa el elemento: ");
                    elemento = Integer.parseInt(leer.readLine());
                    //Se agregan elementos a la lista
                    listaNums.AgregarInicio(elemento);
                    break;

                case 2:
                    listaNums.mostrarLists();
                    break;

                case 3:
                    System.out.print("Ingresa el elemento: ");
                    elemento = Integer.parseInt(leer.readLine());
                    //Se agregan elementos a la lista
                    listaNums.AgregarFinal(elemento);
                    break;
            
                default:
                    System.out.println("No exite esa opcion...");
                    break;
            }
            
        } while (op<=3);
    }
}
