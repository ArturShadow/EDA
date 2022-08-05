import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaCircularDoble lcd = new ListaCircularDoble();
        int opcion = 0;

        do {
            System.out.println("\n\n");
            System.out.print(
                    "1. Ingresar nodo\n2. Buscar Nodo\n3. Verificar estado de la lista\n4.Eliminar\n5. Desplegar Adelante\n6. Desplegar Atras\n7. Numero de elementos\n8. Salir\nOpcion -->");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Empleado e = new Empleado();
                    System.out.println("Datos del empleado.");
                    System.out.print("Nombre: ");
                    e.setNombre(sc.next());
                    System.out.print("Apellidos.\n Paterno: ");
                    e.setaPaterno(sc.next());
                    System.out.print("Materno: ");
                    e.setaMaterno(sc.next());
                    System.out.print("Correo: ");
                    e.setCorreo(sc.next());
                    System.out.print("Telefono: ");
                    e.setTelefono(sc.next());
                    System.out.print("Edad: ");
                    e.setEdad(sc.nextInt());

                    // System.out.println(e.toString());
                    lcd.ingresarNodo(e);
                    break;
                case 2:
                    System.out.println("Que empleado quiere encontrar?");
                    lcd.BuscarNodo(sc.next());
                    break;
                case 3:
                    if (lcd.Vacia())
                        System.out.println("Esta vacia");
                    else
                        System.out.println("Tiene elementos");
                    break;
                case 4:
                    if (!lcd.Vacia()) {
                        System.out.print("Digame que empleado quiere eliminar: ");
                        lcd.EliminarNodo(sc.next());
                    } else {
                        System.out.println("La lista esta vacia, no se puede realizar esta accion");
                    }
                    break;
                case 5:
                    lcd.DesplegarAdelante();
                    break;
                case 6:
                    lcd.DesplegarAtras();
                    break;
                case 7:
                    System.out.println("Tamaño de la lista es de " + lcd.lenght);
                    break;
            }
        } while (opcion < 8);
        sc.close();
    }
}
