package ArreglosUnidimensionales;

public class ArraysUnidimensionales {
    public static int[] SumaVectores(int[] v1, int[] v2) {
        int[] vRes = new int[v1.length];
        if(v1.length == v2.length){
            for (int i = 0; i < v1.length; i++) {
                vRes[i] = v1[i] + v2[i];
            }
        }
        return vRes;
    }

    public static int[] MultiplicacionVectores(int[] v1, int[] v2) {
        int[] vRes = new int[v1.length];
        for (int i = 0; i < vRes.length; i++) {
                vRes[i] = v1[i] * v2[i];
        }
        return vRes;
    }

    public static void MultMatz(int[][] m2) {
        int[][] mRes = new int[m2.length][m2[0].length];
        for (int i = 0; i < mRes.length; i++) {
            for (int j = 0; j < mRes[0].length; j++) {
                mRes[i][j] = m2[i][j] * 2;
            }
        }
        
        for (int i = 0; i < mRes.length; i++) {
            for (int j = 0; j < mRes[0].length; j++) {
                System.out.println(m2[i][j] + " * 2 = " + mRes[i][j]);
            }
        }
    }

    //Hacer un metodo que reciba un arreglo bidimensional y a los valores le reste uno
}
