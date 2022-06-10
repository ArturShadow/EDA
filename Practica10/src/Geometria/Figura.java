package Geometria;
public abstract class Figura {
    private double area;
    private double perimetro;

    public Figura() {
        super();
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract void CalcularArea();
    public abstract void CalcularPerimetro();
}
