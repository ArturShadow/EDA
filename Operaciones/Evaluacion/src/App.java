import java.util.Scanner;

import Class.SumaRecursiva;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            int num = sc.nextInt();
            sc.close();

            System.out.println(SumaRecursiva.Suma(num));

    }
}
