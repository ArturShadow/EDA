package Geometria;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
        
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void CalcularArea() {
        double area = getLado()*getLado();
        setArea(area);
        
    }

    @Override
    public void CalcularPerimetro() {
        double perim = getLado() * 4;
        setPerimetro(perim);
        
    }
    
}
