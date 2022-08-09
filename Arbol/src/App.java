import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String resNuevoArbol = "";
        do {
            Arbol_Binario arbol_Binario = new Arbol_Binario();
            int num, op = 0, cant = 0;
            System.out.print("Cuantos numeros quiere ingresar? ");
            cant = sc.nextInt();
            for (int i =0; i<cant;i++) {
                System.out.print("Ingrese el valor: ");
                num = sc.nextInt();
                arbol_Binario.Insertar(num);
                
            }
            do {
                System.out.println("\n");
                Menu();
                op = sc.nextInt();
                switch (op) {
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
                        case 4:
                        System.out.print("Que numero desea eliminar? ");
                        int numElim = sc.nextInt();
                        if(arbol_Binario.existe(numElim)){
                            if(numElim % 1 == 1  && numElim % numElim == 1){
                                if(arbol_Binario.Eliminar(numElim))
                                System.out.println("Se encontro y se elimino");
                            } else {
                                System.out.println("Se encontro y no se pudo eliminar por que no es primo");
                            }

                        } else {
                            System.out.println("No se encontro " + numElim + " en el arbol");
                        }
                        
                }
            } while (op < 5);
            System.out.print("Quiere crear un nuevo arbol? ");
            resNuevoArbol = sc.next();
        } while (resNuevoArbol.equals("s"));
        sc.close();
    }

    public static void Menu() {
        System.out.print(
                "Seleccione accion que desee realizar.\n1. Recorrer en Preorden\n2.Recorrer inorden\n3. Recorrer en postorden\n4. Eliminar\n5. Salir\nOpcion--> ");

    }
}
