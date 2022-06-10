package Geometria;

public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles() {
        super();
    }

    @Override
    public void CalcularArea() {
        double area = (getBase() * getAltura())/2; 
        setArea(area);
        super.CalcularArea();
    }
    
    @Override
    public void CalcularPerimetro() {
        double perimetro = (getLado1() * 2) + getBase();
        setPerimetro(perimetro);
        super.CalcularPerimetro();
    }
}
