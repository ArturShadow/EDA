package Figuras;
public class Triangulo extends Figura {

    public double lado1;
    public double lado2;
    public double base;
    public double alura;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAlura(double alura) {
        this.alura = alura;
    }

    public double getAlura() {
        return alura;
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
    public void CalcularArea() {
        // TODO Auto-generated method stub
        setAlura((getBase() * getAlura()/2));
    }

    @Override
    public void CalcularPerim() {
        // TODO Auto-generated method stub
        setPerimetro((getLado1()+getLado2()+getBase()));
    }
    
}
