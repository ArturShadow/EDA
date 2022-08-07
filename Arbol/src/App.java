import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String resNuevoArbol = "";
        do{
            Arbol_Binario arbol_Binario = new Arbol_Binario();
            String res = "";
            int num, op=0;
            
            do {
                System.out.print("Ingrese el valor: ");
                num = sc.nextInt();
                arbol_Binario.Insertar(num);
                System.out.print("Continuar?");
                res = sc.next();
            } while (res.equals("s"));
            do {
                System.out.println("\n");
                Menu();
                op = sc.nextInt();
                switch(op){
                    case 1:
                    System.out.println("Recorrido preorden");
                    arbol_Binario.recorrerPreOrden();
                    break;
                    case 2:
                    System.out.println("Recorrido inorden");
                    arbol_Binario.recorrerInOrden();
                    break;
                    case 3:
                    System.out.println("Recorrido postorden");
                    arbol_Binario.recorrerPostOrden();
                    break;
                }        
            } while (op < 4);
            System.out.print("Quiere crear un nuevo arbol? ");
            resNuevoArbol = sc.next();
        } while(resNuevoArbol.equals("s"));
        sc.close();
    }
    public static void Menu() {
        System.out.print("Seleccione accion que desee realizar.\n1. Recorrer en Preorden\n2.Recorrer inorden\n3. Recorrer en postorden\n4. Salir\nOpcion--> ");

    }
}
