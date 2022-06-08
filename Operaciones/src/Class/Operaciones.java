package Class;

public class Operaciones {
    public static void VerificarPrimo(int num) {
        boolean primo = true;
        int cont = 0;
        for (int i = 2; i < num/2 && primo == true; i++) {
            if(num % i == 0){
                primo = false;
            }
            cont++;

            if (primo) {
                System.out.println("El numero " + num + " es primo");
            }
            else {
                System.out.println("El numero " + num + " no es primo");
            }

            System.out.println("Contsador vueltas" + cont);
        }
    }

    public static void name() {
        
    }
}