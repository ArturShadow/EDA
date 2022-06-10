import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in); //usamos una variable de tipo Scanner
        var numeros = new ArrayList<Integer>(); // Usamos un arreglo de enteros
        int num = 0, max = 0; // usamos 3 variables de tipo entero, num es para el valor recibido
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor #"+ (i+1) + ": "); // preguntamos el valore introducido
            num = sc.nextInt(); //leemos el valor y lo almacenamos en num
            if(i == 0){ // en la primera vuelta guardamos nun en max y min para comparar
                max = num;
            }
            if(num > max){ // si num es mayor que max ento ces num se guarda en max
                max = num;
            }
            numeros.add(num); //se guarda num en el arreglo
        }
        System.out.println("Los valores que introdujiste fueron: ");
        for (int numero : numeros) { // usamos for each para mostras los valores del arreglo
            System.out.print(numero + " ");
        }
        System.out.println("\nEl valor maximo fue " + max + " y su posicion en el arreglo es: " + numeros.indexOf(max)); // Mostramos los valores de max y su indice en el arreglo
        sc.close();
    }
}
