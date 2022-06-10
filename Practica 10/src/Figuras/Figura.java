package Figuras;

public abstract class Figura {
    public double area;
    public double perimetro;

    public abstract void CalcularArea();
    public abstract void CalcularPerim();

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
}
