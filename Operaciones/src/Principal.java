import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        
        var arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());

        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(3);
        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        // System.out.println(arr.get(1).get(0));
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        for (ArrayList<Integer> arrayElemento : arr) {
            for (Integer e : arrayElemento) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
