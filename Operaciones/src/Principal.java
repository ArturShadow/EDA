import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        
        var arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());

        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(3);

        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        arr.get(2).add(7);
        arr.get(2).add(8);
        arr.get(2).add(9);

        arr.get(3).add(10);
        arr.get(3).add(11);
        arr.get(3).add(12);
        for (ArrayList<Integer> arrayElemento : arr) {
            for (Integer e : arrayElemento) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
