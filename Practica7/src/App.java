import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in); //usamos una variable de tipo Scanner
        int[] numeros = new int[10]; // Usamos un arreglo de enteros
        int num = 0, max = 0, min = 0; // usamos 3 variables de tipo entero, num es para el valor recibido, max para el valor mas alto introducido y min para el valor mas bajo introducido
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor #"+ (i+1) + ": "); // preguntamos el valore introducido
            num = sc.nextInt(); //leemos el valor y lo almacenamos en num
            if(i == 0){ // en la primera vuelta guardamos nun en max y min para comparar
                max = num;
                min = num;
            }
            if(num > max){ // si num es mayor que max ento ces num se guarda en max
                max = num;
            }
            if(num < min){ // si nun es menor que min entonces segurda en min
                min = num;
            }
            numeros[i] = num; //se guarda num en el arreglo
        }
        
        System.out.println("Los valores que introdujiste fueron: ");
        for (int numero : numeros) { // usamos for each para mostras los valores del arreglo
            System.out.print(numero + " ");
        }


        System.out.println("El valor maximo fue " + max + " y el menor es " + min); // Mostramos los valores de max y min

        sc.close();
    }
}
