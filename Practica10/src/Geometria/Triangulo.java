package Geometria;

public abstract class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }



    @Override
    public void CalcularArea() {}

    @Override
    public void CalcularPerimetro() {}
    
}
