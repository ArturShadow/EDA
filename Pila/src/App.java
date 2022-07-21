import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int op = 0;
        do {
            System.out.println("Seleciona la operacion que desea hacer: ");
            System.out.print(
                    "1. Esta vacia\n2. Mostrar tamaño\n3. Mostrar el primer elemento\n4. Limpiar la pila\n5. Insertar un nuevo elemento\n6. Sacar un elemento\n7. Salir\nOpcion --->");
            op = sc.nextInt();
    
            switch (op) {
                case 1:
                    /**
                     * TODO Metodo para saber si la pila esta vacia o no
                     */
                    if(pila.estaVacia()) System.out.println("La pila esta vacia");
                    else System.out.println("La pila no esta cvacia");
                    break;
    
                case 2:
                    /**
                     * TODO metodo para mostrar el tamaño de la pila
                     */
                    System.out.println("El tamaño de la pila es de " + pila.lenght());
                    break;
    
                case 3:
                    /**
                     * TODO Metodo metodo para mostrar el primer elemento de la pila
                     */
                    System.out.println(pila.Primero().toString());
                    break;
    
                case 4:
                    /**
                     * TODO Metodo para limpiar la pila
                     */
                    pila.LimpiarPila();
                    break;
    
                case 5:
                    /**
                     * TODO Metodo para añadir un nuevo elemento
                     */
                    Empleado e = new Empleado();
                    System.out.println("Datos del empleado.");
                    System.out.print("Nombre: ");
                    e.setNombre(sc.next());
                    System.out.print("Apellidos.\n Paterno: ");
                    e.setaPaterno(sc.next ());
                    System.out.print("Materno: ");
                    e.setaMaterno(sc.next ());
                    System.out.print("Correo: ");
                    e.setCorreo(sc.next ());
                    System.out.print("Telefono: ");
                    e.setTelefono(sc.next ());
                    System.out.print("Edad: ");
                    e.setEdad(sc.nextInt());
                    pila.IngresarNuevo(e);
                    break;
    
                case 6:
                    /**
                     * TODO Metodo para saca un elemento de la pila
                     */
                    pila.sacarEmpleado();
                    break;
            }
        } while (op < 7);
        sc.close();
    }
}