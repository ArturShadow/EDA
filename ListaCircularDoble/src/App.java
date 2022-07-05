import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
        // int n,a;

        // System.out.print("Cantidad de numeros a agregar. ");
        // n = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        //     a = sc.nextInt();   
        //     listaCircularDoble.addOrden(a);
        // }

        // listaCircularDoble.mostrarID();

        String x,y;
        x = sc.next();
        y = sc.next();

        int aux;

        ListaCircularDoble a = new ListaCircularDoble();
        ListaCircularDoble b = new ListaCircularDoble();

        for (int i = 0; i < x.length(); i++) {
            aux = Integer.parseInt(x.charAt(i) + "");
            a.addEnd(aux);
        }
        
        for (int i = 0; i < y.length(); i++) {
            aux = Integer.parseInt(y.charAt(i) + "");
            b.addEnd(aux);
        }
        System.out.println("Lista A");
        a.mostrarID(); 
        System.out.println("\nLista B");
        b.mostrarID(); 
        sc.close();
    }
}
