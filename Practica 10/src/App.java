import java.util.Scanner;

import Figuras.Cuadrado;
import Figuras.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var op = 0;
        
        System.out.print("¿Cual es la figura?\n1. Triangulo\n2. Cuadrado");
        switch(op){
            case 1:
                var figura = new Triangulo();

            break;
        }

        sc.close();
    }
}
