import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = new int[20];
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.print("Ingresa el numero # "+ (i+1) + ": ");
        //     try{
        //         numeros[i] = Integer.parseInt(leer.readLine());
        //     }
        //     catch(Exception e){
        //         System.out.print("Introdujiste un valor incorrecto, intenta de nuevo: ");
        //         numeros[i] = Integer.parseInt(leer.readLine());
                
        //     }
        // }

        int[] numeros = {10,25,3,18,3,16,25,24,65,7,8,29,10,14,10,16,2,9,5,21};
        System.out.println();

        System.out.println(numeros[0]);
        
        System.out.println("La lista que introduciste fue:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        int aux = 0;
        System.out.println("\nOrdenamiento");
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-i-1; j++) {
                
                if(numeros[j] > numeros[j+1] ){
                    aux = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\n\n\n\n\n\n");
        
        int numMax=0, countMax=0;
        int numMin=0, countMin=0;
        int num = 0, count=0;
        for (int i = 0; i < numeros.length; i++) {
            num = numeros[i]
            for (int j = 0; j < numeros.length; j++) {
            }
        }

        System.out.println("El valor que mas se repite es " + numMay);
    }
}
