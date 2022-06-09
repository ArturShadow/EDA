import Geometria.Cuadrado;
import Geometria.TrianguloIsosceles;

public class App {
    public static void main(String[] args) throws Exception {
        var cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        cuadrado.CalcularArea();
        System.out.println("El area del cuadrado es " + cuadrado.getArea());

        var triang = new TrianguloIsosceles();
        triang.getLado1(5);
    }
}
