
package Recursividad;

public class TemRecursividad {
    private int lim;

    public TemRecursividad() {
        lim = 1;
    }
    public void ImprNumero(int limInf, int limSup) {
       if(limInf <= limSup){
           System.out.print(limInf + "  ");
           ImprNumero(limInf+ 1, limSup);
       }
    }

    public void ImprNumero(int limSup) {
        if(lim <= limSup){
            System.out.print(lim + "  ");
            ImprNumero(lim+ 1, limSup);
        }
     }

     
}
