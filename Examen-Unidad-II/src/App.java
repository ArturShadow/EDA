// Luis Arturo Loya Baca
// TID61D
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[20];
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numeros.length; i++) { //Se utiliza un for poara llenar wel array
            System.out.print("Ingresa el numero # "+ (i+1) + ": ");
            try{ // Se utiliza Try-catch por si se ingresa un valor de tipo que no es aceptado no se detenga la ejecucion
                numeros[i] = Integer.parseInt(leer.readLine()); //En el momento de guardar el valor introducido se parsea a integer
            }
            catch(Exception e){ // Si ingresa un valor que no se puede parsear se le informora al usuario y se dara la opcion de ingresa otro valor
                System.out.print("Introdujiste un valor incorrecto, intenta de nuevo: ");
                numeros[i] = Integer.parseInt(leer.readLine());
                
            }
        }


        
        System.out.println("La lista que introduciste fue:"); //Se mostrarara la lista de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        int aux = 0;
        System.out.println("\nOrdenando lista"); // Se le informara al usuario que se ordenara la lista y el ordenamiento se hace mediante el metodo burbuja
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-i-1; j++) {
                
                if(numeros[j] > numeros[j+1] ){
                    aux = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) { //se muestra la lista ya ordenada
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\n\n\n\n\n\n");
        
        int numMax=0, countMax=0; // tipo int
        int num = 0, count=0;//tipo int
        // se encontrara el numero qe mas se repite
        for (int i = 0; i < numeros.length-1; i++) {
            count= 0; //despues de cada vuelta, contado del numero actual de reinicia
            num = numeros[i]; // Con el for principal se controla el numero actual para comprobar cuamtas veces se encuentra
            for (int j = 0; j < numeros.length-i-1; j++) { // Con este for se recorre el arreglo y se va comparando con el numero actual
                if(i==0){ // en la primera vuelta se guarda lo valores actuales en el numMax y countMax
                    numMax = num;
                    countMax = count;
                }

                if(numeros[j] == num){ //si el numero que esta en las piscion j es igual al numero actual se incrementa el contador
                    count++;
                }

            }
            if(count > countMax){ // Si el contador del numero actual es mayor al de numeromayor se guarda el contado y el numero
                numMax = num;
                countMax = count; 
            }
        }
        System.out.println("El valor que mas se repite es " + numMax + ", son "+ countMax+ " veces y se encuentra en la posicion " + Arrays.binarySearch(numeros, numMax));
    }
}
